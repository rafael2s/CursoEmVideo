package aula11;
public class Bolsista extends Aluno{
    private float bolsa;
    
    public void renovarBolda(){
        System.out.println("Renovando bolsa de " + this.nome);
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Facilitado");
    }
}
