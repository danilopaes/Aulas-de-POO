package ativpooanimais;

import java.util.ArrayList;
import java.util.Scanner;

public class RodaAnimais {

    public static void main(String[] args) {
        ArrayList<Ratos> lista = new ArrayList<>();
        
        int exitNumber = 1;
        int totalMasc = 0;
        int totalFem = 0;
        float pesoTotal = 0;
        
        Scanner leia = new Scanner(System.in);
        Scanner leiaString = new Scanner(System.in);
        
        while(exitNumber != 0){
            Ratos r = new Ratos();
            
            System.out.println("Cadastro de Ratos");
           
           System.out.println("Informe o peso: ");
           r.setPeso(leia.nextFloat());
        
           System.out.println("Informe o sexo: ");
           r.setSexo(leia.next().toUpperCase().charAt(0));
           
           System.out.println("Informe a cor: ");
           r.setCor(leiaString.nextLine());
           
           System.out.println("Informe a raca: ");
           r.setRaca(leiaString.nextLine());
           
           System.out.println("Informe a doenca: ");
           r.setDoenca(leiaString.nextLine());
           
           if(r.getSexo() == 'M'){
               totalMasc++;
           }else{
               totalFem++;
           }
           
           pesoTotal += r.getPeso();
           
           lista.add(r);
           
           System.out.println("Deseja informar um novo registro: ");
           exitNumber = leia.nextInt();
        }
        
        System.out.println("Quantidade de elementos: " + lista.size());
        System.out.println("Quantidade de Masculinos: " + totalMasc);
        System.out.println("Quantidade de Feminos: " + totalFem);
        System.out.println("Peso Total: " + pesoTotal);
        
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).toString());
        }
        
    }
    
}
