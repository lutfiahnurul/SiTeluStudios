import java.util.Scanner;

public class Story {
    private Scene startScene;
    private Character player;
    private Scanner scanner;

    public Story(Scene startScene, Character player) {
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        play();
    }

    public void play() {
        Scene currentScene = startScene;
        while (currentScene != null) {
            currentScene.displayScene();
            System.out.println("(Ketik INFO untuk melihat status karakter)");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("INFO")) {
                System.out.println("Nama: " + player.getName());
                System.out.println("Health: " + player.getHealth());
                System.out.println("XP: " + player.getXP());
                continue;
            }
            
            currentScene = currentScene.makeChoice(choice, player);
        }
        System.out.println("Permainan selesai.");
    }
}
