package day47_DailyReviews.unit_task;

public abstract class Unit {

    private int position, health;

    public Unit(int position, int health) {
        setPosition(position);
        setHealth(health);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health <= 0) {
            throw new RuntimeException("health can not be less than 1");
        }
        this.health = health;
    }

    public abstract void attack(Unit unit);

    public void move(int newPosition) {
        setPosition(newPosition);
        System.out.println("Player's new position is: " + newPosition);
    }

}
