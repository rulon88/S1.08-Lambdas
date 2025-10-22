package level1.exercise7.application;

import level1.exercise7.model.ListJapaneseWords;

import java.util.Comparator;
import java.util.List;

public class AppLambdas7 {

    public static void main(String[] args) {
        ListJapaneseWords list = new ListJapaneseWords();

        System.out.println("Transformation – Rebirth and Clarity 🌗");
        System.out.println("When we reverse direction, new light appears.\n");
        System.out.println("Japanese words sorted from longest to shortest (by length):");

        List<String> sorted = list.getWords().stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();

        sorted.forEach(word -> System.out.println("• " + word));
    }
}
