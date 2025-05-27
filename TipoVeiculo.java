enum TipoVeiculo {

    CARRO_PEQUENO(16.0),
    CARRO_GRANDE(25.0),
    MOTO(8.0);

    private double valorPorHora;

    TipoVeiculo(double valorPorHora){
        this.valorPorHora = valorPorHora;
    }
    public double getValorPorHora(){
        return valorPorHora;
    }
}
