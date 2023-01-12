public class TextQuest {
    Player player;
    Story story;

    public TextQuest(StoryPrinter storyPrinter) {
        player = new Player("Name", 1, 100);
        story = new Story(storyPrinter);
    }

    public void play() {
        story.play(player);
    }
}