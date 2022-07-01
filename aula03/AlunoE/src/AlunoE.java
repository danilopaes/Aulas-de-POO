public class AlunoE {

    private float peso;
    private float altura;
    private float imc;

    
    public float getPeso() {
        return peso;
    }
    public float getImc() {
        return imc;
    }
    public void setImc(float imc, float f) {
        this.imc = CalculaImc(peso, altura);
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float CalculaImc(float peso, float altura){
        return peso/(altura * altura);
    }
    
}
