package projetoyoutube;
public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 5 de PHP");
        v[2] = new Video("Aula 10 de HTML");
        
        Gafanhoto g[] = new Gafanhoto[2];
        
        g[0] = new Gafanhoto("Rafael", 33, "M", "Rafa");
        g[1] = new Gafanhoto("Carina", 31, "F", "Ca");
        
        Visualizacao vis = new Visualizacao(g[0], v[2]);
        
        System.out.println(vis.toString());
        /*System.out.println("VIDEOS");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("GAFANHOTOS");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
    
}
