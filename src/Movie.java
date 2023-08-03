public class Movie {
    private String name;
    private int yearOfRelease;
    private double stars;
    private String[] genres;

    public Movie(String name, int yearOfRelease, double stars, String[] genres) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.stars = stars;
        this.genres = genres;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public double getStars() {
        return this.stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public String[] getGenres() {
        return this.genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

}
