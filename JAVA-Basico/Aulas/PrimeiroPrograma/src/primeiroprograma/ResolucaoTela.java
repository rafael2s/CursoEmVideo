package primeiroprograma;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tela = tk.getScreenSize();
        System.out.println("A resolução do seu simtema é: " + tela.width + " X " + tela.height);
    }
}
