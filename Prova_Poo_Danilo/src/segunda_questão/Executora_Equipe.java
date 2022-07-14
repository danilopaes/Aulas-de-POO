package questao_II;

import java.util.Scanner;

public class Executora_Equipe {

    public static void main(String[] args) {

        Equipe equipe = new Equipe();
        Scanner leiaString = new Scanner(System.in);
        Scanner leia = new Scanner(System.in);
        String opcao = "S";
        Equipe equipeCampea = new Equipe();
        String nome1="", nome2="", nome3="";
        String cidade1="", cidade2="", cidade3="";
        int cont=0;
        
        while (opcao.trim().equalsIgnoreCase("S")) {

            cont++;
            
            System.out.print("Informe o nome da Equipe :");
            equipe.setNome(leiaString.nextLine());

            System.out.print("Informe a cidade da Equipe :");
            equipe.setCidade(leiaString.nextLine());
            
            System.out.print("Informe o nome do Técnico da Equipe :");
            equipe.setNomeTecnico(leiaString.nextLine());

            System.out.print("Informe o email da Equipe :");
            equipe.setEmail(leiaString.nextLine());

            System.out.print("Informe o Nº de pontos da Equipe :");
            equipe.setPontos(leia.nextInt());

            System.out.print("Informe o Nº de vitórias da Equipe :");
            equipe.setVitorias(leia.nextInt());

            System.out.print("Informe o saldo de gols da Equipe :");
            equipe.setSaldoGols(leia.nextInt());

            System.out.print("Informe a colocação final da Equipe :");
            equipe.setColocacao(leia.nextInt());            

            if(equipe.getColocacao() == 1){
                equipeCampea = equipe;
            }
            
            if(equipe.getColocacao() == 1){
                nome1   = equipe.getNome();
                cidade1 = equipe.getCidade();
            }else if(equipe.getColocacao() == 2){
                nome2   = equipe.getNome();
                cidade2 = equipe.getCidade();                
            }else if(equipe.getColocacao() == 3){
                 nome3   = equipe.getNome();
                 cidade3 = equipe.getCidade();               
            }
            
            System.out.print("Deseja Continuar [S/N] ?");
            opcao = leiaString.nextLine();
        }
        
        System.out.println("Número de Equipes = " + cont);
        System.out.println("Equipe Campeã : " + equipeCampea.toString());
        System.out.println("3ºColocado = " + nome3 + " " + cidade3);
        System.out.println("2ºColocado = " + nome2 + " " + cidade2);
        System.out.println("1ºColocado = " + nome1 + " " + cidade1);
    }
}
