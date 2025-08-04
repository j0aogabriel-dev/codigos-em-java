import java.util.Scanner;

// Nome da classe com letra maiúscula (convenção)
public class main {
    static Scanner tec = new Scanner(System.in);
    // Variáveis para armazenar as temperaturas
    static double celsius, fahrenheit, kelvin;
    static int opcao;

    public static void main(String[] args) {

        do {
            System.out.println("\n>>> Conversor de Temperatura <<<");
            System.out.print("Digite a temperatura em Celsius: ");
            celsius = tec.nextDouble();

            System.out.println("\n=== Opções de Conversão ===");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Celsius para Kelvin");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = tec.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Você escolheu converter Celsius para Fahrenheit.");
                    converterFahrenheit();
                }

                case 2 -> {
                    System.out.println("Você escolheu converter Celsius para Kelvin.");
                    converterKelvin();
                }
                
                case 0 -> System.out.println("Saindo do programa...");

                default -> System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);
        tec.close(); 
    }

    public static void converterFahrenheit() {

         fahrenheit = (celsius * 1.8) + 32;


        System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
    }

    public static void converterKelvin() {
         kelvin = celsius + 273.15;

        System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);
    }

}