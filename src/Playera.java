public class Playera extends Mercancia{

    /**
    *El constructor de la clase.
    */
    public Playera(String nombre,String type,double precio,String color,String material){
        super(nombre,type,precio,color,material);
    }

    @Override
    public String leerEtiqueta(){
        return "Es un/una "+getNombre()+" de tipo "+getTipo()+"con precio $"+getPrecio();
    }
}
