import java.util.Iterator;

public interface Menu {
	public Iterator<?> createIterator();

	String name;

	/**
	*Metodo que nos permite acceder al nombre de nuestros platillos.
	*@return el nombre.
	*/
	public String getName() {
		return name;
	}

	/**
	*Método para obtener todas las hojas de nuestra estructura.
	*@return retorna dos indices, el maximo y el minimo de las hojas.
	*/
	public void hijos();

	/**
	*Metodo que usamos para imprimir la descrpción de un elemento.
	*@return la descrpción.
	*/
	public String toString();

	/**
	*Método que regresa el indice de un elemento.
	*@return el indice.
	*/
	public int busca();
}
