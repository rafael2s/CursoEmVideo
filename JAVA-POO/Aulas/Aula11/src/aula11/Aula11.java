package aula11;
public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        
        v1.setNome("JOAO");
        v1.setIdade(22);
        v1.setSexo("M");
        
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        
        a1.setNome("RAFAEL");
        a1.setMatricula(724);
        a1.setCurso("TI");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        
        b1.setNome("Pedro");
        b1.setMatricula(2424);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
    
}
