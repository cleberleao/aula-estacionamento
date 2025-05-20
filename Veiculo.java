public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
//    private String TipoVeiculo;

    public Veiculo(String placa, String modelo, String marca){
      this.placa = placa;
      this.modelo = modelo;
      this.marca = marca;
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
}
