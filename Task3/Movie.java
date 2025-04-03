package Task3;

public class Movie extends Video {

    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        setRating(rating);
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Rating: " + getRating());
    }
}
