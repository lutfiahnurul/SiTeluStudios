import java.util.Scanner;

class Character {
    private String name;
    private int health;
    private int XP;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.XP = 0;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("\n" + name + " kehabisan health! GAME OVER!");
            System.exit(0);
        }
    }

    public void addXP(int additionalXP) {
        this.XP += additionalXP;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getXP() {
        return XP;
    }
}