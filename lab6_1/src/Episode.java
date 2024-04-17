public class Episode {
    int number;
    String title;
    String storySynopsis;
    TVSeries tvSeries;

    public Episode(int number, String title, String storySynopsis,TVSeries tvSeries){
        this.number=number;
        this.title=title;
        this.storySynopsis=storySynopsis;
        this.tvSeries=tvSeries;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", storySynopsis='" + storySynopsis + '\'' +

                '}';
    }
}
