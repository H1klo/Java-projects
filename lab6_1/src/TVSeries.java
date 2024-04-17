import java.util.ArrayList;
import java.util.List;

public class TVSeries {
    String name;
    String producer;
    List<Episode> episodes = new ArrayList<>();


    public TVSeries(String name, String producer) {
        this.name = name;
        this.producer = producer;
    }
    public void addSeries(int number, String title, String storySynopsis){
        Episode episode= new Episode(number,title,storySynopsis,this);
        episodes.add(episode);
    }

    @Override
    public String toString() {
        String temp= "";

        for(Episode e:episodes){temp= temp.concat('\n' +e.toString() ); }
        return "TVSeries{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", episodes=" + temp+
                '}';
    }
}
