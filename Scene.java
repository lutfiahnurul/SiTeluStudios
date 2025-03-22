import java.util.Scanner;

class Scene {
    private String description;
    private String choiceA, choiceB, choiceC;
    private Scene nextSceneA, nextSceneB, nextSceneC;
    private int damageA, damageB, damageC;
    private int XPA, XPB, XPC;

    public Scene(String description, String choiceA, Scene nextSceneA, int damageA, int XPA,
                 String choiceB, Scene nextSceneB, int damageB, int XPB,
                 String choiceC, Scene nextSceneC, int damageC, int XPC) {
        this.description = description;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.nextSceneA = nextSceneA;
        this.nextSceneB = nextSceneB;
        this.nextSceneC = nextSceneC;
        this.damageA = damageA;
        this.damageB = damageB;
        this.damageC = damageC;
        this.XPA = XPA;
        this.XPB = XPB;
        this.XPC = XPC;
    }

    public void displayScene() {
        System.out.println("\n" + description);
        System.out.println("A: " + choiceA);
        System.out.println("B: " + choiceB);
        System.out.println("C: " + choiceC);
        System.out.println("(Ketik INFO untuk melihat status karakter)");
    }

    public Scene makeChoice(String choice, Character player) {
        switch (choice.toLowerCase()) {
            case "a":
                player.takeDamage(damageA);
                player.addXP(XPA);
                return nextSceneA;
            case "b":
                player.takeDamage(damageB);
                player.addXP(XPB);
                return nextSceneB;
            case "c":
                player.takeDamage(damageC);
                player.addXP(XPC);
                return nextSceneC;
            case "info":
                System.out.println("\nStatus Karakter: " + player.getName());
                System.out.println("Health: " + player.getHealth());
                System.out.println("XP: " + player.getXP());
                return this;
            default:
                System.out.println("\nPilihan tidak valid. Coba lagi.");
                return this;
        }
    }
}