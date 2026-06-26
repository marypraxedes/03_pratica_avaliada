package atividade03;

public class TestaNotificacoes {

	public static void main(String[] args) {

	        testarEmailValido();
	        testarSMSValido();
	        testarMensagemVazia();
	        testarDestinatarioVazio();
	        testarTipoInexistente();
	    }


	    // Cria uma notificação conforme o tipo informado
	    public static void criarNotificacao(String tipo, String destinatario, String mensagem) {

	        Notificacao notificacao;

	        if (tipo.equalsIgnoreCase("Email")) {

	            notificacao = new NotificacaoEmail(destinatario);

	        } else if (tipo.equalsIgnoreCase("SMS")) {

	            notificacao = new NotificacaoSMS(destinatario);

	        } else {

	            throw new IllegalArgumentException("Tipo de notificação inexistente!");
	        }

	        notificacao.enviar(mensagem);
	    }


	    public static void testarEmailValido() {

	        System.out.println("\n=== Email Válido ===");

	        try {

	            criarNotificacao(
	                    "Email",
	                    "peter@email.com",
	                    "Bem-vindo ao sistema");

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }


	    public static void testarSMSValido() {

	        System.out.println("\n=== SMS Válido ===");

	        try {

	            criarNotificacao(
	                    "SMS",
	                    "11988887777",
	                    "Seu código é 1234");

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }


	    public static void testarMensagemVazia() {

	        System.out.println("\n=== Mensagem Vazia ===");

	        try {

	            criarNotificacao(
	                    "Email",
	                    "teste@email.com",
	                    "");

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }


	    public static void testarDestinatarioVazio() {

	        System.out.println("\n=== Destinatário Vazio ===");

	        try {

	            criarNotificacao(
	                    "SMS",
	                    "",
	                    "Olá usuário");

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }


	    public static void testarTipoInexistente() {

	        System.out.println("\n=== Tipo Inexistente ===");

	        try {

	            criarNotificacao(
	                    "WhatsApp",
	                    "11999999999",
	                    "Teste");

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

	}
