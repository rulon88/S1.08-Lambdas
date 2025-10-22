package level1.exercise2.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListJapaneseWords {

    private final List<String> words = Arrays.asList(
            "Yugen",        // profound mystery
            "Shinen",       // abyss
            "Kuroi ame",    // black rain
            "Saihate",      // the farthest place
            "Komorebi",
            "Kintsugi",
            "Mono no aware",
            "Satori",
            "Shibui",
            "Natsukashii"
    );

    public List<String> filterDeepWords() {
        return words.stream()
                .filter(w -> w.toLowerCase().contains("o") && w.length() > 5)
                .collect(Collectors.toList());
    }
}
