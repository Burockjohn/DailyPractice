package day41_DailyReviews.player;

public class Game {

    public static void main(String[] args) {

        Player player1 = new Player("Ryu", 24);
        Player player2 = new Player("Ken", 16);

        player1.hit(player2, 5);
        player2.hit(player1, 6);

        System.out.println(player1);
        System.out.println(player2);

    }


}
