/*
 * Irfaan Khalid
 * 09/27/2017
 *
 * Description: Spongebobifies text via command line
 */

public class spongebobify {
    public static void main(String[] args) throws Exception {
        StringBuilder argsStringBuilder = new StringBuilder();

        // Concatenate elements of args
        for (String a : args) {
            argsStringBuilder.append(a).append(" ");
        }

        // Obtain and print String
        String input = argsStringBuilder.toString().trim();
        System.out.println("\n" + spongebobifyText(input) + "\n");
    }

    /**
     * spongebobify - returns the spongebobified version of an input String
     * @param input - user input
     * @return input, but spongebobified
     */
    private static String spongebobifyText(String input) {
        StringBuilder output = new StringBuilder();
        boolean makeUppercase = false; // Toggle case

        // Iterate through every char of the String and ensure the correct case
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                // Depending on toggle value, set char's case and append to the StringBuilder
                char newChar = makeUppercase ? Character.toUpperCase(c) : Character.toLowerCase(c);
                output.append(newChar);

                // Alternate toggle value
                makeUppercase = !makeUppercase;
            } else {
                // Append char c to the StringBuilder without changing toggle value
                output.append(c);
            }
        }

        // Return fully spongebobfied text
        return output.toString();
    }
}
