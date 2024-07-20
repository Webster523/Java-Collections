package lecture10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WhatIsSet {
    public static void main(String[] args) {
//        onlyOne();
        removeDuplicateElements();
    }

    private static void onlyOne() {
        Set<String> books = new HashSet<>();
        books.add("Hello");

        boolean result = books.add(new String("Hello"));
        System.out.println(result);

        System.out.println(books);
    }

    private static void removeDuplicateElements() {
        Set<String> stringSet = new HashSet<>();
        String[] strings = {"a", "b", "c", "c"};

        stringSet.addAll(Arrays.asList(strings));

        System.out.println(stringSet);
    }
}
