import java.util.Scanner;

public class CalculaFuncao {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        ZeroDaFuncao funcao = new ZerosDaFuncao();
        
        System.out.print("Informe o Valor de A: ");
        funcao.setA(leia.nextInt());

        Sytem.out.print("Informe o Valor de B: ");
        funcao.setB(leia.nextInt());

        Sytem.out.print("Informe o Valor de C: ");
        funcao.setC(leia.nextInt());
    }
    
}
