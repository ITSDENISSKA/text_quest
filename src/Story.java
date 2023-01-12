public class Story {
    Situation [] situations;

    public Story(StoryPrinter storyPrinter) {
        situations = new Situation[]{
                new Situation("Привет.", storyPrinter),
                new TextSituation(
                        "Введите ваш ник:",
                        new TextSituation.MessageHandler() {
                            @Override
                            public void handleMessage(String message, Player player) {
                                storyPrinter.print("Теперь вас зовут " + message);
                                player.health -= 10;
                                storyPrinter.print(
                                        "Ваши новые характеристики:\n" +
                                                player.toString()
                                );
                            }
                        }, storyPrinter
                ),
                new Situation("Пока", storyPrinter)
        };
    }

    public void play(Player player) {
        for(Situation situation: situations){
            situation.play(player);
        }
    }
}