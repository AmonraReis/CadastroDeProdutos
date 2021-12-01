import java.util.Scanner;


public class Principal {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner dados1 = new Scanner(System.in);
		Scanner dados2 = new Scanner(System.in);
		Scanner dados3 = new Scanner(System.in);
		Scanner dados4 = new Scanner(System.in);
		Scanner dados = new Scanner (System.in);
		Scanner dados5 = new Scanner(System.in);
		Scanner dados6= new Scanner (System.in);
		Scanner dados7= new Scanner (System.in);
		Scanner dados8= new Scanner (System.in);
		
		ControleProduto controleProduto = new ControleProduto(); //chamando a classe de controle de produtos
		
		Produto c1 = new Produto(); //criando um novo produto
		
		String nomeProduto;
		double numeroCadastro;
		int quantidadeProduto;        //declarando variaveis
		String valorUnitario;
	//	String quit = "";
		
		ControleClientes controleCliente = new ControleClientes(); // chamada da classe que controla os clientes
		
		Clientes c2 = new Clientes(); //criando um novo cliente
		
		String nome;
		double cpf;
		int idade;
		String empresa;
		
		
		
		System.out.println("-------------Olá usuário, por favor, selecione a opção que deseja!-------------");
		
		System.out.println("Opçoes:  1-Cadastrar produto");
		System.out.println("Opçoes:  2-Cadastrar Cliente");
		
	
		
		int selecao = 0;
		
		System.out.println(" N°: " );
		
		selecao= dados.nextInt();
		
	 if (selecao ==1 || selecao ==2) {  /// chamada para selecao dos cases
		 
			switch (selecao ) { //envia para o case selecionado
			
			case 1: 
				System.out.println("Nome do Produto: ");
				nomeProduto= dados1.nextLine(); // usuário informa nome do produto
				c1.setNomeProduto(nomeProduto); //seta o nome do produto e envia para a variavel
				
				System.out.println("Numero de cadastro: ");
				numeroCadastro = dados2.nextDouble();
				c1.setNumeroCadastro(numeroCadastro);
				
				System.out.println("Quantidade do produto: ");
				quantidadeProduto=dados3.nextInt();
				c1.setQuantidadeProduto(quantidadeProduto);
				
				System.out.println("Valor unitário: ");
				valorUnitario=dados4.nextLine();
				c1.setValorUnitario(valorUnitario);
				
				
				controleProduto.adicionar(c1); //adiciona mais um novo produto no array
				c1 = new Produto(); 
				break;

			case 2: 
				System.out.println("Nome do Cliente: ");
				nome= dados5.nextLine();
				c2.setNome(nome);
				
				System.out.println("Numero de CPF: ");
				cpf = dados6.nextDouble();
				c2.setCpf(cpf);
				
				System.out.println("Idade: ");
				idade=dados7.nextInt();
				c2.setIdade(idade);
				
				System.out.println("Nome da empresa: ");
				empresa=dados5.nextLine();
				c2.setEmpresa(empresa);
				
				
				controleCliente.adicionar(c2);
				c2 = new Clientes();
				break;
			
								 
			}
			
				
		controleProduto.ListaProdutos(); // mostra os produtos no array (listaprodutos)
		controleCliente.ListaClientes(); //mostra o cliente no array (listaclientes)

       dados1.close();
       dados8.close();
	}
	 
	 else {
		System.out.println("Seleciona algum opção!");
		
		return;
	}
			
	 }

	}




