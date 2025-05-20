import java.time.LocalDateTime;
import java.util.ArrayList;

public class SistemaEstacionamento {

    public static void main(String[] args) {
        Veiculo meuVeiculo = new Veiculo("GVD1525",
                "Palio", "Fiat");
        Veiculo meuV = new Veiculo("Fiat",
                "XFV5512",
                "fusca");

        System.out.println("Placa: " + meuV.getPlaca() + "\n" +
                "Modelo: " + meuV.getModelo() + "\n" +
                "Marca: " + meuV.getMarca() );

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(meuVeiculo);

        System.out.println(veiculos.get(0).getPlaca());

        Vaga minhaVaga = new Vaga(meuVeiculo, LocalDateTime.now());
        System.out.println(minhaVaga.getVeiculo().getPlaca() + "\n"
                            + minhaVaga.getEntrada());

    }

}
