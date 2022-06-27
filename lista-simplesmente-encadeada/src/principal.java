
public class principal {

	public static void main(String[] args) {
		No node1, node2, node3, node4;
		node1 = new No(9);
		node2 = new No(3);
		node3 = new No(2);
		node4 = new No(3);
		Lista lista = new Lista();
		lista.inserir(node1);
		lista.inserir(node2);
		lista.inserir(node3);
		lista.inserir(node4);
		System.out.println(lista);
		System.out.println("o primeiro nó é o " + lista.consultarPrimeiro());
		System.out.println(lista.buscar(6));
		System.out.println(lista.temRepetidos());
		lista.remover(node1);
		lista.remover(node4);
		System.out.println(lista);
		lista.remover(node3);
		
	}

}
