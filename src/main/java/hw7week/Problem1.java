package main.java.hw7week;

class Character {

    private int health;
    private final int maxHealth;

    public Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int amount) {
        health -= amount;

        if (health < 0)
            health = 0;
    }

    public void heal(int amount) {
        health += amount;

        if (health > maxHealth)
            health = maxHealth;
    }

    public int getHealth() {
        return health;
    }
}

public class Problem1 {

    public static void main(String[] args) {

        Character c = new Character(100);

        c.takeDamage(30);
        System.out.println(c.getHealth());

        c.heal(50);
        System.out.println(c.getHealth());

        c.takeDamage(150);
        System.out.println(c.getHealth());
    }
}