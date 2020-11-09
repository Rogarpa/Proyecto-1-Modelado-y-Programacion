public class Mercancia{

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
    public Mercancia(String nombre,String type,double precio,String color,String material){
        this.nombre=nombre;
        this.type=type;
        this.precio=precio;
        this.color=color;
        this.material=material;
    }

    /**
    *
    *
    */
    public String leerEtiqueta(){
        return "Es un/una "+getNombre()+" de tipo "+getTipo()+"con precio $"+getPrecio();
    }

    /**
    *Metodo para encontrar en el menu alguna mercancia.
    *@return el item encontrado.
    */
    public MenuItem encuentra(){
    return null;
    }

    /**
    *Metodo para obtener los indices donde son Mercancias.
    *@return el arreglo con los indices de las mercancias.
    */
    public Array[] getIndicesMercancias(){
        return null;
    }
}
