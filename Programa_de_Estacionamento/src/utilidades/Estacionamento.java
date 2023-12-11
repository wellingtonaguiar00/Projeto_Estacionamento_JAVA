package utilidades;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Estacionamento {
	private double precoInicial = 0;
	private double precoPorHora = 0;
	private List<String> veiculos = new ArrayList<>();
	
	
	public Estacionamento(double precoInicial, double precoPorHora) {
		this.precoInicial = precoInicial;
		this.precoPorHora = precoPorHora;
	}
	
	public void adicionarVeiculo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a placa do veiculo para estacionar: ");
		String placa = sc.nextLine();
		
		if(!placa.trim().isEmpty()) {
			veiculos.add(placa.toUpperCase());
			System.out.println("Veiculo da placa " + placa + " foi adicionado o estacionamento");
		}
		else {
			System.out.println("Placa invalida. Tente novamente");
		}
	}
	public void removerVeiculo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a placa do veiculo que deseja remover: ");
		String placa = sc.nextLine().toUpperCase();
		
		if(veiculos.contains(placa)) {
			System.out.println("Digite a quantidade de horas que o veiculo permaneceu estacionado");
			int horas = sc.nextInt();
			
			double valorTotal = precoInicial + (precoPorHora * horas);
            veiculos.remove(placa);

            System.out.println("O veículo " + placa + " foi removido e o preço total foi de: R$ " + String.format("%.2f", valorTotal));
		}
		else {
			System.out.println("Desculpe, esse veículo não está estacionado aqui. Confira se digitou a placa corretamente.");
		}
	}
	public void listarVeiculos() {
		 if (!veiculos.isEmpty()) {
			 System.out.println("Os veículos estacionados são:");
			 for(String veiculo : veiculos) {
				 System.out.println(veiculo);
			 }
		 }
		 else {
			 System.out.println("Não há veículos estacionados.");
		 }
	}
	
	
}
