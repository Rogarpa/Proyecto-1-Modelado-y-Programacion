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
    protected Hashtable <String,Producto> listaHijos;


    public MenuBurrito(){
        this.listaHijos = new Hashtable<String,Producto>();
        this.listaHijos.put("burrito de queso",new MenuItem(10,"BURRITO DE QUESO","Burrito con relleno de queso", false, 90.00, TipoProducto.burrito));
        this.listaHijos.put("burrito vegano",new MenuItem(11,"URRITO VEGANO","Pizza solo de vegetales", true, 100.00, TipoProducto.burrito));
        this.listaHijos.put("burrito carne",new MenuItem(12,"BURRITO DE CARNE","Burrito con exclusivamente de carne", false, 120.00, TipoProducto.burrito));
        this.listaHijos.put("burrito clasico",new MenuItem(13,"BURRITO CLASICO","Burrito sencillo", false, 70.00, TipoProducto.burrito));

        this.listaHijos.put("mercancia1",new Adapter(new Mercancia(1,"PLAYERA ROJA ","Playera",90.00, "Roja","TELA")));
        this.listaHijos.put("mercancia2",new Adapter(new Mercancia(2,"PLAYERA AZUL","Playera",90.00, "Azul","TELA")));
        this.listaHijos.put("mercancia3",new Adapter(new Mercancia(3,"PLAYERA VERDE","Playera",90.00, "Verde","TELA")));
        this.listaHijos.put("mercancia4",new Adapter(new Mercancia(4,"PLAYERA ANIMADA(NEGRA)","Playera",100.00, "Negra","TELA")));
        this.listaHijos.put("mercancia5",new Adapter(new Mercancia(5,"PLAYERA ANIMADA(BLANCA)","Playera",100.00, "Blanca","TELA")));
        this.listaHijos.put("mercancia6",new Adapter(new Mercancia(6,"JEANS","Patalones",105.00, "azules","MEZCLILLA")));
        this.listaHijos.put("mercancia7",new Adapter(new Mercancia(7,"PANTALONES DEPORTIVOS ","Pantalones",100.00, "negro","TELA")));
        this.listaHijos.put("mercancia8",new Adapter(new Mercancia(8,"PANTALON FORMAL","Pantalones",100.00, "blanco","TELA")));
        this.listaHijos.put("mercancia9",new Adapter(new Mercancia(9,"CHAMARRA DE CUERO ","Chamarra",120.00, "negro","CUERO")));
        this.listaHijos.put("mercancia10",new Adapter(new Mercancia(10,"CHMARRA SIMPLE","Chamarra",110.00, "verde","TELA")));
        this.listaHijos.put("mercancia11",new Adapter(new Mercancia(11,"CHAMARRA DE MEZCLILLA(Azul)","Chamarra",115.00,"azul","MEZCLILLA")));
        this.listaHijos.put("mercancia12",new Adapter(new Mercancia(12,"CHAMARRA DE MEZCLILLA(Negra)","Chamarra",115.00,"negra","MEZCLILLA")));
        this.listaHijos.put("mercancia13",new Adapter(new Mercancia(13,"SMOKING NEGRO ","Traje",250.00, "negro","TELA")));
        this.listaHijos.put("mercancia14",new Adapter(new Mercancia(14,"SMOKING BLANCO","Traje",250.00, "blanco","TELA")));
        this.listaHijos.put("mercancia15",new Adapter(new Mercancia(15,"SACO(INDIVIDUAL) ","Traje",150.00, "Negro","TELA")));
        this.listaHijos.put("mercancia16",new Adapter(new Mercancia(16,"BUFANDA ","Bufanda",80.00, "Roja","TELA")));
        this.listaHijos.put("mercancia17",new Adapter(new Mercancia(17,"CALCETINES ","Calcetines",50.00, "azules","TELA")));
        this.listaHijos.put("mercancia18",new Adapter(new Mercancia(18,"GORRA ","gorra",60.00, "blancos","TELA")));


    }

    @Override
    public Iterator<Producto> iterator(){return listaHijos.values().iterator();}
}
