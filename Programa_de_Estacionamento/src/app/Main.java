package app;
import java.util.Scanner;
import utilidades.Estacionamento;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem vindo ao sistema de estacionamento!");
          System.out.println("Digite o preço inicial:");
		double precoinicial = sc.nextDouble();
		
		System.out.println("Agora digite o preço por hora:");
		double precoPorHora = sc.nextDouble();
		
		Estacionamento estacionamento = new Estacionamento(precoinicial, precoPorHora);
		
		boolean exibirMenu = true;
		
		while(exibirMenu) {
			System.out.println("Menu:");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Remover veículo");
            System.out.println("3 - Listar veículos");
            System.out.println("4 - Encerrar");
            
            int opcao = sc.nextInt();
            
            switch (opcao) {
            case 1:
                estacionamento.adicionarVeiculo();
                break;

            case 2:
                estacionamento.removerVeiculo();
                break;

            case 3:
                estacionamento.listarVeiculos();
                break;

            case 4:
                exibirMenu = false;
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
            System.out.println("Pressione Enter para continuar");
            sc.nextLine(); // Consumir a nova linha pendente após a leitura do número da opção
            sc.nextLine(); // Aguardar o Enter
		}
		System.out.println("O programa se encerrou");
		sc.close();
	}

}
