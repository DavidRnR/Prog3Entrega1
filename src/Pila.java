
public class Pila {
	Lista pila;


	//Constructor Vac�o
	public Pila () {
		pila = new Lista();
	}

	/**
	 * Devuelve el primer elemento y lo elimina de la pila
	 * @return
	 */
	public int pop () {

		//Sino est� vac�a 
		if (!pila.isEmpty()) {
			int resp = pila.getValueNodo(0);
			pila.delete(0);
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
		//Sino est� vac�a 
		if (!pila.isEmpty()) {
			int resp = pila.getValueNodo(0);
			return resp;
		}
		//Retorna -1 sino encuentra
		return -1;
	}
	/**
	 * Agrega un elemento al tope de la pila
	 */
	public void push(int n) {
		pila.addNodo(n);
	}

	/**
	 * Comprueba si la pila est� vac�a
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
