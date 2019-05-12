package by.bsac.dao.mariadbActorDAO;

import by.bsac.Actor.Actor;
import by.bsac.connectionPool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MariadbActorDAO {
    private static final String SELECT_BY_MOVIE = "SELECT full_name, birth FROM actors " +
            "JOIN movie_actors ON actors.id = movie_actors.actor_id " +
            "JOIN movies ON movies.id = movie_actors.movie_id " +
            "WHERE movies.name = ?";
    private static final String SELECT_BY_THE_NUMBER_OF_MOVIES = "SELECT full_name, birth FROM " +
            "(SELECT full_name, birth, actor_id, COUNT(actor_id) as the_number_of_movies from movie_actors " +
            "JOIN actors ON actors.id = movie_actors.actor_id GROUP BY actor_id) AS subquery " +
            "WHERE the_number_of_movies > ?";

    public List<Actor> getActorsByMovie(String movie) {
        List<Actor> listOfActor = new ArrayList<>();

        Connection connection = ConnectionPool.getConnection();

        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        try {
            preparedStatement = connection.prepareStatement(SELECT_BY_MOVIE);
            preparedStatement.setString(1, movie);
            preparedStatement.execute();
            result = preparedStatement.getResultSet();

            while (result.next()) {
                listOfActor.add(new Actor(result.getString(1), result.getDate(2)));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                result.close();
            } catch (Exception rse) {
                System.out.println(rse.getMessage());
            }
            try {
                preparedStatement.close();
            } catch (Exception sse) {
                System.out.println(sse.getMessage());
            }

            ConnectionPool.closeConnection();
        }

        return listOfActor;
    }

    public List<Actor> getActorsByNumberOfMovies(int numberOfMovies) {
        List<Actor> listOfActor = new ArrayList<>();

        Connection connection = ConnectionPool.getConnection();

        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        try {
            preparedStatement = connection.prepareStatement(SELECT_BY_THE_NUMBER_OF_MOVIES);
            preparedStatement.setInt(1, numberOfMovies - 1);
            preparedStatement.execute();
            result = preparedStatement.getResultSet();

            while (result.next()) {
                listOfActor.add(new Actor(result.getString(1), result.getDate(2)));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                result.close();
            } catch (Exception rse) {
                System.out.println(rse.getMessage());
            }
            try {
                preparedStatement.close();
            } catch (Exception sse) {
                System.out.println(sse.getMessage());
            }

            ConnectionPool.closeConnection();
        }

        return listOfActor;
    }
}
