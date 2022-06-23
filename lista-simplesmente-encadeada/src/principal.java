
public class principal {

	public static void main(String[] args) {
		No node1, node2;
		node1 = new No(4);
		node2 = new No(3);
		Lista lista = new Lista();
		lista.inserir(node1);
		lista.inserir(node2);
		lista.inserir(new No(6));
		System.out.println(lista);
		System.out.println("o primeiro nó é o " + lista.consultarPrimeiro());
		System.out.println(lista.buscar(6));
	}

}
