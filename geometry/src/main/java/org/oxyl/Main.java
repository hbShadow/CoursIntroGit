package org.oxyl;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String [] args){
        System.out.println("It works");
        System.out.println("gjdfv");

        ArrayList<Integer> array = new ArrayList();
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(1);
        System.out.println(array);
        Map<Integer, String> map = new Map() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Object get(Object key) {
                return null;
            }

            @Override
            public Object put(Object key, Object value) {
                return null;
            }

            @Override
            public Object remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set keySet() {
                return null;
            }

            @Override
            public Collection values() {
                return null;
            }

            @Override
            public Set<Entry> entrySet() {
                return null;
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }
        };

        loop(20);
        System.out.println("gjdfv");
        System.out.println("gjdfv");
        System.out.println("gjdfv");
        System.out.println("gjdfv");
        System.out.println("gjdfv");
        System.out.println("gjdfv");
        System.out.println("gjdfv");
        System.out.println("gjdfv");



    }
    public static void loop(int i){
        while (i > 1){
            i--;
        }
    }
}
