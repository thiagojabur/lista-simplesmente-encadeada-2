
public class Lista {
	No head, tail;
    private int quantidadeElementos = 0;
	
	public void inserir(No novoNo) {
		if (quantidadeElementos == 0 ) 
			head = novoNo;
		else 
			//encadeando e atualizar o proximo do tail
			tail.setProximo(novoNo); 	
		// atualizando o tail
		tail = novoNo;
		quantidadeElementos += 1;	
	}

	public int getQuantidadeElementos() {
		return quantidadeElementos;
	}
	
	public String toString() {
		String retorno ="";
		No elemento = head;
		for (int i=0; i<quantidadeElementos; i++) {
			retorno += elemento.getValor() + " ";
			elemento = elemento.getProximo();
		}
		return retorno;
	}
	
	public No consultarPrimeiro() {
		return head;
	}
	public No consultarUltimo() {
		return tail;
	}
	
	boolean buscar(int numeroBuscado) {
		if (quantidadeElementos == 0) return false;
		No cursor = head;
		
		while (cursor != tail) {
			if (cursor.getValor() == numeroBuscado)
				return true;
			cursor = cursor.getProximo();
		}
		
		if (cursor.getValor() == numeroBuscado) 
			return true;
		
		return false;
	}
	
}
