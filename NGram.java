import java.sql.ResultSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

class NGram {
    
    public static String getKeyFromValue(TreeMap<String, Integer> hm, int key) {
            for (Map.Entry<String,Integer> entry : hm.entrySet())  {
            if(entry.getValue()==key) {
                
                String s = entry.getKey();
                
                hm.remove(entry.getKey());
                return s;
            }
            
        }
            return null;
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n  = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();
        String arr [][] = new String[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine().split(" ");
        }
        
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= arr[i].length-w; j++) {
                String s ="";
                for (int j2 = j; j2 < j+w; j2++) {
                    if(j2!=j+w-1) {
                     s = s + arr[i][j2]+ ",";
                    }else {
                         s = s + arr[i][j2];
                    }
                    
                }
                if(hm.containsKey(s)) {
                    hm.put(s, hm.get(s)+1);
                }else {
                 hm.put(s, 1);
                }
            }
        }
        
        
        
        TreeMap<String, Integer> sorted = new TreeMap<>(hm); 
        ArrayList<Integer> values = new ArrayList<Integer>();
        ArrayList<String> keys = new ArrayList<String>();
        //System.out.println(sorted);
        for (Map.Entry<String,Integer> entry : hm.entrySet())  {
            
            values.add(entry.getValue());
            keys.add(entry.getKey());
        }
            
        Collections.sort(keys, Collections.reverseOrder());
        Collections.sort(values,Collections.reverseOrder());
        
        for (int i = 0; i < values.size(); i++) {
            System.out.println(getKeyFromValue(sorted,values.get(i)) + " " + values.get(i));
        }
    
        
        

    }
}
