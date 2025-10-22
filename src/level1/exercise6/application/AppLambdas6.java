package level1.exercise6.application;

import level1.exercise6.model.ListJapaneseWords;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class AppLambdas6 {

    public static void main(String[] args) {
        ListJapaneseWords list = new ListJapaneseWords();

        System.out.println("💞 Connection – Love and Integration 💞");
        System.out.println("When we align with others, every difference finds its rhythm.\n");
        System.out.println("Japanese words sorted from shortest to longest (by length):");

        List<String> sorted = list.getWords().stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        sorted.forEach(word -> System.out.println("• " + word));
    }
}
