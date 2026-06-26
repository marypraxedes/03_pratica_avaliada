package atividade03;

public class NotificacaoSMS extends Notificacao {

	public NotificacaoSMS(String telefone) {
        super(telefone);
    }

    @Override
    public void enviar(String mensagem) {

        Validacao.validarMensagem(mensagem);

        String telefone = getDestinatario();

        String telefoneFormatado = "("
                + telefone.substring(0, 2)
                + ") "
                + telefone.substring(2, 7)
                + "-"
                + telefone.substring(7);

        System.out.println("Enviando SMS para "
                + telefoneFormatado
                + " - Mensagem: "
                + mensagem);
    }
    
}
