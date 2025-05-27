import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEstacionamento {
    private static Estacionamento estacionamento;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite a capacidade do estacionamneto: ");
        estacionamento = new Estacionamento(sc.nextInt());
        sc.hasNextLine();

        while (true){
            System.out.println("Menu");
            System.out.println("Digite 1 para entrada");
            System.out.println("Digite 2 para saída");
            System.out.println("Digite 3 para vagas ocupadas");
            System.out.println("Digite 4 para vagas livres");
            System.out.println("Digite 5 para total de veículos");
            System.out.println("Digite 6 para sair");
            System.out.printf("Escolha: ");

            switch (sc.nextLine()){
                case "1":
                    entradaVeiculo(sc);
                    break;
                case "2":
                    saidaVeiculo(sc);
                    break;
                case "3":
                    System.out.println("Ocupadas: " + estacionamento.vagasOcupadas());
                    break;
                case "4":
                    System.out.println("Livres: " + estacionamento.vagasLivres());
                    break;
                case "5":
                    System.out.println("Total: " + estacionamento.totalVeiculos());
                    break;
                case "6":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }

    }

    private static void saidaVeiculo(Scanner sc) {
        try{
            System.out.println("Placa de Veículo: ");
            String placa = sc.nextLine();
            double valor = estacionamento.sair(placa, LocalDateTime.now());
            System.out.printf("Valor a pagar: %.2f%n", valor);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void entradaVeiculo(Scanner sc) {
        try {
            System.out.println("Placa: ");
            String placa = sc.nextLine();
            System.out.println("Modelo: ");
            String modelo = sc.nextLine();
            System.out.println("Marca: ");
            String marca = sc.nextLine();

            System.out.println("Tipo: 1-Pequeno, 2-Grande, 3-Moto");
            String opcaoTipo = sc.nextLine();
            TipoVeiculo tipo = null;
            switch (opcaoTipo){
                case "1":
                    tipo = TipoVeiculo.CARRO_PEQUENO;
                    break;
                case "2":
                    tipo = TipoVeiculo.CARRO_GRANDE;
                    break;
                case "3":
                    tipo = TipoVeiculo.MOTO;
                    break;
                default:
                    System.out.println("Tipo Inválido");
            }
            System.out.println("Vaga Desejada: ");
            int vaga = Integer.parseInt(sc.nextLine());
            estacionamento.estacoinar(
                    new Veiculo(placa, modelo, marca, tipo),
                    vaga,
                    LocalDateTime.now()
            );
            System.out.println("Estacionado com Sucesso! ");
        } catch (Exception e){
            e.getMessage();
        }
    }

}
