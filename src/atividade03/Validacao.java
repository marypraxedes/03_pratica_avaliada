package atividade03;

public class Validacao {

	public static void validarMensagem(String mensagem) {

        if (mensagem == null || mensagem.trim().isEmpty()) {
            throw new IllegalArgumentException("Mensagem inválida!");
        }
    }


    public static void validarDestinatario(String destinatario) {

        if (destinatario == null || destinatario.trim().isEmpty()) {
            throw new IllegalArgumentException("Destinatário inválido!");
        }


        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        String telefoneRegex = "^\\d{11}$";


        if (!destinatario.matches(emailRegex)
                && !destinatario.matches(telefoneRegex)) {

            throw new IllegalArgumentException(
                    "Destinatário deve ser um e-mail ou telefone válido!");
        }
    }
}
