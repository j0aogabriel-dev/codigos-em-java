
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerenciador {

    static Scanner scanner = new Scanner(System.in);
    static List<Tarefas> tarefas = new ArrayList<>();
    static Tarefas tarefaAtual = new Tarefas();

    public static void CriarTarefa() throws InterruptedException{
        System.out.println("\n >>> Adicionar Tarefa <<<");
        tarefaAtual.setId(tarefas.size() + 1); // Define o ID da tarefa como o tamanho atual da lista + 1

        System.out.print("Digite o título da tarefa: ");
        tarefaAtual.setTitulo(scanner.nextLine());

        System.out.print("Digite a descrição da tarefa: ");
        tarefaAtual.setDescricao(scanner.nextLine());

        LocalDateTime dataAtual = LocalDateTime.now();
        DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data de criação: "+ dataAtual.format(dataFormato));
        tarefaAtual.setDataCriacao(dataAtual);
       

        System.out.print("Digite o prazo da tarefa (formato: dd/MM/yyyy HH:mm): ");
        String prazo = scanner.nextLine();
        DateTimeFormatter formatoPrazo= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime prazoValor = LocalDateTime.parse(prazo,formatoPrazo);
        tarefaAtual.setPrazo(prazoValor);

        tarefaAtual.setConcluida(false); // Define a tarefa como não concluída inicialmente

        tarefas.add(tarefaAtual); //após o termino do cadastro, adiciona a tarefa à lista ;) kkkk
        
        
        System.out.println("=== Salvando Tarefa... ===");
        Thread.sleep(2000);
        System.out.println("_-_-_Tarefa cadastrada com sucesso! _-_-_\n");

    }

    public static void ListarTarefas() throws InterruptedException{
        System.out.println("\n >>> Listar Tarefas <<<");
        if(tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada.");
        }

        else{
            System.out.println("=== Listando Tarefas... ===");
            Thread.sleep(2000);
            for (Tarefas tarefa : tarefas){
                System.out.println("ID: "+ tarefa.getId());
                System.out.println("Título: "+ tarefa.getTitulo());
                System.out.println("Descrição: "+ tarefa.getDescricao());
                System.out.println("Data de Criação: "+ tarefa.getDataCriacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                System.out.println("Prazo: "+ tarefa.getPrazo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
                System.out.println("Concluida: "+ (tarefa.isConcluida()? "Sim" : "não"));
                System.out.println("-------------------------");
            }
            System.out.println("Total de tarefas: "+ tarefas.size());
            System.out.println("=========================");
        }
    }

    public static void ExcluirTarefas(){
        int id = scanner.nextInt();
        boolean tarefaEncontrada = false;
        do{
        System.out.println("\n >>> Excluir Tarefas <<<");
        if(tarefas.isEmpty()){
            System.out.println("Nenhum cadastro cadastrado.");
        }
       
        else{
            System.out.print("Digite o ID da tarefa que deseja ser exclida:");
            id = scanner.nextInt();
            scanner.nextLine(); 
        
            if(tarefaEncontrada == false && id <= 0 || id > tarefas.size()){
                System.out.println("ID inválido. Por favor, tente novamente.");
            }
   
            for(Tarefas tarefa : tarefas){
                if(id == tarefa.getId()){
                    tarefaEncontrada = true;
                    tarefas.remove(tarefa);
                    System.out.println("Tarefa com ID "+ id + "excluida com sucesso!");
                    break;
                
                }
            }
        }
    }while(tarefaEncontrada == false && id > 0 || id <= tarefas.size());
    }
}