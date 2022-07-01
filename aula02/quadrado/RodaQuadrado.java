package Classe_Utilizando_POO;
import java.util.Scanner;

public class RodaQuadrado{

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();

        System.out.print("Informe o valor do lado do Quadrado : ");
        quadrado.lado = leia.nextFloat();
        quadrado.calculaArea(quadrado.lado);
        System.out.println("O valor da área é : " +quadrado.area);

    }

}