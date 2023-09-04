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
                "How do you think it affects them when somebody uses \"Like a %s\" as an insult?";
        String script4_string = "You answered %s%n";
        String script5_1 = "Always wants to change that.%n";
        String script5_2 = "Good for you.%n";
        String script6_float = "Emotional Damage %f%n";
        String script7_bool = "Did you answer like a nice person? %b";
        String scriptChoice = "Choice (good: %s, bad: %s) ";
        String scriptDivider = "********************%n";
        String scriptInvalid = "Invalid input";
        String verbRun = "run";
        String verbFight = "fight";
        String genderBoy = "Boy";
        String good = "1";
        String bad = "2";
        String typeChar = "Alphabetic Characters";
        String typeSpec = "Special Characters.%n";
        String userString;

        float emotionalDamage = 0.0f;
        double dEmotionalDamage = 100.0;
        boolean trueOrFalse = false;
        char checksumChar;
        Scanner scanner = new Scanner(System.in);

        System.out.printf(script1_gender, genderBoy);
        System.out.printf(script2_verb_gender, verbRun, genderBoy);
        System.out.printf(script2_verb_gender, verbFight, genderBoy);
        System.out.printf(script3_gender, genderBoy);      //prompts user input

        boolean checksumOkay = false;
        boolean containsChar = false;
        boolean containsWhite = false;
        boolean containsSpecial = false;

        do {
            System.out.printf(scriptChoice, good, bad);
            userString = scanner.nextLine();

            for (int i = 0; i <= userString.length()-1; ++i) {
                checksumChar = userString.charAt(i);
                if (Character.isLetter(checksumChar) && !containsChar) {
                    containsChar = true;
                }
                if (Character.isWhitespace(checksumChar) && !containsWhite) {
                    containsWhite = true;
                }
                if (!Character.isLetterOrDigit(checksumChar) && !containsSpecial) {
                    containsSpecial = true;
                }
            }

            checksumOkay = (userString.equals(good) || userString.equals(bad));
            trueOrFalse = userString.equals(bad);

            //System.out.printf( !checksumOkay ? System.out.format(scriptInvalid, scriptChoice) : "");      //Canvas Discussion thread

        } while (!checksumOkay);

        System.out.printf(script4_string, userString);
        System.out.printf( (userString.equals(good)) ? script5_2 : script5_1 );
        System.out.printf(script6_float, emotionalDamage);
        System.out.printf(script7_bool, trueOrFalse);
    }
}
