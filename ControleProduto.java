import java.util.ArrayList;
import java.util.List;

public class ControleProduto {
	
	List<Produto> controle = new ArrayList<>();
	
	public void adicionar(Produto p) {
		controle.add(p);
		
	
	}
	public void ListaProdutos() {
		controle.forEach((c) ->{
			System.out.println("nome do produto: " + c.getNomeProduto());
			System.out.println("numero de cadastro: " + c.getNumeroCadastro());
			System.out.println("quantide disponivel:  " + c.getQuantidadeProduto());
			System.out.println("Unidades:  " + c.getValorUnitario());
			
		});
	}

}
