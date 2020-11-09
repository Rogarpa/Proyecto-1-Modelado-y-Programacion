public class Mercancia{

    public String nombre;

    public String type;

    public double precio;

    public String color;

    public String material;

    /**
    *El constructor vacio de la clase.
    */
    public Mercancia(){}
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
    *Metodo para acceder al nombre del artículo.
    *@return el nombre.
    */
    public String getNombre(){
        return this.nombre;
    }

    /**
    *Método para acceder al nombre del artículo.
    *@return el tipo de artículo.
    */
    public String getTipo(){
        return this.type;
    }

    /**
    *Método para acceder al precio del artículo.
    *@return el precio del artículo.
    */
    public double getPrecio(){
        return this.precio;
    }

    /**
    *Metodo para acceder al color del artículo.
    *@return el color del artículo.
    */
    public String getColor(){
        return this.color;
    }

    /**
    *Metodo para acceder al material del artículo.
    *@return el material del artículo.
    */
    public String getMaterial(){
        return this.material;
    }

    @Override
    public String toString(){
        return "Es un/una "+getNombre()+" de tipo "+getTipo()+"con precio $"+getPrecio();
    }

}
