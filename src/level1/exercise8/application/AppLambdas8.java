package level1.exercise8.application;

import level1.exercise8.interfacepkg.Reverser;

public class AppLambdas8 {

    public static void main(String[] args) {
        System.out.println("🌕 Light – Peace and Unity 🌕");
        System.out.println("When we look within, reflection becomes illumination.\n");

        Reverser reverser = text -> new StringBuilder(text).reverse().toString();

        String original = "Komorebi"; // light filtering through trees
        String reversed = reverser.reverse(original);

        System.out.println("Original word: " + original);
        System.out.println("Reversed word: " + reversed);
    }
}
