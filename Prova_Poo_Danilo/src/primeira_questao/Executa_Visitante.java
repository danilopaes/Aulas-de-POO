package questao_I;

import static java.time.Clock.system;
import java.util.Scanner;

public class Executa_Visitante {

    public static void main(String[] args) {

        Visitante visitante = new Visitante();
        Scanner leiaString = new Scanner(System.in);
        Scanner leia = new Scanner(System.in);
        String opcao = "S";
        int contH=0, contM=0, totalVisitante=0, contMenor=0;
        float perHomens, perMulheres;

        while (opcao.trim().equalsIgnoreCase("S")) {

            System.out.print("Informe o nome do Visitante :");
            visitante.setNome(leiaString.nextLine());

            System.out.print("Informe o telefone do Visitante :");
            visitante.setFone(leiaString.nextLine());

            System.out.print("Informe a cidade do Visitante :");
            visitante.setCidade(leiaString.nextLine());

            System.out.print("Informe o bairro do Visitante :");
            visitante.setBairro(leiaString.nextLine());

            System.out.print("Informe o sexo do Visitante :");
            visitante.setSexo(leiaString.nextLine().charAt(0));
            
            System.out.print("Informe o ano de Nascimento do Visitante :");
            visitante.setAnoNascimento(leia.nextInt());            
            
            if((visitante.getSexo() == 'f') || (visitante.getSexo() == 'F')){
                contM++;
            }else{
                contH++;
            }
            
            if(visitante.getAnoNascimento() < 18 ){
               contMenor++; 
            }
           
            System.out.print("Deseja Continuar [S/N] ?");
            opcao = leiaString.nextLine();
        }
        
        totalVisitante = contH + contM;
        perHomens   = (contH*100)/totalVisitante;
        perMulheres = (contM*100)/totalVisitante;
        
        System.out.println("Total de Visitante : " + totalVisitante);
        System.out.println("Total de Homens    : " + contH);
        System.out.println("Total de Mulheres  : " + contM);
        System.out.println("Total de Visitantes Menores de idade : " + contMenor);
        System.out.println("Percentual de Homens : " + perHomens);
        System.out.println("Percentual de Mulheres : " + perMulheres);
        
        
    }
}
