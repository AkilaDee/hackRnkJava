import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String arr [][] = new String[n][];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextLine().split("\\s+");
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (map.containsKey(arr[i][j].toLowerCase().trim())) {
                    // take the current count and add 1 to it
                    map.put(arr[i][j].toLowerCase().trim(), map.get(arr[i][j].toLowerCase().trim()) + 1);
                }
                else {
                    // add the word to the map for the first time
                    map.put(arr[i][j].toLowerCase().trim(), 1);
                }
            }
        }
        System.out.println(map.size());
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
        tm.putAll(map);
        for (Map.Entry<String, Integer>
                entry : tm.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());

        }

    }
   
}
