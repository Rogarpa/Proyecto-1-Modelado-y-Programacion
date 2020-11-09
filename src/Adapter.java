public class Adapter implements ElementoMenu{

    private Mercancia adapt;
    private int indice;

    @Override
    public Adapter(){
        this.adapt=new Mercancia();

    }

    @Override
    public void toString(){
        this.adapt.leerEtiqueta();
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
