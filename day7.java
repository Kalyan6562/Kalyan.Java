import java.util.Scanner;

public class day7 {
    private static final char[] MASK_SYMBOLS = {'@', '#', '$', '%', '&', '!'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] badWords = {
            "bad", "ugly", "stupid", "idiot", "hate",
            "sr university", "satish", "rajeshshekar", "donkey",
            "monkey", "waste fellow", "howle"
        };

        System.out.println("Enter your chat message:");
        String input = sc.nextLine();

        StringBuilder original = new StringBuilder(input);
        StringBuilder lowerShadow = new StringBuilder(input.toLowerCase());

        for (String word : badWords) {
            String lowerWord = word.toLowerCase();
            int idx = lowerShadow.indexOf(lowerWord);

            while (idx != -1) {
                String replacement = buildAsciiMask(lowerWord.length());

                original.replace(idx, idx + lowerWord.length(), replacement);
                lowerShadow.replace(idx, idx + lowerWord.length(), replacement.toLowerCase());

                idx = lowerShadow.indexOf(lowerWord, idx + replacement.length());
            }
        }

        System.out.println("Filtered Chat: " + original.toString());
        sc.close();
    }

    private static String buildAsciiMask(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(MASK_SYMBOLS[i % MASK_SYMBOLS.length]);
        }
        return sb.toString();
    }
}