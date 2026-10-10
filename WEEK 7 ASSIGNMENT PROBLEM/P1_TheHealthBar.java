class Character {
    private int health;
    private final int maxHealth;

    public Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int amount) {
        int newHealth = health - amount;
        if (newHealth < 0) {
            health = 0;
        } else {
            health = newHealth;
        }
    }

    public void heal(int amount) {
        int newHealth = health + amount;
        if (newHealth > maxHealth) {
            health = maxHealth;
        } else {
            health = newHealth;
        }
    }

    public int getHealth() {
        return health;
    }
}

public class P1_TheHealthBar {
    public static void main(String[] args) {
        Character c = new Character(100);
        c.takeDamage(30);
        System.out.println("health = " + c.getHealth());
        c.heal(50);
        System.out.println("health = " + c.getHealth() + " (capped)");
        c.takeDamage(150);
        System.out.println("health = " + c.getHealth() + " (floored)");
    }
}
