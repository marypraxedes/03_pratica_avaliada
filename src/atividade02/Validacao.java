package atividade02;

public class Validacao {

	// Valida a aceleração informada
    public static void validarAceleracao(int aceleracao) {

        if (aceleracao <= 0) {
            throw new IllegalArgumentException("A aceleração deve ser maior que zero!");
        }
    }

    public static void validarNivelBateria(int bateria) {

        if (bateria < 0 || bateria > 100) {
            throw new IllegalArgumentException("O nível da bateria deve estar entre 0 e 100!");
        }
    }

    public static void validarBateriaSuficiente(int bateria, int consumo) {

        if (consumo > bateria) {
            throw new IllegalArgumentException("Bateria insuficiente para acelerar!");
        }
    }
}
