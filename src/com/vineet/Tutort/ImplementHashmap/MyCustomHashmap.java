package com.vineet.Tutort.ImplementHashmap;

public class MyCustomHashmap {

    Entry[] hashmap = new Entry[10];

    public void put(Key key,String value){
        int index = getIndex(key);

        if(hashmap[index] == null){
            Entry node = new Entry(key,value);
            hashmap[index] = node;
        } else {

            Entry nodeSet = hashmap[index];

            while(nodeSet != null) {
                if (nodeSet.key.equals(key)) {
                    nodeSet.value = value;
                    return;
                } else if (nodeSet.next == null) {
                    Entry node = new Entry(key, value);
                    nodeSet.next = node;
                    return;
                } else {
                    nodeSet = nodeSet.next;
                }
            }
        }
    }

    public String get(Key key){
        int index = getIndex(key);

        if(hashmap[index] == null) {
            return null;
        }else{
            Entry nodeSet = hashmap[index];
            while(nodeSet != null){
                if(nodeSet.key.equals(key)){
                    return nodeSet.value;
                }else{
                    nodeSet = nodeSet.next;
                }
            }
        }
        return null;
    }

    public int getIndex(Key key){
        return  key.hashCode();
    }
}
