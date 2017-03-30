
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

		Pila pila = new Pila(lista); //Tambi�n puedo crear una Pila desde una Lista o una vac�a new Pila() y luego agregar elementos

		//Pila est� vac�a?  true/false
		System.out.println("Pila vacia? " + pila.isEmpty());

		//Imprimir la pila
		System.out.println("**********************************************************");
		System.out.println(pila.toString());

		//Eliminamos el elemento que est� al tope
		System.out.println("Pop: "+pila.pop());

		//Imprimir pila
		System.out.println("**********************************************************");
		System.out.println(pila.toString());

		//Agregar un elemento
		System.out.println("Push: 78");pila.push(78);

		//Imprimir pila
		System.out.println("**********************************************************");
		System.out.println(pila.toString());

		//Imprimir el tama�o
		System.out.println("**********************************************************");
		System.out.println("Pila Size: "+pila.getSize());
		
		//Consulto el elemento en el tope de la pila
		System.out.println("**********************************************************");
		System.out.println("Pila Top: "+pila.top());

		//Elimino 4 elementos
		System.out.println("Eliminados (Pop)");
		pila.pop();
		pila.pop();
		pila.pop();
		pila.pop();

		//Imprimo el tama�o y luego la pila
		System.out.println("****************Tama�o y Pila ***********************");
		System.out.println(pila.getSize());
		System.out.println(pila.toString());

		//Elimino 4 elementos
		pila.pop();
		pila.pop();
		pila.pop();
		pila.pop();		
	
		//Imprimo el tama�o y luego la pila
		System.out.println("Size: "+pila.getSize());
		System.out.println("Pila: "+pila.toString());	//Est� vac�a
		System.out.println("Pila vacia? " + pila.isEmpty());
		
		//Intento retirar un elemento cuando la pila est� vac�a.
		pila.pop();
	
		
		
	}

}
