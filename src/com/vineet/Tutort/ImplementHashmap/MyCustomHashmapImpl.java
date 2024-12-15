package com.vineet.Tutort.ImplementHashmap;

public class MyCustomHashmapImpl {

    public static void main(String[] args) {

        MyCustomHashmap map = new MyCustomHashmap();
        map.put(new Key(10),"red");
        map.put(new Key(9),"blue");
        map.put(new Key(8),"green");
        map.put(new Key(10),"pink");
        System.out.println("HashMap Values Inserted");
        System.out.println("HashMap Retrieving Values");
        System.out.println(map.get(new Key(9)));
        System.out.println(map.get(new Key(8)));
        System.out.println(map.get(new Key(10)));

    }



}
