import java.util.Scanner;

public class ExemploVetores {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetNumeros = new int[5];
        int i = 0;

        for(i = 0; i < 5; i++){
            System.out.println("Informe o " + i + "º elemento do vetor");
            vetNumeros[i] = leia.nextInt();

        }     

        

    }
}
