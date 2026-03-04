import dev.iagocarvalho.screenmatch.calculation.TimeCalculator;
import dev.iagocarvalho.screenmatch.models.Movie;
import dev.iagocarvalho.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Me before you", 2016, 110);
        movie.rate(8.9);
        movie.rate(7.5);
        movie.rate(9.3);

        movie.showDetails();

        Series lost = new Series();
        lost.setName("Lost");
        lost.setNumSeasons(10);
        lost.setNumEpisodesBySeason(9);
        lost.setDurationMinutes(5000);

        lost.showDetails();

        Movie otherMovie = new Movie("Avatar", 2023, 200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.add(movie);
        calculator.add(lost);
        calculator.add(otherMovie);
        
        calculator.showDetails();
    }
}
