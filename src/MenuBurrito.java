import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

public class MenuBurrito implements Iterable<Producto>{

    private class IteradorBurrito implements Iterator<Producto>{
        Iterator llaves;
        
        public IteradorBurrito(){
            llaves =  listaHijos.values().iterator();
        }
        
        @Override public boolean hasNext(){return llaves.hasNext();}
        @Override public Producto next(){return listaHijos.get(llaves.next());}
    }
    
    protected Hashtable <Integer,Producto> listaHijos;

    public MenuBurrito(){
        listaHijos = new Hashtable<>();
        listaHijos.put(10,new MenuItem(10,"BURRITO DE QUESO","Burrito con relleno de queso", false, 90.00, TipoProducto.burrito));
        listaHijos.put(11,new MenuItem(11,"URRITO VEGANO","Pizza solo de vegetales", true, 100.00, TipoProducto.burrito));
        listaHijos.put(12,new MenuItem(12,"BURRITO DE CARNE","Burrito con exclusivamente de carne", false, 120.00, TipoProducto.burrito));
        listaHijos.put(13,new MenuItem(13,"BURRITO CLASICO","Burrito sencillo", false, 70.00, TipoProducto.burrito));
        
        listaHijos.put(14,new Adapter(new Mercancia(1,"PLAYERA ROJA ","Playera",90.00, "Roja","TELA")));
        listaHijos.put(15,new Adapter(new Mercancia(2,"PLAYERA AZUL","Playera",90.00, "Azul","TELA")));
        listaHijos.put(16,new Adapter(new Mercancia(3,"PLAYERA VERDE","Playera",90.00, "Verde","TELA")));
        listaHijos.put(17,new Adapter(new Mercancia(4,"PLAYERA ANIMADA(NEGRA)","Playera",100.00, "Negra","TELA")));
        listaHijos.put(18,new Adapter(new Mercancia(5,"PLAYERA ANIMADA(BLANCA)","Playera",100.00, "Blanca","TELA")));
        listaHijos.put(19,new Adapter(new Mercancia(6,"JEANS","Patalones",105.00, "azules","MEZCLILLA")));
        listaHijos.put(20,new Adapter(new Mercancia(7,"PANTALONES DEPORTIVOS ","Pantalones",100.00, "negro","TELA")));
        listaHijos.put(21,new Adapter(new Mercancia(8,"PANTALON FORMAL","Pantalones",100.00, "blanco","TELA")));
        listaHijos.put(22,new Adapter(new Mercancia(9,"CHAMARRA DE CUERO ","Chamarra",120.00, "negro","CUERO")));
        listaHijos.put(23,new Adapter(new Mercancia(10,"CHMARRA SIMPLE","Chamarra",110.00, "verde","TELA")));
        listaHijos.put(24,new Adapter(new Mercancia(11,"CHAMARRA DE MEZCLILLA(Azul)","Chamarra",115.00,"azul","MEZCLILLA")));
        listaHijos.put(25,new Adapter(new Mercancia(12,"CHAMARRA DE MEZCLILLA(Negra)","Chamarra",115.00,"negra","MEZCLILLA")));
        listaHijos.put(26,new Adapter(new Mercancia(13,"SMOKING NEGRO ","Traje",250.00, "negro","TELA")));
        listaHijos.put(27,new Adapter(new Mercancia(14,"SMOKING BLANCO","Traje",250.00, "blanco","TELA")));
        listaHijos.put(28,new Adapter(new Mercancia(15,"SACO(INDIVIDUAL) ","Traje",150.00, "Negro","TELA")));
        listaHijos.put(29,new Adapter(new Mercancia(16,"BUFANDA ","Bufanda",80.00, "Roja","TELA")));
        listaHijos.put(30,new Adapter(new Mercancia(17,"CALCETINES ","Calcetines",50.00, "azules","TELA")));
        listaHijos.put(31,new Adapter(new Mercancia(18,"GORRA ","gorra",60.00, "blancos","TELA")));


    }

    @Override
    public Iterator iterator(){return new IteradorBurrito();}
}
