public class Main {
    public static void main(String[] args) {
        StoryPrinter storyPrinter = new StoryConsolePrinter();
        TextQuest textQuest = new TextQuest(storyPrinter);
        textQuest.play();
    }
}