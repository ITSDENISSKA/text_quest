import java.util.Scanner;

public class TextSituation extends Situation{
    public interface MessageHandler{
        public void handleMessage(String message, Player player);
    }

    MessageHandler messageHandler;
    StoryPrinter storyPrinter;

    public TextSituation(
            String startMessage,
            MessageHandler messageHandler,
            StoryPrinter storyPrinter
    ) {
        super(startMessage, storyPrinter);
        this.messageHandler = messageHandler;
    }

    @Override
    public void play(Player player) {
        super.play(player);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        messageHandler.handleMessage(answer, player);
    }
}