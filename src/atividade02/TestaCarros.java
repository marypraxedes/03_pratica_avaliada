package atividade02;

public class TestaCarros {

	public static void main(String[] args) {
		

	        testarCarroValido();
	        testarOutroCarro();
	        testarAceleracaoInvalida();
	        testarBateriaInsuficiente();
	        testarBateriaNegativa();
	        testarBateriaAcimaDe100();
	    }

	    // Cria um carro elétrico e realiza a aceleração
	    public static CarroEletrico criarCarroEletrico(String modelo, int velocidade,
	            int bateria, int aceleracao) {

	        CarroEletrico carro = new CarroEletrico(modelo, velocidade, bateria);

	        carro.acelerar(aceleracao);

	        return carro;
	    }

	    public static void testarCarroValido() {

	        System.out.println("\n=== Porsche Taycan ===");

	        try {

	            CarroEletrico carro = criarCarroEletrico(
	                    "Porsche Taycan", 0, 80, 20);

	            carro.visualizar();

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	    
	    public static void testarOutroCarro() {

	        System.out.println("\n=== BMW i4 ===");

	        try {

	            CarroEletrico carro = criarCarroEletrico(
	                    "BMW i4", 10, 70, 30);

	            carro.visualizar();

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public static void testarAceleracaoInvalida() {

	        System.out.println("\n=== Aceleração Inválida ===");

	        try {

	        	criarCarroEletrico("Porsche Taycan", 0, 50, 0);

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public static void testarBateriaInsuficiente() {

	        System.out.println("\n=== Bateria Insuficiente ===");

	        try {

	        	criarCarroEletrico("BMW i4", 0, 5, 20);

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public static void testarBateriaNegativa() {

	        System.out.println("\n=== Bateria Negativa ===");

	        try {

	        	new CarroEletrico("Porsche Taycan", 0, -10);

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public static void testarBateriaAcimaDe100() {

	        System.out.println("\n=== Bateria Acima de 100% ===");

	        try {

	        	new CarroEletrico("Porsche Taycan", 0, 120);

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	}

}
