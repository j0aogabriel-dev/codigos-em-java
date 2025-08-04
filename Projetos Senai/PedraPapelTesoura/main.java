package PedraPapelTesoura;
import java.util.Scanner;
public class main {
    static Scanner tec = new Scanner(System.in);
    static int escolhaUsuario, escolhaMaquina;
    static int empate, vitoria, derrota;
    public static void main(String[] args) throws InterruptedException {
        int menu;
        do {
            System.out.println(">>> Bem vindo ao menu do jogo <<<");
            System.out.println("1. Jogo Pedra, papel e tesoura");
            System.out.println("0. Sair");
            System.out.print("Escolha uma das opções acima: ");
            menu = tec.nextInt();
        if (menu == 0) {
            System.out.println("\nSaindo do jogo...");
            break;
        }

        if (menu <0 || menu >1) {
            System.out.println("\nOpção inválida! Tente novamente.\n");
            
        }

        do{
            System.out.println("\n>>> Jogo do Pedra, papel e tesoura <<<");
            System.out.println("1. Pedra");
            System.out.println("2. Papel");
            System.out.println("3. Tesoura");
            System.out.println("4. Estatísticas do jogo");
            System.out.println("0. voltar ao menu");
            System.out.print("Escolha uma opção: ");
            escolhaUsuario = tec.nextInt();

            if (escolhaUsuario == 0) {
                System.out.println("\nVoltando ao menu...\n");
            }

            if(escolhaUsuario <0 || escolhaUsuario >4){
                System.out.println("\nOpção inválida! Tente novamente.\n");
            }   

            escolhaMaquina = gerarJogadaComputador();
            System.out.println("\nVocê escolheu: " + nomeDasJogadas(escolhaUsuario));
            System.out.println("O computador escolheu: " + nomeDasJogadas(escolhaMaquina));

            if (escolhaUsuario == escolhaMaquina) {
                System.out.println("Empate! ");
                empate++;
                Thread.sleep(2000);
            }
            if ((escolhaUsuario == 1 && escolhaMaquina == 3)||
                (escolhaUsuario == 2 && escolhaMaquina == 1)||
                (escolhaUsuario == 3 &&escolhaMaquina == 2)) {
                    System.out.println("Você venceu!");
                    vitoria++;
                    Thread.sleep(2000);
            }
            else if (escolhaMaquina == 1 && escolhaUsuario == 3 ||
                     escolhaMaquina == 2 && escolhaUsuario == 1 ||
                     escolhaMaquina == 3 && escolhaUsuario == 2) {
                System.out.println("Você perdeu!");
                derrota++;
                Thread.sleep(2000);
            }

            if (escolhaUsuario == 4) {
                System.out.println("\n=== Estatísticas do Jogo ===");
                System.out.println("Vitórias: " + vitoria);
                System.out.println("Derrotas: " + derrota);
                System.out.println("Empates: " + empate);
                System.out.println("Total de partidas: " + (vitoria + derrota + empate));
                System.out.println("");
                Thread.sleep(3000);
                
            }


        }while(escolhaUsuario != 0);
        } while (menu <0 || menu >1 || menu != 0);

        

    }

    public static int gerarJogadaComputador(){
        return escolhaMaquina = (int)(Math.random() * 3) + 1; 
    }

    public static String nomeDasJogadas(int escolha) {
        return switch (escolha) {
            case 1 -> "Pedra";
            case 2 -> "Papel";
            case 3 -> "Tesoura";
            default -> "Opção inválida";
        };
    }
    
}