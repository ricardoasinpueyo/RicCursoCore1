package interfaces;

/**
 * Interfaz que proporciona movimento a los 
 * objetos
 * @author aula2m
 *
 */
public interface Movible {
	//todos los metodos de una interfaz son publicos
	//y son abstractos
	void moverseLento();//ya es public y abstracto
	public abstract void moverse(int metros);
}
