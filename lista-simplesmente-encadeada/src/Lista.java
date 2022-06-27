
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
	
	boolean temRepetidos() {
		//fazer um laço que vai do primeiro elemento até tail
		No cursor, cursor2; 
		cursor = head;
		cursor2 = head.getProximo();
		if (quantidadeElementos == 0) return false;
		
		while (cursor != tail) {			
			while (cursor2 != null) {
			  //System.out.println("comparou " + cursor.getValor() + " com " + cursor2.getValor());  
			  if (cursor.getValor() == cursor2.getValor())
				return true;
				cursor2 = cursor2.getProximo();
			} 	
			cursor = cursor.getProximo();
			//resetando cursor2
			cursor2 = cursor.getProximo();
		} 
		
		return false;
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
