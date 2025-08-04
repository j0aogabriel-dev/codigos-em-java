package projetoTalvez;


import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args) throws InterruptedException {
        Scanner tec = new Scanner(System.in);
        Random gerador = new Random();

        int escolhaMaquina = gerador.nextInt(100) + 1; //Gera um número aleatoriao de 1 a 100;
        int opcao;
        int escolhaUsuario;
        int tentativas = 0;
        do {
            System.out.println(">>> Bem vindo ao menu jogo de advinhação <<<");
            System.out.println("1. Iniciar jogo");
            System.out.println("0. Sair");
            System.out.print("Esolha uma das opções acima: ");
            opcao = tec.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("=== Iniciando o jogo... ====");
                    Thread.sleep(2000); 
                    
                    System.out.println("\nA maquina está escolhendo um número...");
                    Thread.sleep(4000);// Pausa de 2 segundos para criar suspense kkk
                    
                    System.out.println("A maquina já definiu o número, agora é sua vez de adivinhar!");
                    do {
                        tentativas++;
                        Thread.sleep(1000);
                        System.out.print("\nTente adivinhar o número entre 1 e 100: ");
                        escolhaUsuario = tec.nextInt();
                        
                        if (escolhaUsuario > escolhaMaquina) {
                            System.out.println("O número é menor que " + escolhaUsuario + ". Tente novamente.");
                        }
                        if (escolhaUsuario < escolhaMaquina) {
                            System.out.println("O número é maior que " + escolhaUsuario + ". Tente novamente.");
                        }
                        if(escolhaUsuario == escolhaMaquina) {
                            System.out.println("\n##### Parabéns! Você adivinhou o número " + escolhaMaquina + " em " + tentativas + " tentativas.  ######\n");
                        }
                    } while (escolhaUsuario != escolhaMaquina);
                }

                case 0 -> System.out.println("\nSaindo do jogo...");
            
                default -> System.out.println("\nOpção invalida, tente novamente.");
            }
            
        } while (opcao != 0);

        System.out.println("Obrigado por jogar! :)");
        
    }
}