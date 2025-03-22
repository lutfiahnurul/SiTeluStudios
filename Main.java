public class Main {
    public static void main(String[] args) {
        Character player = new Character("Hero", 100);
        
        Scene scene3 = new Scene("Kamu menemukan jalan keluar!", "", null, 0, 50,
                "", null, 0, 50, "", null, 0, 50);
        Scene scene2 = new Scene("Ada monster di depanmu!", "Lawan", scene3, 20, 30,
                "Kabur", scene3, 10, 10, "Berbicara", scene3, 0, 20);
        Scene scene1 = new Scene("Kamu berada di hutan gelap.", "Jalan lurus", scene2, 0, 10,
                "Belok kanan", scene2, 5, 5, "Mundur", scene2, 0, 0);

        Story story = new Story(scene1, player);
        story.start();
    }
}
