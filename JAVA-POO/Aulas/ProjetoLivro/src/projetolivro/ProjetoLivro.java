package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 20, "F");
        
        l[0] = new Livro("Aprendendo JAVA", "José da Sivla", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Maria José", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Ana Cristina", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes()); 
        System.out.println(l[1].detalhes()); 
    }
    
}
