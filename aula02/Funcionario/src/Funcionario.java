public class Funcionario{
    
    public String nome;
    public char sexo;
    public String dataNascimento;
    public String cidadeNatal;
    public String cidadeResidencia;
    public byte numeroFilhos;
    public float salarioFamilia;


    

    public void calculaSalarioFamilia(){
        this.salarioFamilia = (float)(this.numeroFilhos * 26.50);
    }

    public String sexoExtenso(char sexo){
        if((sexo == 'f') || (sexo == 'F')){
            return "Feminino"; 

        }else{
            return "Masculino";

        }
    }
}
