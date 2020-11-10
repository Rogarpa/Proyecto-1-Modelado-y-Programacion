public class MenuItem implements ElementoMenu{
    String nombre;
    String descripcion;
    boolean esVeganos;
    Double precio;
    TipoProducto tipoPadre;

    public MenuItem(String nombre ,String descripcion ,boolean esVeganos ,Double precio ,TipoProducto tipoPadre){
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.esVeganos = esVeganos;
    this.precio = precio;
    this.tipoPadre = tipoPadre;
    }
    
    public String toString(){
        return "";
    }
    public void buscaHoja(){

    }
    public LinkedList<Integer> rangoHojas(){
        return null;
    }
    
}