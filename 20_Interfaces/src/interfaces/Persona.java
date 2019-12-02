package interfaces;

//no es obligatorio extender de objet, ya que todas
//las clases si no se lo dices heredan de ella
//tambien se lo puedes decir...
//lo que pasa es que en java no existe la herencia multiple como
//tal, y solo podemos heredar (extends) de una unica clase
//Las interfaces nos ayudan a simular una herencia multiple
//Solo podemos "extends" de una unica claes, pero podemos
//implementar TODAS las interfaces que queramos, separadas
//por coma
public class Persona extends Object implements Movible{
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void moverseLento() {
		System.out.println("Me llamo " + nombre + " y me muevo 2 metros");
		
	}

	@Override
	public void moverse(int metros) {
		System.out.println("Me llamo " + nombre + " y me muevo " + metros + " metros");
		
	}
	
	
}
