
import java.util.ArrayList;
import java.util.Scanner;

public class Executa_animais {

    public static void main(String[] args) {

        int qtdFemea=0, qtdMacho=0, qtdTotal=0;
        float perFemea=0, perMacho=0;
        
        Scanner leiaString = new Scanner(System.in);
        Scanner leia = new Scanner(System.in);
        String opcao = "S";
        Animais animal = new Animais();
        ArrayList<Animais> listaAnimais = new ArrayList<>();

        while (opcao.trim().equalsIgnoreCase("S")) {

            System.out.print("Informe o Sexo do animal :");
            animal.setSexo(leiaString.nextLine().charAt(0));

            System.out.print("Informe a altura do animal :");
            animal.setAltura(leia.nextFloat());

            System.out.print("Informe o peso do animal :");
            animal.setPeso(leia.nextFloat());
                  
            listaAnimais.add(animal);
            
            if((animal.getSexo() == 'f') || (animal.getSexo() == 'F')){
                qtdFemea++;
            }else{
                qtdMacho++;
            }
            qtdTotal++;
            
            System.out.print("Deseja Continuar [S/N] ?");
            opcao = leiaString.nextLine();
        }
        
        
        perFemea = (qtdFemea * 100) / qtdTotal;
        perMacho = (qtdMacho * 100) / qtdTotal;
        
        System.out.println("O numero de animais Machos foi = " + qtdMacho);
        System.out.println("O numero de animais Femeas foi = " + qtdFemea);
        System.out.println("O numero total de Animais foi  = " + qtdTotal);
        System.out.println("O percentual de animais Machos = " + perMacho);
        System.out.println("O percentual de animais Femeas = " + perFemea);
        if(qtdFemea > qtdMacho){
            System.out.println("Haviam mais animais Femeas.");
        }else if(qtdFemea < qtdMacho){
          System.out.println("Haviam mais animais Machos .");  
        }else{
            System.out.println("Numero de animais por sexo iguais.....");
        }
        
        for (Animais animalAtual : listaAnimais) {
            System.out.println(animalAtual.toString());
        }

    }
}
