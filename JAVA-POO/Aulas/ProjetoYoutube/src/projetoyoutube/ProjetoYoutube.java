package projetoyoutube;
public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 1");
        v[1] = new Video("Aula 2");
        v[2] = new Video("Aula 3");
        
        Gafanhoto g[] = new Gafanhoto[2];
        
        g[0] = new Gafanhoto("Rafael", 33, "M", "Rafa");
        g[1] = new Gafanhoto("Carina", 31, "F", "Ca");
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
    
}
