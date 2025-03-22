import java.util.Scanner;

class Story {
    private Scene startScene;
    private Character player;
    private Scanner scanner;

    public Story(Scene startScene, Character player) {
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        Scene currentScene = startScene;
        while (currentScene != null) {
            currentScene.displayScene();
            System.out.print("\nMasukkan pilihan (A/B/C): ");
            String choice = scanner.nextLine();
            currentScene = currentScene.makeChoice(choice, player);
        }
        System.out.println("\nPermainan selesai.");
    }
}