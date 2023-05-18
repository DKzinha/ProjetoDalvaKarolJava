package dalvakarol;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

		public static void main(String[] args) {
		Scanner capture = new Scanner(System.in);
		ArrayList<Gato> listaGato = new ArrayList<>();
		Cadastro cadastro = null;
			int opcao = -1;

	        while (opcao != 0) {
	        	 System.out.println("MENU:");
	             System.out.println("1. Cadastrar-se");
	             System.out.println("2. Lista de gatos");
	             System.out.println("3. Eleger-se para adoção");
	             System.out.println("4. Doar para abrigo");
	             System.out.println("0. Sair");
	             System.out.print("Escolha uma opção: ");
	            opcao = capture.nextInt();
	            capture.nextLine();

	            switch (opcao) {
	                case 1:
	                	System.out.print("Nome completo: ");
	                	 String nomeCompleto = capture.nextLine();

	                    System.out.print("CPF: ");
	                    int cpf = capture.nextInt();
	                    capture.nextLine();

	                    System.out.print("Endereço: ");
	                    String endereco = capture.nextLine();

	                    System.out.print("Email: ");
	                    String email = capture.nextLine();

	                    System.out.print("Número de telefone: ");
	                    String numeroTelefone = capture.nextLine();
	                    cadastro = new Cadastro(nomeCompleto, cpf, endereco, email, numeroTelefone);
	                  
	                    System.out.println("Cadastro realizado com sucesso!");
	                    break;
	                case 2:
	                	listaGato.add(new Gato(3, 5.0, "Persa", "Um elegante felino de pelos longos e olhos brilhantes."));
	                    listaGato.add(new Gato(1, 3.5, "Siamês", "Um gato esbelto e de olhos azuis intensos, sempre curioso e brincalhão."));
	                    listaGato.add(new Gato(5, 4.2, "Maine Coon", "Um gigante gentil de pelos macios, que adora receber carinho e brincar."));
	                    listaGato.add(new Gato(2, 4.8, "Bengal", "Um gato exótico com pelagem manchada, ágil e cheio de energia."));
	                    listaGato.add(new Gato(6, 2.0, "Scottish Fold", "Um gatinho adorável com orelhas dobradas, brincalhão e cheio de travessuras."));
	                    
	                    for (int x = 0; x < listaGato.size(); x++) {
	                        Gato gato = listaGato.get(x);
	                        System.out.println("Gato " + (x + 1));
	                        System.out.println("Idade: " + gato.getIdade());
	                        System.out.println("Peso: " + gato.getPeso());
	                        System.out.println("Raça: " + gato.getRaca());
	                        System.out.println("Descrição: " + gato.getDescricao());
	                        System.out.println("\n");
	                    }
	                
	                    break;
	                case 3:
	                	System.out.print("Digite o nome do cadastro: ");
	                    String nomeCadastro = capture.nextLine();
	                    
	                   
	                     if (cadastro.getNomeCompleto().equalsIgnoreCase(nomeCadastro)) {
	                    	System.out.print("Escreva um texto descrevendo o por que você decidiu adotar um gato e como planeja cuidar dele: ");
	                    	String texto = capture.nextLine();
	                    	System.out.print("Estamos disponiveis 7 dias na semana, das 14:00 as 20:00 \n");
	                    	System.out.print("Agora agende que dia deseja visitar os gatos:  ");
	                    	int dia = capture.nextInt();
	                    	System.out.print("Agora agende que hora deseja a visita:  ");
	                    	Double horas = capture.nextDouble();
	                    	if(horas  >= 14 && horas <= 20){
	          
	                    		System.out.print("Pronto ! A visita esta marcada para o dia " + dia + " ás " + horas + ":00" );
	                    	} else {
	                    		System.out.print("Sinto muito, não estamos abertos nesse horario.");
	                    	}
	                    }else {
	                    	
	                    	System.out.print("Nome invalido - Tente novamente ");
	                    }

	                    
	                    break;
	                case 4:
	                	 System.out.println("\n \n \n Agradecemos a intenção de doar ao abrigo: ");
	                	 System.out.println("Pix: +55 (89) 981359729 \n \n \n");
	                    break;
	                case 0:
	                    System.out.println("Volte sempre");
	                    break;
	                default:
	                    System.out.println("Opção inválida!");
	            }
		}
	}

}
