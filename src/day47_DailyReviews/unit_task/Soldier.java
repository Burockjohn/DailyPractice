package day47_DailyReviews.unit_task;

public class Soldier extends Unit {

    private int attackPower;

    public Soldier(int position, int health, int attackPower) {
        super(position, health);
        setAttackPower(attackPower);
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        if (attackPower <= 0) throw new RuntimeException("Attack power is can not be less than 1");
        this.attackPower = attackPower;
    }

    @Override
    public void attack(Unit unit) {
        System.out.println(getClass().getSimpleName() + " attacks with " + attackPower);
        unit.setHealth(unit.getHealth() - attackPower);

        try {
            if (unit.getHealth() <= 0) throw new AttackException();
        } catch (AttackException e) {
            System.out.println(e.getMessage());
        }
    }
}
