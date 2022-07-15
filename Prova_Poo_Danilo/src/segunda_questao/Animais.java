
public class Animais {
    private float peso;
    private char sexo;
    private float altura;

    public Animais(){
        
    }
    
    public Animais(float peso, char sexo, float altura) {
        this.peso = peso;
        this.sexo = sexo;
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getaltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}