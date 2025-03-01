public class Movie {
    private String name ;
    private float ratings = 0.0f ;
    private Language language ;
    private Genre genre ;

    public Movie(String name, Language language, Genre genre) {
        this.name = name;
        this.language = language;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public float getRatings() {
        return ratings;
    }

    public Language getLanguage() {
        return language;
    }

    public Genre getGenre() {
        return genre;
    }
}
