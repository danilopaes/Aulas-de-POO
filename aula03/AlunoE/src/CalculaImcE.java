//import AlunoE.CalculaImcE;
import java.util.Scanner;


public class CalculaImcE {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        AlunoE AlunoE = new AlunoE();

        System.out.print("Informe o peso do Aluno: ");
        AlunoE.setPeso(leia.nextFloat());

        System.out.print("Informe a Altura do Aluno: ");
        AlunoE.setAltura(leia.nextFloat());

        AlunoE.setImc(AlunoE.getPeso(), AlunoE.getAltura());
        System.out.print("O IMC do Aluno é : " + AlunoE.getImc());
    }
    
}
