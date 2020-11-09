public class Adapter implements Enum{

    private Mercancia adapt;
    private int indice;

    @Override
    public int getEnum(){
        this.adapt.getIndice();
    }

    /**
    *Constructor de la clase.
    */
    public Adapter(){
        this.adapt=new Mercancia();

    }

    /**
    *Metodo para obtener una descripción del Elemento.
    *@return regresa la descripción.
    */
    public String toString(){
        return this.adapt.leerEtiqueta();
    }

    @Override
    public void busca(int indice){
        this.adapt.encuentra(indice);
    }

    @Override
    public void hijos(int indice){
        this.adapt.getIndicesMercancias(indice);
    }
}
