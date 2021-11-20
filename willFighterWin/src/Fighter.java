import java.util.Arrays;

public class Fighter {
    private int health;
    private int damagePerHit;

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamagePerHit(int damagePerHit) {
        this.damagePerHit = damagePerHit;
    }

    // write getters for the fields
    public int getHealth() {
        return health;
    }

    public int getDamagePerHit() {
        return damagePerHit;
    }


    public boolean willFighterWin(Fighter firstFighter, Fighter secondFighter, int hits) {
        // write your code here
        if (firstFighter.getDamagePerHit() * hits >= secondFighter.getHealth()){
            return true;
        }
        return false;

    }


    public static void main(String[] args) {
        Fighter first = new Fighter();
        first.setDamagePerHit(10);
        Fighter second = new Fighter();
        second.setHealth(30);

        System.out.println(first.willFighterWin(first, second, 5));

    }
}





