package atividade01;

public class Validacao {

	public static void validarNome(String nome) {

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
    }

    public static void validarEmail(String email) {

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (email == null || !email.matches(regex)) {
            throw new IllegalArgumentException("E-mail inválido!");
        }
    }
}
