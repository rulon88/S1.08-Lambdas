package level1.exercise1.application;

import level1.exercise1.model.ListJapaneseWords;
import java.util.List;

public class AppLambdas1 {

    public static void main(String[] args) {
        ListJapaneseWords list = new ListJapaneseWords();
        List<String> result = list.filterWordsWithO();

        System.out.println("🌀 Japanese Words Resonating with 'O' Sound 🌀");
        System.out.println("In Japanese aesthetics, sounds containing 'O' or 'OU' often evoke depth,");
        System.out.println("calmness, and continuity — just like fractal patterns in nature.\n");
        System.out.println("Filtered words (those that carry this resonance):");

        result.forEach(word -> System.out.println("• " + word));
    }
}
