package Task3;

public abstract class Video {
    private String title;
    private int duration;


    public Video(String title, int duration) {
        setTitle(title);
        setDuration(duration);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void getInfo() {
        System.out.println("Title: " + getTitle() + "\nDuration: " + getDuration() );
    }
}
