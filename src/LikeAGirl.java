import java.util.Scanner;

public class LikeAGirl {
    /**
     * "Like a Girl," Super Bowl XLIX (2015) - <a href="https://www.youtube.com/watch?v=5yLXrWLvwAo">Like a Girl</a>
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {

        String scriptTemplateLine1 = "What does it mean to do something, \"%s\"?";
        String scriptTemplateLine2 = "Show me what it looks like to run, \"%s.\"%n";
        String scriptTemplateLine3 = "Show me what it looks like to fight, \"%s.\"";
        String scriptTemplateLine4 =
                "How do you think it affects them when somebody uses \"%s\" as an insult? Choice (good: %d, bad: %d) ";
        String scriptTemplateLine5 = "You answered %d%n%s.";
        String ansGood = "Always wants to change that.%nEmotional Damage %f";
        String ansBad = "Good for you.%nEmotional Damage %f";
        String likeAGirl = "Like a Girl";


        int good = 0;
        int bad = 1;
        float emotionalDamage = 0.0f;
        double dEmotionalDamage = 100.0;
        boolean trueOrFalse;
        Scanner s = new Scanner(System.in);

        System.out.println(String.format(scriptTemplateLine1, likeAGirl));
        System.out.printf(scriptTemplateLine2, likeAGirl);
        System.out.println(String.format(scriptTemplateLine3, likeAGirl));
        System.out.printf(scriptTemplateLine4, likeAGirl, good, bad);

        int answer = Integer.parseInt(s.nextLine());

        System.out.println(
                String.format(scriptTemplateLine5, answer,
                        (answer == good) ?
                                String.format(ansGood, dEmotionalDamage) : String.format(ansBad, emotionalDamage)
                )
        );

        trueOrFalse = (answer != good);
        System.out.printf("Did you answer like a nice person? %B%n", trueOrFalse);
    }
}
