public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private TipoVeiculo tipo;

    public Veiculo(String placa, String modelo, String marca, TipoVeiculo tipo){
      this.placa = placa;
      this.modelo = modelo;
      this.marca = marca;
      this.tipo = tipo;
    }

    public String getPlaca(){
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public TipoVeiculo getTipo(){
        return tipo;
    }
}
