package ExampleSolution.Matches;

public class MatchesProblems {
        // Check valid zip code - Must only contain numbers (no non-digits allowed).Must not contain any spaces.Must not be greater than 5 digits in length.
                 //zip.matches("[0-9]{5}");

        // Valid Phone number - (123) 456-7890
                //s.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}")

        // PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits
                //s.matches("\\d{4}|\\d{6}")

        // "Hey, did you think there is a BOMB?" - Using the match regular expression matches the entire sentence.
                 //s.matches("(?i).*(?<=bomb).*")
                         //(?i) turns on case-insensitive mode
                         //.* - matches any character (except for line terminators)
                         //?<= - (look behind assertion ) means look behind bomb or BOMB letter in a string
                         //.* - matches any character (except for line terminators) behind the word bomb or BOMB

    // Problem Statement - Create a function that takes an input (e.g. "5 + 4") and returns true if it's a
                        // mathematical expression or false if not.
                               // mathExpr("4*6") ➞ true
                               //mathExpr("4*no") ➞ false
    public static boolean mathExpr(String expr) {
        return expr.matches("\\d+\\s?[\\+\\*/%-]\\s?\\d+");
    }

    public static boolean mathExpr2(String expr) {
        return expr.replaceAll("[+\\/%\\-*0-9\\s]","").length()==0;
    }



}
