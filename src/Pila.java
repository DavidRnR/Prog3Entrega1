
public class Pila {
	Lista pila;


	//Constructor Vacío
	public Pila () {
		pila = new Lista();
	}

	//Recibe una Lista 
	public Pila (Lista li) {
		pila = li;
	}

	/**
	 * Devuelve el primer elemento y lo elimina de la pila
	 * @return
	 */
	public int pop () {

		//Sino está vacía 
		if (!pila.isEmpty()) {
			int resp = pila.getValueNodo(pila.getSize()-1);
			pila.delete(pila.getSize()-1);
			return resp;
		}
		//Retorna -1 sino encuentra
		return -1;
	}

	/**
	 * Devuelve el primer elemento de la pila
	 * @return
	 */
	public int top () {
		//Sino está vacía 
		if (!pila.isEmpty()) {
			int resp = pila.getValueNodo(pila.getSize()-1);
			return resp;
		}
		//Retorna -1 sino encuentra
		return -1;
	}
	/**
	 * Agrega un elemento al tope de la pila
	 */
	public void push(int n) {
		pila.addNodoEnd(n);
	}

	/**
	 * Comprueba si la pila está vacía
	 * @return
	 */
	public boolean isEmpty () {
		return pila.isEmpty();
	}
	
	public int getSize () {
		return pila.getSize();
	}

	/**
	 * Devuelve un String con los valores de la pila
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pila.toString();
	}
}
