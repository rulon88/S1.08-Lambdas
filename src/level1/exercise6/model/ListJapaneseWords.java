package level1.exercise6.model;

import java.util.Arrays;
import java.util.List;

public class ListJapaneseWords {

    private final List<String> words = Arrays.asList(
            "Ai",          // love
            "Wa",          // harmony
            "Kokoro",      // heart
            "Tomodachi",   // friendship
            "Omoiyari",    // compassion
            "Heiwa",       // peace
            "Aishiteru",   // I love you
            "Nakama",      // companion
            "Hikari",      // light
            "Kizuna"       // bond, connection
    );

    public List<String> getWords() {
        return words;
    }
}
