
package ativpooanimais;

public class Ratos extends Animais{
    private String raca;
    private String doenca;

    public Ratos() {
    }
    
    public Ratos(String raca, String doenca) {
        this.raca = raca;
        this.doenca = doenca;
    }

    public Ratos(String raca, String doenca, float peso, char sexo, String cor) {
        super(peso, sexo, cor);
        this.raca = raca;
        this.doenca = doenca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    @Override
    public String toString() {
        return "Ratos{ Cor:" + super.getCor() +  "raca=" + raca + ", doenca=" + doenca + '}';
    }
    
    
    
}
