import java.time.LocalDateTime;

public class Vaga {
    private Veiculo veiculo;
    private LocalDateTime entrada;

    public Vaga(Veiculo veiculo, LocalDateTime entrada){
        this.veiculo = veiculo;
        this.entrada = entrada;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }
}
