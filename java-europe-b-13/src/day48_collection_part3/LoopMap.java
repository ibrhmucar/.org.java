package day48_collection_part3;

import day46_collection_part1.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoopMap {
    public static void main(String[] args) {

        Map<String,String> dataMap = new HashMap<>();
        dataMap.put("url", "qa3.vytrack.com");
        dataMap.put("username", "user66");
        dataMap.put("password","abc66");
        dataMap.put("truckdriver", "Bob");
        dataMap.put("storemanager", "John");


        for (String key : dataMap.keySet()) {
            System.out.println(key);
           }

        for (String value : dataMap.values()) {
            System.out.println(value);
        }

        System.out.println("+++++Keys |  Values+++++++");

        System.out.println(dataMap.toString());

        for (String s : dataMap.keySet()){
            System.out.println(s + " | " + dataMap.get(s));

        }
        System.out.println("--------///------------");
        dataMap.forEach((a,b)-> System.out.println(a + "|" +b));



        Map<Integer, Product> studentMap = new HashMap<>();
        Map<String,String[]> data = new HashMap<>();
        Map<Integer, List<String>> data2 = new HashMap<>();
        Map<Integer,List<String[]>> data3 = new HashMap<>();
        Map<String, Map<Integer, Integer>> data4 = new HashMap<>();
        Map<String,Map<String,Product>> data5 = new HashMap<>();
















        }

    }






