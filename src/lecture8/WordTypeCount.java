package lecture8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordTypeCount {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        createMap(myMap);
        System.out.println(myMap);
    }

    private static void createMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个英文句子:");
        String input = scanner.nextLine();

        var tokens = input.split(" ");
        for (String token : tokens) {
            String word = token.toLowerCase();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else
                map.put(word, 1);
        }
    }

//    My version
//    Map<String, Integer> map = new HashMap<>();
//
//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input a sentence: ");
//    String sentence = scanner.nextLine();
//    String[] tokens = sentence.split(" ");
//
//        for (String token : tokens) {
//        if (map.containsKey(token)) {
//            map.put(token, map.get(token) + 1);
//        } else {
//            map.put(token, 1);
//        }


}
