package ru.job4j.codewars;

import java.util.HashMap;

class Key {
    String key;
    Key(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        int hash = key.charAt(0);
        System.out.println("hashCode for key: "
                + key + " = " + hash);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return key.equals(((Key) obj).key);
    }
}

class GFG {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(new Key("vishal"), 20);
        map.put(new Key("sachin"), 30);
        map.put(new Key("vaibhav"), 40);

        System.out.println();
        System.out.println("Value for key sachin: " + map.get(new Key("sachin")));
        System.out.println("Value for key vaibhav: " + map.get(new Key("vaibhav")));
    }
}
