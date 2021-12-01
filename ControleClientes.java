
	
	import java.util.ArrayList;
	import java.util.List;

	public class ControleClientes {
		
		List<Clientes> controle2 = new ArrayList<>();
		
		public void adicionar(Clientes c) {
			controle2.add(c);
			
		
		}
		public void ListaClientes() {
			controle2.forEach((c) ->{
				System.out.println("nome do cliente: " + c.getNome());
				System.out.println("numero de cpf: " + c.getCpf());
				System.out.println("idade do cliente:  " + c.getIdade());
				System.out.println("empresa:  " + c.getEmpresa());
				
			});
		}

	}


