import java.util.Scanner;

public class LikeAGirl {
    /**
     * "Like a Girl," Super Bowl XLIX (2015) - <a href="https://www.youtube.com/watch?v=5yLXrWLvwAo">Like a Girl</a>
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {

        String script1_gender = "What does it mean to do something, \"Like a %s\"?%n";
        String script2_verb_gender = "Show me what it looks like to %s, \"Like a %s.\"%n";
        String script3_gender =
                "How do you think it affects them when somebody uses \"Like a %s\" as an insult? %s";
        String script4_value = "You answered %d%n";
        String script5_1 = "Always wants to change that.%n";
        String script5_2 = "Good for you.%n";
        String script6_float = "Emotional Damage %f%n";
        String script7_bool = "Did you answer like a nice person? %b";
        String scriptChoice = "Choice (good: %d, bad: %d) ";
        String verbRun = "run";
        String verbFight = "fight";
        String genderBoy = "Boy";

        int good = 1;
        int bad = 2;
        float emotionalDamage = 0.0f;
        double dEmotionalDamage = 100.0;
        boolean trueOrFalse = false;
        Scanner s = new Scanner(System.in);

        /*

        soutf(script1_gender, genderBoy);                                               //"Like a Boy" prompt
        soutf(script2_verb_gender, verbRun, genderBoy);
        soutf(script2_verb_gender, verbFight, genderBoy);
        soutf(script3_gender, genderBoy, String.format(scriptChoice, good, bad) );      //prompts user input

        do {                                                                            //userInput checksum
            userInput = scanner.nextInt();
            if (userInput != 1 && userInput != 2) {
                soutf(scriptInvalid, String.format(scriptChoice, good, bad) );
            }
        } while (userInput != 1 && userInput != 2);

        soutf(script4_value, userInput, (userInput == good) ? (script5_2 : script5_1) );
        soutf(scriptDamage_float, emotionalDamage);
        soutf(script6, trueOrFalse);

        */

        System.out.printf(script1_gender, genderBoy);
        System.out.printf(script2_verb_gender, verbRun, genderBoy);
        System.out.printf(script2_verb_gender, verbFight, genderBoy);
        System.out.printf(script3_gender, genderBoy, String.format(scriptChoice, good, bad) );      //prompts user input

        int answer = Integer.parseInt(s.nextLine());

        //BRANCH for checksum

        System.out.printf(script4_value, answer, (answer == good) ? script5_2 : script5_1);
        System.out.printf(script6_float, emotionalDamage);
        System.out.printf(script7_bool, trueOrFalse);



        /*
        ********************************************
        String scriptTemplateLine1 = "What does it mean to do something, \"%s\"?";
        String scriptTemplateLine2 = "Show me what it looks like to run, \"%s.\"%n";
        String scriptTemplateLine3 = "Show me what it looks like to fight, \"%s.\"";
        String scriptTemplateLine4 =
                "How do you think it affects them when somebody uses \"%s\" as an insult? Choice (good: %d, bad: %d) ";
        String scriptTemplateLine5 = "You answered %d%n%s.";
        String ansGood = "Always wants to change that.%nEmotional Damage %f";
        String ansBad = "Good for you.%nEmotional Damage %f";
        String likeAGirl = "Like a Girl";
        *************************************************
         */

        /*
        *******************************************
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
        ******************************************************
        */
    }
}
