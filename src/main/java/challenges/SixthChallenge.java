package challenges;

import java.util.*;
import java.util.stream.Collectors;

public class SixthChallenge {
    /* *
    Create a function that takes two strings and determines if an anagram of the first string is in the second string.

    Anagrams of "bag" are "bag", "bga", "abg", "agb", "gab", "gba". Since none of those anagrams are in "grab", the answer is false.

    A "g", "a", and "b" are in the string "grab" but they're split up by the "r".

    Examples
    AnagramStrStr("car", "race") ➞ true

    AnagramStrStr("nod", "done") ➞ true

    AnagramStrStr("bag", "grab") ➞ false
    * */
    public static void main(String[] args) {
        anagram("car", "carerrr");
    }

    public static void anagram(String firstString, String secondString){

        String[] firstArray = firstString.split("");
        String[] secondArray = secondString.split("");

        List<String> firstList = new ArrayList<String>(Arrays.asList(firstArray));
        List<String> secondList = new ArrayList<String>(Arrays.asList(secondArray));

        Collections.sort(firstList);
        Collections.sort(secondList);

        List<String> newSecondList = new ArrayList<String>();


        //"Delete" extra letters
        secondList.forEach(word -> {
            if(firstList.contains(word)){
                newSecondList.add(word);
                System.out.println("second new list: " + word);
            }
        });

        // Delete duplicated letters
        List<String> newSecondListWithoutDuplicates = newSecondList.stream().distinct().collect(Collectors.toList());

        newSecondListWithoutDuplicates.forEach(word -> {
            System.out.println("second new list ws: " + word);
        });

        if(firstList.equals(newSecondListWithoutDuplicates)){
            System.out.println("are anagrams");
        } else {
            System.out.println("are not anagrams");
        }
    }
}
