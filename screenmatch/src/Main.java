import dev.iagocarvalho.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Avengers", 1970, true, 190);

        myMovie.rate(7.8);
        myMovie.rate(7.4);
        myMovie.rate(5);
        myMovie.showDetails();
    }
}
