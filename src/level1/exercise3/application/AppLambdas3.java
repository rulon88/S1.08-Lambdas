package level1.exercise3.application;

import level1.exercise3.model.ListJapaneseWords;

public class AppLambdas3 {

    public static void main(String[] args) {
        ListJapaneseWords list = new ListJapaneseWords();

        System.out.println("🔥 Flow – Anger and Movement 🔥");
        System.out.println("Energy released through motion becomes transformation.\n");
        System.out.println("Streaming words representing the flow of life:");

        list.getWords().forEach(word -> System.out.println("• " + word));
    }
}
