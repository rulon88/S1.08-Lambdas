package level1.exercise1.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListJapaneseWords {

    private final List<String> words = Arrays.asList(
            "Mono no aware",
            "Kintsugi",
            "Wabi-sabi",
            "Komorebi",
            "Shibui",
            "Yugen",
            "Shinrin-yoku",
            "Natsukashii",
            "Itadakimasu",
            "Satori"
    );

    public List<String> filterWordsWithO() {
        return words.stream()
                .filter(w -> w.toLowerCase().contains("o"))
                .collect(Collectors.toList());
    }
}
