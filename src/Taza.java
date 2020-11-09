public class Taza extends Mercancia{

    /**
    *El constructor de la clase Taza.
    */
    public Taza(String nombre,String type,double precio,String color,String material){
        super(nombre,type,precio,color,material);
    }

    @Override
    public String toString(){
        return "Es un/una "+getNombre()+" de tipo "+getTipo()+"con precio $"+getPrecio();
    }

}
