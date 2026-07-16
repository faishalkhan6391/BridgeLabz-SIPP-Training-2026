public class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie(String movie) {
        System.out.println("Streaming Movie : " + movie);
    }

    @Override
    public void playGame(String game) {
        System.out.println("Playing Game : " + game);
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}