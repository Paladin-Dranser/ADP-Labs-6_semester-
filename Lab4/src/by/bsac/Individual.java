/*
    • Найти все фильмы, вышедшие на экран в текущем и прошлом году.
    • Вывести информацию об актерах, снимавшихся в заданном фильме.
    • Вывести информацию об актерах, снимавшихся как минимум в N фильмах.
    • Удалить все фильмы, дата выхода которых была более заданного числа лет назад.
 */
package by.bsac;

import by.bsac.Actor.Actor;
import by.bsac.dao.mariadbActorDAO.MariadbActorDAO;
import by.bsac.dao.mariadbMovieDAO.MariadbMovieDAO;
import by.bsac.movie.Movie;

import java.util.Arrays;
import java.util.List;

public class Individual {
    public static void main(String[] args) {
        // get all movies (last and this years);
        MariadbMovieDAO mariadbMovieDAO = new MariadbMovieDAO();
        List<Movie> listOfMovies = mariadbMovieDAO.getMoviesOfLastAndThisYear();
        System.out.println(Arrays.toString(listOfMovies.toArray()));

        // get actors of movie;
        MariadbActorDAO mariadbActorDAO = new MariadbActorDAO();
        List<Actor> listOfActors = mariadbActorDAO.getActorsByMovie("Rain");
        System.out.println(Arrays.toString(listOfActors.toArray()));

        // get actors where the number of movies >= N
        listOfActors.clear();
        listOfActors = mariadbActorDAO.getActorsByNumberOfMovies(2);
        System.out.println(Arrays.toString(listOfActors.toArray()));

        // delete movies if year > N
        mariadbMovieDAO.deleteMoviesByYear(2020);
    }
}
