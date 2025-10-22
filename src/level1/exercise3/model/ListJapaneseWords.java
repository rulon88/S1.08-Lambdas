package level1.exercise3.model;

import java.util.Arrays;
import java.util.List;

public class ListJapaneseWords {

    private final List<String> words = Arrays.asList(
            "Kaze",     // wind
            "Nami",     // wave
            "Hi",       // fire
            "Arashi",   // storm
            "Taiyo",    // sun
            "Hono",     // flame
            "Umi",      // sea
            "Tsubame",  // swallow (flight)
            "Hikari",   // light
            "Oto"       // sound
    );

    public List<String> getWords() {
        return words;
    }
}
