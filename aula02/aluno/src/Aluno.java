public class Aluno {
    
    public float peso;
    public float altura;
    public float imc;

    public float CalculaImc(float peso, float altura){
        return peso/(altura * altura);
    }
}
