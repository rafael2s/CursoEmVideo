package primeiroprograma;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        System.out.println("O idioma do sistema é:");
        System.out.println(local.getDisplayLanguage());
    }
}
