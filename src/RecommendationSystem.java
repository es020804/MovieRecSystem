import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecommendationSystem {
    private File moviesFile;
    private Scanner moviesFileReader;
    public RecommendationSystem(){
        moviesFile = new File("out/production/MovieRecSystem/files/movies.txt");
        try {
            this.moviesFileReader = new Scanner(moviesFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Movie> recommendMovies(String[] favGenres){
        List<Movie> movies = new ArrayList<>();
        while (moviesFileReader.hasNext()){
            String[] movieDetails = moviesFileReader.nextLine().split(",");
            String[] genres = movieDetails[3].split(" ");
            if (contains(genres[0], favGenres)){
                movies.add(makeMovie(movieDetails));
            } else if (contains(genres[1], favGenres)) {
                movies.add(makeMovie(movieDetails));
            }
        }
        moviesFileReader.close();
        try {
            this.moviesFileReader = new Scanner(moviesFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return movies;
    }
    private boolean contains(String genre, String[] userGenres){
        for (String userGenre: userGenres){
            if (genre.equals(userGenre)){
                return true;
            }
        }
        return false;
    }

    private Movie makeMovie(String[] movieDetails){
        return new Movie(movieDetails[0], Integer.parseInt(movieDetails[1]), Double.parseDouble(movieDetails[2]), movieDetails[3].split(" "));
    }
    //Sci-Fi, Action, Drama, Crime, Thriller, Romance, Adventure, Fantasy, Animation, Biography, Comedy, Mystery, War
}