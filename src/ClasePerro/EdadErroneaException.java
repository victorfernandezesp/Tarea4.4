package ClasePerro;
/**
 * Lanzada si la edad del perro es menor a 0
 * @author Victor Fernandez
 *
 */
@SuppressWarnings("serial")
public class EdadErroneaException extends Exception {

	public EdadErroneaException(String message2) {
		super(message2);
	}
}
