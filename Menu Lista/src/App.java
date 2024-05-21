import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //objetos 
        Aviao a1 = new Aviao("a1", 100, 600);
        Aviao a2 = new Aviao("a2", 40, 300);
        Helicoptero h1 = new Helicoptero("h1", 7, false);
        Helicoptero h2 = new Helicoptero("h2", 9, true);

        // Todos num Array
        ArrayList<Aeronave> lista = new ArrayList<>();
        lista.add(a1);
        lista.add(a2);
        lista.add(h1);
        lista.add(h2);
    
        Menu(lista);
    }

    public static void Menu(ArrayList<Aeronave> lista) {
        Scanner bot = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("0. Sair");
        System.out.println("1. Informações sobre as aeronaves");
        System.out.println("2. Cálculo dos custos de Voo");
        System.out.println("3. Adicionar um novo avião");
        System.out.println("4. Adicionar um novo helicóptero");
        

        int escolha = bot.nextInt();
        bot.nextLine();  // Consome a nova linha

        switch (escolha) {
            case 1:
                System.out.println("Informações sobre as aeronaves");
                for (Aeronave aeronave : lista) {
                    System.out.println(aeronave);
                }
                break;
            case 2:
                System.out.println("Cálculo dos custos de Voo");
                for (Aeronave aeronave : lista) {
                    System.out.println(aeronave.CalcularCustoDeVoo());
                }
                break;
            case 3:
                System.out.println("Adicionar um novo avião");
                System.out.print("Nome: ");
                String nomeAviao = bot.nextLine();
                System.out.print("Capacidade: ");
                int capacidadeAviao = bot.nextInt();
                System.out.print("Velocidade: ");
                int velocidadeAviao = bot.nextInt();
                bot.nextLine();  // Consome a nova linha
                Aviao novoAviao = new Aviao(nomeAviao, capacidadeAviao, velocidadeAviao);
                lista.add(novoAviao);
                System.out.println("Avião adicionado");
                break;
            case 4:
                System.out.println("Para adicionar um novo helicoptero, precisamos das seguintes informações");
                System.out.print("Nome: ");
                String nomeHelicoptero = bot.nextLine();
                System.out.print("Capacidade: ");
                int capacidadeHelicoptero = bot.nextInt();
                System.out.print("Tem Resgate aereo?: ");
                boolean resgate = bot.nextBoolean();
                bot.nextLine();  // Consome a nova linha
                Helicoptero novoHelicoptero = new Helicoptero(nomeHelicoptero, capacidadeHelicoptero, resgate);
                lista.add(novoHelicoptero);
                System.out.println("Helicóptero adicionado com sucesso!");
                break;
            case 0:
                System.out.println("Saindo do programa");
                bot.close();
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }
}
