package level1.exercise7.model;

import java.util.Arrays;
import java.util.List;

public class ListJapaneseWords {

    private final List<String> words = Arrays.asList(
            "Ai",
            "Wa",
            "Heiwa",
            "Kokoro",
            "Nakama",
            "Hikari",
            "Kizuna",
            "Omoiyari",
            "Tomodachi",
            "Aishiteru"
    );

    public List<String> getWords() {
        return words;
    }
}
