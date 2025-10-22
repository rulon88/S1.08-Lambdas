package level1.exercise5.application;

import level1.exercise5.interfacepkg.PiValue;
import level1.exercise5.model.HarmonySymbol;

public class AppLambdas5 {

    public static void main(String[] args) {
        System.out.println("☯️ Harmony – Acceptance and Balance ☯️");
        System.out.println("In the eternal circle, opposites coexist in perfect rhythm.\n");

        PiValue piValue = () -> 3.1415;
        HarmonySymbol harmony = new HarmonySymbol();

        double result = harmony.calculateHarmony(piValue.getPiValue());

        System.out.println("Pi constant: " + piValue.getPiValue());
        System.out.println("Symbolic harmony (pi × 2): " + result);
        System.out.println("\nHarmony is achieved when both halves move as one.");
    }
}
