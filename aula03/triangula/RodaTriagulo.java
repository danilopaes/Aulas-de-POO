package Classe_Utilizando_POO;
import java.util.Scanner;

public class RodaTriangulo{

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();

        System.out.print("Informe o valor da base do triangulo : ");
        triangulo.base = leia.nextFloat();

        System.out.print("Informe o valor da altura do triangulo : ");
        triangulo.altura = leia.nextFloat();

        triangulo.area = triangulo.calculaArea(triangulo.base, triangulo.altura);

        System.out.println("O valor da área é = " + triangulo.area);

    }

}