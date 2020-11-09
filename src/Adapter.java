public class Adapter implements MenuItem{

    private Mercancia adapt=new Mercancia();

    @Override
    public Adapter(Mercancia producto){

    }

    @Override
    public void toString(){
        System.out.println("Tu mercancia es un:");
    }

    @Override
    public void busca(){

    }

    @Override
    public void gethojas(){

    }
}
