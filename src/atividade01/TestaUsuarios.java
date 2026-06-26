package atividade01;

public class TestaUsuarios {

	public static void main(String[] args) {
		
		testarUsuarioValido();
        testarAdministradorValido();
        testarNomeInvalido();
        testarEmailInvalido();
    }

    public static void testarUsuarioValido() {

        System.out.println("\n=== Usuário Válido ===");

        try {

            Usuario usuario = new Usuario(
                    "Peter Parker",
                    "peter@email.com");

            usuario.visualizar();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void testarAdministradorValido() {

        System.out.println("\n=== Administrador Válido ===");

        try {

            Administrador admin = new Administrador(
                    "Anakin Skywalker",
                    "anakin@email.com",
                    "Administrador");

            admin.visualizar();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void testarNomeInvalido() {

        System.out.println("\n=== Nome Inválido ===");

        try {

            Usuario usuario = new Usuario(
                    "",
                    "teste@email.com");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void testarEmailInvalido() {

        System.out.println("\n=== Email Inválido ===");

        try {

            Usuario usuario = new Usuario(
                    "Luke",
                    "emailinvalido");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}

}
