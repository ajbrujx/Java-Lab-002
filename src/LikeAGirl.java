import java.util.Scanner;

public class LikeAGirl {
    /**
     * "Like a Girl," Super Bowl XLIX (2015) - <a href="https://www.youtube.com/watch?v=5yLXrWLvwAo">Like a Girl</a>
     * @param args Command line arguments [The source file path, The target file path, ...]
     * @author Trevor Hartman
     * @author Atticus Blanco
     *
     * @since Version 1.0
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
        String scriptDivider = "********************";
        String scriptInvalid = "INVALID INPUT";
        String verbRun = "run";
        String verbFight = "fight";
        String genderBoy = "Boy";
        String good = "1";
        String bad = "2";
        String typeChar = "Alphabetic Characters%n";
        String typeSpecial = "Special Characters%n";
        String typeWhite = "Whitespace Characters%n";
        String userString;

        float emotionalDamage = 50.0f;
        Scanner scanner = new Scanner(System.in);

        System.out.printf(script1_gender, genderBoy);
        System.out.printf(script2_verb_gender, verbRun, genderBoy);
        System.out.printf(script2_verb_gender, verbFight, genderBoy);
        System.out.printf(script3_gender, genderBoy);

        boolean checksumOkay;
        boolean containsChar = false;
        boolean containsWhite = false;
        boolean containsSpecial = false;
        boolean trueOrFalse;
        char checksumChar;

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

            if (!checksumOkay) {
                System.out.println(scriptDivider + "\n" + scriptInvalid + "\n" + scriptDivider);
                System.out.printf(containsChar ? typeChar : "");
                containsChar = false;
                System.out.printf(!containsWhite && containsSpecial ? typeSpecial : "");
                containsSpecial = false;
                System.out.printf( (containsWhite && !containsSpecial) ? typeWhite : "");
                containsWhite = false;
                System.out.println(scriptDivider);
                }

        } while (!checksumOkay);

        System.out.printf(script4_string, userString);
        System.out.printf( (userString.equals(good)) ? script5_2 : script5_1 );
        System.out.printf(script6_float, emotionalDamage * Integer.parseInt(userString));       //pg 147
        System.out.printf(script7_bool, trueOrFalse);
    }
}
