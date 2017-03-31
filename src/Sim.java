
public class Sim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Creo una Pila
		Pila pila = new Pila();
		
		pila.push(3);
		pila.push(5);
		pila.push(6);
		pila.push(9);
		pila.push(10);

		//Pila está vacía?  true/false
		System.out.println("Pila vacia? " + pila.isEmpty());

		//Imprimir la pila
		System.out.println("**********************************************************");
		System.out.println(pila.toString());

		//Eliminamos el elemento que está al tope
		System.out.println("Pop: "+pila.pop());

		//Imprimir pila
		System.out.println("**********************************************************");
		System.out.println(pila.toString());

		//Agregar un elemento
		System.out.println("Push: 78");pila.push(78);

		//Imprimir pila
		System.out.println("**********************************************************");
		System.out.println(pila.toString());

		//Imprimir el tamaño
		System.out.println("**********************************************************");
		System.out.println("Pila Size: "+pila.getSize());
		
		//Consulto el elemento en el tope de la pila
		System.out.println("**********************************************************");
		System.out.println("Pila Top: "+pila.top());

		//Elimino 5 elementos
		System.out.println("Eliminados (Pop)");
		pila.pop();
		pila.pop();
		pila.pop();
		pila.pop();
		pila.pop();

		//Imprimo el tamaño y luego la pila
		System.out.println("**********************************************");
		System.out.println("Tamaño:"+pila.getSize()); //Está vacía
		System.out.println("Pila:"+pila.toString()); //Está vacía
		
		pila.pop(); //Intento retirar un elemento cuando la pila está vacía.

		//Agrego 3 elementos
	
		pila.push(23);
		pila.push(34);
		pila.push(87);		
	
		//Imprimo el tamaño y luego la pila
		System.out.println("**********************************************************");
		System.out.println("Size: "+pila.getSize());
		System.out.println("Pila: "+pila.toString());	
		System.out.println("Pila vacia? " + pila.isEmpty());
			
		
	}

}
