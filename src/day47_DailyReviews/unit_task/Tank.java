package day47_DailyReviews.unit_task;

public class Tank extends Unit{

    private int defensePower;

    public Tank(int position, int health, int defensePower) {
        super(position, health);
        setDefensePower(defensePower);
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        if (defensePower <= 0) throw new RuntimeException("No way, it is not alive with this defence power :" + defensePower);
        this.defensePower = defensePower;
    }

    @Override
    public void attack(Unit unit) {
        System.out.println("\"Fırtına\" is coming");
    }

    public void defend(int attackPower) {
        System.out.println("Keep your position boys, defend till dieeeeeee!!!");
        defensePower -= attackPower;
    }
}
