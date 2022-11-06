import java.util.ArrayList;

//These question sof recursions are mainly based on backtracking problems
public class tut19 {
    public static void permutations(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            // "abc" --> "ab"
            String newstr = str.substring(0, i) + str.substring(i + 1);
            permutations(newstr, permutation + currchar);
        }
    }

    public static int countpaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // move down
        int downpaths = countpaths(i + 1, j, n, m);
        // move up
        int upwards = countpaths(i, j + 1, n, m);

        return downpaths + upwards;
    }

    public static int placetiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vertically placed
        int vertically = placetiles(n - m, m);
        // horizontally placed
        int horizontally = placetiles(n - 1, m);
        return vertically + horizontally;
    }

    public static int callpeople(int n) {
        if (n <= 1) {
            return 1;
        }
        // singles
        int single = callpeople(n - 1);
        // Pairs
        int pair = (n - 1) * callpeople(n - 2);

        return single + pair;
    }

    public static void printsubsets(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void subsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printsubsets(subset);
            return;
        }

        // If added
        subset.add(n);
        subsets(n - 1, subset);

        // if not added
        subset.remove(subset.size() - 1);
        subsets(n - 1, subset);

    }

    public static void main(String[] args) {
        // Print all the permutations of the string
        // String str = "abc";
        // permutations(str, "");

        // count total paths in a maze to move from(0,0) to (n,m)
        // int n = 3;
        // int m = 3;
        // int totalpaths=countpaths(0, 0, n, m);
        // System.out.println(totalpaths);

        // place tile of size 1xm in a floor of nxm
        // int count=placetiles(4, 2);
        // System.out.println(count);

        // Find the no. of ways in which you can invite n people to your party, singles
        // or in pairs
        // int n = 4;
        // System.out.println(callpeople(n));

        // Print all the subsets of a set of first n natual numbers
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        subsets(n, subset);

    }
}
