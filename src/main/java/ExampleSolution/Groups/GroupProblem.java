package ExampleSolution.Groups;

public class GroupProblem {
          // Write a function that swaps the X and Y coordinates in a string.
                   // swapXY("(1, 2), (3, 4)") ➞ "(2, 1), (4, 3)"

                       // (-11, 222), (409, 99)
                                //\((-?\d+)\,\s(-?\d+)\)\,\s\((-?\d+)\,\s(-?\d+)\)
                                //\( - escape the open bracket char
                                //(-?\d+) – FIRST group with digit -ve integer optional
                                //\,  - followed by comma with  escape the comma char
                                //\s – followed by a space
                                //(-?\d+) – repeat SECOND group
                                //\) - followed by close bracket escape the close bracket
                                //\, - followed by comma with  escape the comma char
                                //\s – followed by a space
                                //\( - - escape the open bracket char
                                //(-?\d+) - –THIRD group
                                //\, - followed by comma with  escape the comma char
                                //\s(-?\d+)\) - followed by a space + repeat FOURTH group

    public static String swapXY(String str) {
        return str.replaceAll("\\((-?\\d+)\\,\\s(-?\\d+)\\)\\,\\s\\((-?\\d+)\\,\\s(-?\\d+)\\)" , "($2, $1), ($4, $3)");
    }
    public static String swapXY2(String str) {
        return str.replaceAll("\\(([\\d\\-]+), ([\\d\\-]+)\\)","($2, $1)");
    }


}
