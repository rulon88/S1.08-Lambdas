package level1.exercise4.application;

import level1.exercise4.model.ListJapaneseWords;

public class AppLambdas4 {

    public static void main(String[] args) {
        ListJapaneseWords list = new ListJapaneseWords();

        System.out.println("🌒 Reflection – Solitude and Observation 🌒");
        System.out.println("Stillness reveals truth. Observation becomes understanding.\n");
        System.out.println("Japanese words reflecting silence and awareness:");

        list.getWords().forEach(System.out::println);
    }
}
