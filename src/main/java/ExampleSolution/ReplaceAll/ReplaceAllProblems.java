package ExampleSolution.ReplaceAll;

public class ReplaceAllProblems {

    // Remove all vowels from a sentence
          //s.replaceAll("[aAeEiIoOuU]","")

    // Remove all vowels with a specific character
          //str.replaceAll( "[aeiou]", String.valueOf(ch))

    // Removes all "special" characters - Only non-alphanumeric characters allowed are dashes -, underscores _ and spaces
         //s.replaceAll("[^\\w\\s-]","");
         //s.replaceAll("[^-_a-zA-Z0-9\\s]", "");

    // Takes a string, breaks it up and returns it with vowels first, consonants second
             //  (?i) turns on case-insensitive mode
                      //String str1 = str.replaceAll("(?i)[^aeiou]", "");
                      //String str2 = str.replaceAll("(?i)[aeiou]", "");

    // Replace the occurrence of the following words with Wurst
               //Replace multiple list of words with one
                     //s.replaceAll("(?i)Kielbasa|Chorizo|Moronga|Salami|Sausage|Andouille|Naem|
                     // Merguez|Gurka|Snorkers|Pepperoni","Wurst")

    // Problem Statement - Create a function that takes an input (e.g. "5 + 4") and returns true if it's a
              // mathematical expression or false if not.
                   // mathExpr("4*6") ➞ true
                   //mathExpr("4*no") ➞ false
    public static boolean mathExpr2(String expr) {
        return expr.replaceAll("[+\\/%\\-*0-9\\s]","").length()==0;
    }



}
