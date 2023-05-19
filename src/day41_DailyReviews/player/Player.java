package day41_DailyReviews.player;

public class Player {

    public String name;
    public int hitPower, health;

    public boolean isAlive;

    public Player(String name, int hitPower) {
        this.name = name;
        this.hitPower = hitPower;
        this.health = 100;
        this.isAlive = true;
    }

    public void hit(Player player, int num) {
        player.health -= num * this.hitPower;
        if (player.health < 0) player.health = 0;
        player.isAlive = (player.health > 0)? true : false;
    }

    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPower=" + hitPower +
                ", health=" + health +
                ", isAlive=" + isAlive +
                '}';
    }
}


/*

Instances variables:name,hitPower health(100),isAlive=true
Constructor:sets all fields
Actions:hit(you must check if hitted player alive or not),toString

 */