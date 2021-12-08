import java.sql.Array;
import java.util.Arrays;
import java.util.Calendar;


public class Solution {
    public static String[] strings = {"Hello", "Hello", "World", "Java", "Tasks", "World"};

    public static void main(String[] args) {
        String[] drhgjgjhgjhgjh = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i] == strings[j + 1]) {
                    System.out.print(strings[i] + ", ");
                } else {
                    strings[i] = null;

                }
            }
        }
    }
}









