import java.util.Scanner;
import javax.annotation.processing.ProcessingEnvironment;

public class RodaFuncionario {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Informe o nome do Funcionario : ");
        funcionario.setNome(leia.nextLine());

        System.out.print("Informe o Sexo : ");
        funcionario.setSexo(leia.nextLine().charAt(0));

        System.out.print("Informe a Data de Nascimento : ");
        funcionario.setDataNascimento(leia.nextLine());

        System.out.print("Informe a Cidade Natal : ");
        funcionario.setCidadeNatal(leia.nextLine());

        System.out.print("Informe a Cidade de Residencia : ");
        funcionario.setCidadeResidencia(leia.nextLine());

        System.out.print("Informe o numero de Filhos : ");
        funcionario.setNumeroFilhos(leia.nextByte());

        funcionario.calculaSalarioFamilia();

        System.out.println(funcionario.getNome()+ "-" + funcionario.sexoExtenso(funcionario.getSexo()) + " R$" + funcionario.getSalarioFamilia());


    }

}
