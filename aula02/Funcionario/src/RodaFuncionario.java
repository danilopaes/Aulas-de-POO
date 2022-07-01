import java.util.Scanner;
import javax.annotation.processing.ProcessingEnvironment;

public class RodaFuncionario {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Informe o nome do Funcionario : ");
        funcionario.nome = leia.nextLine();
        System.out.print("Informe o Sexo : ");
        funcionario.sexo = leia.nextLine().charAt(0);
        System.out.print("Informe a Data de Nascimento : ");
        funcionario.dataNascimento = leia.nextLine();
        System.out.print("Informe a Cidade Natal : ");
        funcionario.cidadeNatal = leia.nextLine();
        System.out.print("Informe a Cidade de Residencia : ");
        funcionario.cidadeResidencia = leia.nextLine();
        System.out.print("Informe o numero de Filhos : ");
        funcionario.numeroFilhos = leia.nextByte();

        funcionario.calculaSalarioFamilia();

        System.out.println(funcionario.nome + "-" + funcionario.sexoExtenso(funcionario.sexo) + " R$" + funcionario.salarioFamilia);


    }

}
