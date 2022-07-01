import javax.swing.text.PlainView;

public class Funcionario{
    
    private String nome;
    private char sexo;
    private String dataNascimento;
    private String cidadeNatal;
    private String cidadeResidencia;
    private byte numeroFilhos;
    private float salarioFamilia;


    public String getNome(){
        return nome;

    }

    public void setNome(String nome){
        this.nome = nome;

    }


    public byte getNumeroFilhos(){
        return numeroFilhos;
    }

    public void setNumeroFilhos(byte numeroFilhos){
        this.numeroFilhos = numeroFilhos;
    }

    public float getSalarioFamilia() {
        return salarioFamilia;
    }

    public void setSalarioFamilia(float salarioFamilia) {
        this.salarioFamilia = salarioFamilia;
    }

    public String getCidadeResidencia() {
        return cidadeResidencia;
    }

    public void setCidadeResidencia(String cidadeResidencia) {
        this.cidadeResidencia = cidadeResidencia;
    }

    public String getCidadeNatal() {
        return cidadeNatal;
    }

    public void setCidadeNatal(String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    

    public void calculaSalarioFamilia(){
        this.setSalarioFamilia((float)(this.numeroFilhos * 26.50));
    }

    public String sexoExtenso(char sexo){
        if((sexo == 'f') || (sexo == 'F')){
            return "Feminino"; 

        }else{
            return "Masculino";

        }
    }
}
