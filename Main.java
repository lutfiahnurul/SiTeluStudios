import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan nama karakter: ");
            String playerName = scanner.nextLine();
            Character player = new Character(playerName, 100);
    
            // Membuat Scene
            Scene scene3 = new Scene("Kamu menemukan jalan keluar!", "", null, 0, 0, "", null, 0, 0, "", null, 0, 0);
            Scene scene2 = new Scene("Ada monster di depanmu!", "Lawan", scene3, 20, 50, "Kabur", scene3, 0, 30, "Berbicara", scene3, 10, 40);
            Scene scene1 = new Scene("Kamu berada di hutan gelap.", "Jalan lurus", scene2, 0, 10, "Belok kanan", scene2, 0, 10, "Mundur", scene2, 0, 10);
            
            Story story = new Story(scene1, player);
            story.start();
        }
    }
