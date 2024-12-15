package com;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class Test {
    public static void main(String[] args) {


        String s = "3010:Vineet :| 2010:Amex :| 4010:Interview :| 1010:NA";

        String name = fetchNameBasedOnId("1010",s);
        System.out.println(name);
        
    }

    public static String fetchNameBasedOnId(String id,String str){

        Map<String,String> result = splitString(str);
        return result.get(id);

    }

    public static Map<String,String> splitString(String s){

        String[] str = s.split(":\\|");

        TreeSet<String> set = new TreeSet<>();
        HashMap<String,String> map = new HashMap<>();

        for(int i =0;i<str.length;i++){
            String[] val = str[i].split(":");
            set.add(val[0]);
            map.put(val[0],val[1]);
        }


//        for(String id:set){
//            if(map.containsKey(id)){
//                System.out.println(map.get(id));
//            }
//        }
        return map;
    }
}