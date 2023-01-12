public class Situation {
    String startMessage;
    StoryPrinter storyPrinter;

    public Situation(String startMessage, StoryPrinter storyPrinter) {
        this.startMessage = startMessage;
        this.storyPrinter = storyPrinter;
    }

    public void play(Player player){
        storyPrinter.print("----------------");
        storyPrinter.print(startMessage);
    }
}