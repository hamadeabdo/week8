package e1;

import java.util.*;
import java.util.function.Predicate;

public class application {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse"));
        System.out.println("Part 1 :");
        System.out.println(words);

        List<String> moldif = new ArrayList<>(words);
        Predicate<String> condition = word -> word.endsWith("e");
        System.out.println("Part 2 :");
        moldif.removeIf(condition);
        System.out.println(moldif);

        moldif.replaceAll(word -> word.toUpperCase());
        System.out.println("Part 3 :");
        System.out.println(moldif);

        moldif.removeIf(word -> word.length() < 6);
        System.out.println("Part 4 : ");
        System.out.println(moldif);


        System.out.println("Part 5 :");
        moldif.forEach(word -> System.out.println(word));





        }
    }
