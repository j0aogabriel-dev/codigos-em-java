
import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);
    static Gerenciador gerenciador = new Gerenciador();
    public static void main(String[] args) throws InterruptedException {
        int opcao;
        do {
            System.out.println(">>> Gerenciador de Tarefas <<<");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Excluir Tarefas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();// Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    try {
                        gerenciador.CriarTarefa();
                    } catch (InterruptedException e) {
                        System.out.println("Erro ao adicionar tarefa: " + e.getMessage());
                    }
                    break;

                    case 2:
                   gerenciador.ListarTarefas() ;
                   break;

                   case 3:
                   gerenciador.ExcluirTarefas();
                   break;

                   

                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        } while (opcao!=0);

      
      
       
        
       
    }
}
