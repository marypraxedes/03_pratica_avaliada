package atividade02;

public class Carro {

	private String modelo;
    private int velocidade;

    public Carro(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    // Aumenta a velocidade do veículo
    public void acelerar(int valor) {
        Validacao.validarAceleracao(valor);
        velocidade += valor;
    }

    public void visualizar() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}
