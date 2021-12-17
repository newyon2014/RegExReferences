package ExampleSolution.LookAheadLookBehind;

public class LookAheadLookBehindProblem {
           //  Inserts a white space between every instance of a lower character followed immediately by an upper character.
                 // "She?<=?=Walks?<=?=To?<=?=The?<=?=Beach" ➞ "She Walks To The Beach"
                        //s.replaceAll("([A-Z])", " $1").trim();
                        //s.replaceAll("(?<=[a-z])(?=[A-Z])", " ");
                                //?<= - (look behind assertion ) means look behind every lower case letter
                                //?= - (Look ahead assertion ) – Look ahead of every upper case letter
}
