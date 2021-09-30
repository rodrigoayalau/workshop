package challenges;

import org.testng.Assert;

public class ThirdChallenge {

    /*
     * Create a function that takes two strings and returns true if either of the
     * strings appears at the very end of the other string. Return false otherwise.
     * The character * is a wildcard, so it can take the place of any character.
     *
     * Examples Overlap("ABC", "Ican'tsingmyABC") ➞ true Overlap("+=",
     * "this should work too +=") ➞ true
     */


    public static void main(String[] args) {
        Assert.assertTrue(overlap("ABC", "Ican'tsingmyABC"), "FALSE");
        Assert.assertTrue(overlap("abc", "Ican'tsingmyABC"), "FALSE");
        Assert.assertTrue(overlap("Ican'tsingmyABC", "abc"), "FALSE");

        Assert.assertFalse(overlap("hello world", "rld"), "TRUE");

        Assert.assertTrue(overlap("+=", "this should work too +="), "FALSE");
        Assert.assertTrue(overlap("hey", "*********"), "FALSE");

    }

    public static boolean overlap(String firstWord, String secondWord) {

        String firstWL = firstWord.toLowerCase();
        String secondWL = secondWord.toLowerCase();

        if (secondWL.length() > 3) {
            if (secondWL.endsWith(firstWL) || secondWL.contains("*")) {
                return true;
            } else {
                return false;
            }
        } else if (firstWL.endsWith(secondWL)) {
            return true;
        } else {
            return false;
        }
    }
}
