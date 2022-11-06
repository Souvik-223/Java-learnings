import java.util.HashSet;

public class tut18 {
    public static void towerofhanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("transer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerofhanoi(n - 1, src, dest, help);
        System.out.println("transer disk " + n + " from " + src + " to " + dest);
        towerofhanoi(n - 1, help, src, dest);
        // Its time cimplexity is O(2^n)
    }



    public static void printrev(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        printrev(str, index - 1);
    }



    public static int first = -1;
    public static int last = -1;

    public static void findoccurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentchar = str.charAt(idx);
        if (currentchar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
            findoccurance(str, idx + 1, element);
        }

    }



    public static boolean sorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] < arr[i + 1]) {
            return sorted(arr, i + 1);
        } else {
            return false;
        }
        // Its time complexetiy is O(n)
    }



    public static void movex(String str, int idx, int count, String newstr) {
        if (idx==str.length()) {
            for (int i = newstr.length(); i < count; i++) {
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if (currchar == 'x') {
            count++;
            movex(str, idx + 1, count, newstr);
        } else {
            newstr += currchar;
            movex(str, idx+1, count, newstr);
        }
    }



    public static boolean[] map = new boolean[26];
    public static void removeduplicate(String str, int idx, String newstr){
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if (map[currchar - 'a'] == true) {
             removeduplicate(str, idx+1, newstr);
        }
        else{
            newstr+=currchar;
            removeduplicate(str, idx+1, newstr);
            map[currchar-'a']=true;
        }
    }

    

    public static void subsequence(String str, int idx , String newstr){
        if (idx==str.length()) {
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        //To be 
        subsequence(str, idx+1, newstr+currchar);
        //Not to be 
        subsequence(str, idx+1, newstr);
    }



    public static void uniquesusbsequence(String str, int idx, String newstr, HashSet<String> set){
        if (idx==str.length()) {
            if (set.contains(newstr)) {
                return;

            } else {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
        char currchar = str.charAt(idx);
        //To be 
        uniquesusbsequence(str, idx+1, newstr+currchar,set);
        //Not to be
        uniquesusbsequence(str, idx+1, newstr,set);
    }



    public static String[] keypad = {".","abc","def","ghi","jkl" ,"mno","pqrs","tu","vwx","yz"};
    public static void combinations(String str, int idx, String combination){
        if (idx==str.length()) {
            System.out.println(combination);
            return;
        }
        char currchar = str.charAt(idx);
        String mapping = keypad[currchar-'0'];

        for (int i = 0; i < mapping.length(); i++) {
            combinations(str, idx+1, combination+mapping.charAt(i));
        }

    }
    public static void main(String[] args) {
        // Tower of hanoi:-
        // int n = 3;
        // String src = "S";
        // String help="H";
        // String dest="D";
        // towerofhanoi(n, src, help, dest);

        // Print a string in reverse:-
        // String str="abcd";
        // printrev(str, str.length()-1);

        // Find the 1st and last occurance of an element in the string
        // String str="abcaafaaah";
        // findoccurance(str, 0, 'a');

        // Check if an array is sorted(Strictly increasing)
        // int arr[]={1,2,3,4,5,11,7,8};
        // System.out.println(sorted(arr, 0));

        // Move all x to the end od the string
        // String word = "axbxcxxd";
        // movex(word, 0, 0, "");


        //Remove duplicates in the string
        // String str = "abbccda";
        // removeduplicate(str, 0,"");


        //Print att the subsequence of a string   - IMPORTANT
        // String str = "abc";
        // subsequence(str, 0, "");


        //Print all the unique subsequences of a string
        // String str = "aaa";
        // HashSet<String> set = new HashSet<>();
        // uniquesusbsequence(str,0,"",set);


        //Print keypad combinations
        String str = "23";
        combinations(str, 0, "");

    }
}
