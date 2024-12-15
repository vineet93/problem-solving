package com.vineet.Tutort.ImplementHashmap;

public class Key {

    public int key;

    public Key(int k){
        this.key=k;
    }

    @Override
    public int hashCode(){
        return key%10;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;

        Key key1 = (Key) obj;
        return this.key == key1.key;
    }
}
