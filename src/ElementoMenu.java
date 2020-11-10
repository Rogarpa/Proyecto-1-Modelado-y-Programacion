import java.util.LinkedList;

public interface ElementoMenu{
    /**
    *Método que nos ayuda a obtener una descripcion de un elemento.
    *@return regresa una descripcion del Elemento.
    */
    public String toString();
<<<<<<< HEAD

    /***
    *Método que nos permite buscar un elemento especifico.
    */
    public void buscaHoja();

    /**
    *Método que nos devuelve un "rango" de elementos.
    *@return una lista con indices.
    */
=======
    public Hoja buscaHoja();
>>>>>>> 7a32041ca6ed9786223c4b11d64b1605bcd25cd4
    public LinkedList<Integer> rangoHojas();

}
