package level1.exercise2.application;

import level1.exercise2.model.ListJapaneseWords;
import java.util.List;

public class AppLambdas2 {

    public static void main(String[] args) {
        ListJapaneseWords list = new ListJapaneseWords();
        List<String> result = list.filterDeepWords();

        System.out.println("🌒 Deep Japanese Words (Fear and Resistance)");
        System.out.println("Words containing 'O' and longer than five letters reflect inner depth,");
        System.out.println("echoing the weight of emotions we must face before renewal.\n");
        System.out.println("Filtered words:");

        result.forEach(word -> System.out.println("• " + word));
    }
}
