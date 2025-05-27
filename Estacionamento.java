import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private Vaga[] vagas;

    public Estacionamento(int capacidade){
        this.vagas = new Vaga[capacidade];
    }

    public void estacoinar(Veiculo veiculo, int numeroVaga, LocalDateTime entrada){
        if(numeroVaga < 0 || numeroVaga >= vagas.length){
            System.out.println("Vaga inválida");
        }
        if(vagas[numeroVaga] != null){
            System.out.println("Vaga Ocupada");
        }
        vagas[numeroVaga] = new Vaga(veiculo, entrada);
    }

    public double sair(String placa, LocalDateTime saida){
        for (int i = 0; i < vagas.length; i++){
            Vaga vaga = vagas[i];
            if(vaga != null && vaga.getVeiculo().getPlaca().equalsIgnoreCase(placa)){
                double valor = calcularValor(vaga, saida);
                vagas[i]= null;
                return valor;
            }
        }
        return 0;
    }

    private double calcularValor(Vaga vaga, LocalDateTime saida) {
        Duration duracao = Duration.between(vaga.getEntrada(), saida);
        long minutos = duracao.toMinutes();
        long horas = minutos / 60;
        if(minutos % 60 != 0){
            horas++;
        }

        return horas * vaga.getVeiculo().getTipo().getValorPorHora();
    }

    public List<Integer> vagasOcupadas(){
        List<Integer> ocupadas = new ArrayList<>();
        for (int i=0; i < vagas.length; i++){
            if (vagas[i] != null){
                ocupadas.add(i);
            }
        }
        return ocupadas;
    }

    public List<Integer> vagasLivres(){
        List<Integer> livres = new ArrayList<>();
        for (int i=0; i < vagas.length; i++){
            if (vagas[i] == null){
                livres.add(i);
            }
        }
        return livres;
    }

    public  int totalVeiculos(){
        int count = 0;
        for (Vaga v : vagas){
            if (v != null){
                count++;
            }
        }
        return count;
    }
}
