import java.util.LinkedList;
public class Mercancia{

    public int indice;

    public String nombre;

    public String type;

    public double precio;

    public String color;

    public String material;

    /**
    *El constructor de la Clase Mercancia.
    *@param nombre el nombre del artículo.
    *@param type el tipo de artículo.
    *@param precio el precio del artículo.
    *@param color el color del artículo.
    *@param material el material del artículo.
    */
    public Mercancia(int indice,String nombre,String type,double precio,String color,String material){
        this.indice=indice;
        this.nombre=nombre;
        this.type=type;
        this.precio=precio;
        this.color=color;
        this.material=material;
    }

    /**
    *Metodo apra hacer una descripción del artículo.
    *@return la descripción del artículo.
    */
    public String leerEtiqueta(){
        return "Es un/una "+this.nombre+ " de tipo "+this.type+" con precio $"+this.precio;
    }

    /**
    *Metod que me regresa el indice de cada artículo.
    *@return el indice del artículo.
    */
    public int getIndice(){
        return this.indice;
    }
    /**
    *Metodo para encontrar en el menu alguna mercancia.
    *@return el item encontrado.
    */
    public MenuItem encuentra(int ind){
    return null;
    }

    /**
    *Metodo para obtener los indices donde son Mercancias.
    *@return el arreglo con los indices de las mercancias.
    */
    public LinkedList<Integer> getIndicesMercancias(int ind){
        return null;
    }
}
