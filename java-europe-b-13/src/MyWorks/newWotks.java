package MyWorks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class newWotks {

	public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6));
        

        System.out.println(combineAL(list, list2));

      }

    private static ArrayList<String> combineAL(ArrayList<Integer> list, ArrayList<Integer> list2) {
        list.addAll(list2);
        ArrayList<String> temp = new ArrayList<>();
        for(int i = 0 ; i<list.size();i++) {
            temp.add(String.valueOf(list.get(i)));
           
        
            
        }
        return temp;
    } 
        
    }
