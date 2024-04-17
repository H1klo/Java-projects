public class MainTV {
    public static void main(String[] args) {
        TVSeries tvSeries = new TVSeries("Friends", "David Crane, Marta Kauffman");
        System.out.println(tvSeries);
        tvSeries.addSeries(1,"The Pilot","At the Central Perk coffee shop, Monica Geller is teased by her friends");

        tvSeries.addSeries(2,"The One with the Sonogram at the End","Carol, Ross' ex-wife, visits Ross at the museum");

        tvSeries.addSeries(3,"The One with the Thumb","At the beginning of the episode, Chandler helps Joey rehearse for an audition");
        System.out.println(tvSeries);
    }


}
