package by.bsac.dao.mariadbMovieDAO;

import by.bsac.connectionPool.ConnectionPool;
import by.bsac.movie.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MariadbMovieDAO {
    private static final String SELECT_BY_LAST_AND_THIS_YEAR = "SELECT name, date, country FROM movies " +
            "WHERE date >= '2018-01-01' AND date <= '2019-12-31'";
    private static final String DELETE_BY_YEAR = "DELETE FROM movies WHERE date > ?";

    public List<Movie> getMoviesOfLastAndThisYear() {
        List<Movie> listOfMovies = new ArrayList<>();

        Connection connection = ConnectionPool.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        try {
            preparedStatement = connection.prepareStatement(SELECT_BY_LAST_AND_THIS_YEAR);
            preparedStatement.execute();
            result = preparedStatement.getResultSet();

            while (result.next()) {
                listOfMovies.add(new Movie(result.getString(1), result.getDate(2), result.getString(3)));
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

        return listOfMovies;
    }

    public void deleteMoviesByYear(int year) {
        Connection connection = ConnectionPool.getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(DELETE_BY_YEAR);
            preparedStatement.setDate(1, Date.valueOf(String.valueOf(year) + "-01-01"));

            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                preparedStatement.close();
            } catch (Exception sse) {
                System.out.println(sse.getMessage());
            }
            ConnectionPool.closeConnection();
        }
    }
}
