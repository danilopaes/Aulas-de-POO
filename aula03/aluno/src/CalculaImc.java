import java.util.Scanner;

public class CalculaImc {

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Informe o Peso do Aluno : ");
        aluno.peso = leia.nextFloat();

        System.out.print("Informe a Altura do Aluno : ");
        aluno.altura = leia.nextFloat();

       aluno.imc = aluno.CalculaImc(aluno.peso, aluno.altura);
       System.out.print("O IMC do Aluno é : " + aluno.imc);
    }
   
}
