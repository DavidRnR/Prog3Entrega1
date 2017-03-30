
public class Sim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista lista = new Lista();

		lista.addNodo(5);
		lista.addNodo(6);
		lista.addNodo(8);
		lista.addNodo(12);
		lista.addNodo(21);
		lista.addNodo(12);
		lista.addNodo(56);
		lista.addNodo(54);

		//System.out.println(lista.toString());

		Pila pila = new Pila(lista);

		//Pila est� vac�a?  true/false
		System.out.println(pila.isEmpty());

		//Imprimir la pila
		System.out.println(pila.toString());

		//Eliminamos el elemento que est� al tope
		pila.pop();

		//Imprimir pila
		System.out.println(pila.toString());

		//Agregar un elemento
		pila.push(78);

		//Imprimir pila
		System.out.println(pila.toString());

		//Imprimir el tama�o
		System.out.println(pila.getSize());

		//Elimino 4 elementos
		pila.pop();
		pila.pop();
		pila.pop();
		pila.pop();

		//Imprimo el tama�o y luego la pila
		System.out.println(pila.getSize());
		System.out.println(pila.toString());

		//Elimino 4 elementos
		pila.pop();
		pila.pop();
		pila.pop();
		pila.pop();		
	
		//Imprimo el tama�o y luego la pila
		System.out.println(pila.getSize());
		System.out.println(pila.toString());	//Est� vac�a
		
		//Intento retirar un elemento cuando la pila est� vac�a.
		pila.pop();
		pila.pop();
		pila.pop();
		pila.pop();
		
		
	}

}
