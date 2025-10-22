package level1.exercise4.model;

import java.util.Arrays;
import java.util.List;

public class ListJapaneseWords {

    private final List<String> words = Arrays.asList(
            "Tsuki",     // moon
            "Kumo",      // cloud
            "Sabi",      // quietness
            "Hakanai",   // fleeting, impermanent
            "Yoru",      // night
            "Kage",      // shadow
            "Seijaku",   // stillness
            "Mizu",      // water
            "Kurai",     // darkness
            "Kokoro"     // heart, mind
    );

    public List<String> getWords() {
        return words;
    }
}
