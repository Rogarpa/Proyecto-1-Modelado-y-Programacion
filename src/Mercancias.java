import java.util.Iterator;
import java.util.LinkedList;

public class Mercancias extends Mercancia{

    protected Producto[] listaHijos;

    public Mercancias(){
        listaHijos = new ElementoMenu[20];
        listaHijos1.add(new MenuItem(1,"PLAYERA ROJA ","Playera",90.00 "Roja","TELA"));
        listaHijos2.add(new MenuItem(2,"PLAYERA AZUL","Playera",90.00 "Azul","TELA"));
        listaHijos3.add(new MenuItem(3,"PLAYERA VERDE","Playera",90.00 "Verde","TELA"));
        listaHijos4.add(new MenuItem(4,"PLAYERA ANIMADA(NEGRA)","Playera",100.00 "Negra","TELA"));
        listaHijos5.add(new MenuItem(5,"PLAYERA ANIMADA(BLANCA)","Playera",100.00 "Blanca","TELA"));
        listaHijos6.add(new MenuItem(6,"JEANS","Patalones",105.00 "azules","MEZCLILLA"));
        listaHijos7.add(new MenuItem(7,"PANTALONES DEPORTIVOS ","Pantalones",100.00 "negro","TELA"));
        listaHijos8.add(new MenuItem(8,"PANTALON FORMAL","Pantalones",100.00 "blanco","TELA"));
        listaHijos9.add(new MenuItem(9,"CHAMARRA DE CUERO ","Chamarra",120.00 "negro","CUERO"));
        listaHijos10.add(new MenuItem(10,"CHMARRA SIMPLE","Chamarra",110.00 "verde","TELA"));
        listaHijos11.add(new MenuItem(11,"CHAMARRA DE MEZCLILLA(Azul)","Chamarra",115.00"azul","MEZCLILLA"));
        listaHijos12.add(new MenuItem(12,"CHAMARRA DE MEZCLILLA(Negra)","Chamarra",115.00"negra","MEZCLILLA"));
        listaHijos13.add(new MenuItem(13,"SMOKING NEGRO ","Traje",250.00 "negro","TELA"));
        listaHijos14.add(new MenuItem(14,"SMOKING BLANCO","Traje",250.00 "blanco","TELA"));
        listaHijos15.add(new MenuItem(15,"SACO(INDIVIDUAL) ","Traje",150.00 "Negro","TELA"));
        listaHijos16.add(new MenuItem(16,"BUFANDA ","Bufanda",80.00 "Roja","TELA"));
        listaHijos17.add(new MenuItem(17,"CALCETINES ","Calcetines",50.00 "azules","TELA"));
        listaHijos18.add(new MenuItem(18,"GORRA ","gorra",60.00 "blancos","TELA"));


    }

    /**
    *Método para agregar elementos al menu.
    *@param h el elemento a gregar.
    */
    public void agregarHijo(ElementoMenu h){
        ElementoMenu.add(listaHijos1);
        ElementoMenu.add(listaHijos2);
        ElementoMenu.add(listaHijos3);
        ElementoMenu.add(listaHijos4);
        ElementoMenu.add(listaHijos5);
        ElementoMenu.add(listaHijos6);
        ElementoMenu.add(listaHijos7);
        ElementoMenu.add(listaHijos8);
        ElementoMenu.add(listaHijos9);
        ElementoMenu.add(listaHijos10);
        ElementoMenu.add(listaHijos11);
        ElementoMenu.add(listaHijos12);
        ElementoMenu.add(listaHijos13);
        ElementoMenu.add(listaHijos14);
        ElementoMenu.add(listaHijos15);
        ElementoMenu.add(listaHijos16);
        ElementoMenu.add(listaHijos17);
        ElementoMenu.add(listaHijos18);


    }

    /**
    *Metodo para eliminar elementos del Menu.
    *@param h el elemento a eliminar.
    */
    public void eliminaHIjo(ElementoMenu h){
    }

    @Override
    public String toString(){
        return return "listaHijo1"+"/n" + "listaHijo2"+"/n" + "ListaHijo3" + "/n" + "ListaHijo4"+"/n" + "listaHijo5"+"/n" + "ListaHijo6" + "/n" + "ListaHijo7"+"/n" + "listaHijo8"+"/n" + "ListaHijo9" + "/n" + "ListaHijo10" +"/n" + "listaHijo11"+"/n" + "ListaHijo12" + "/n" + "ListaHijo13"+"/n" + "listaHijo14"+"/n" + "ListaHijo15" + "/n" + "ListaHijo16"+"/n" + "listaHijo17"+"/n" + "ListaHijo18";
    }

    @Override
    public Iterator<Producto> iterator(){return listaHijos.asList().iterator();}

}
