import java.util.Iterator;
import java.util.Scanner;

public class Robot{

    private EstadoRobot caminando;
    private EstadoRobot cocinando;
    private EstadoRobot suspendido;
    private EstadoRobot atendiendo;

    private EstadoRobot EstadoActual;

    private Producto orden;

    private Cocinar moduloCocina;

    private MenuHamburguesa staticMenuHamburguesa;
    private MenuPizza staticMenuPizza;
    private MenuBurrito staticMenuBurrito;

    public Robot(){
        caminando = new EstadoCaminando(this);
        cocinando = new EstadoCocinando(this);
        atendiendo = new EstadoAtendiendo(this);
        suspendido = new EstadoSuspendido(this);

        staticMenuHamburguesa = new MenuHamburguesa();
        staticMenuPizza = new MenuPizza();
        staticMenuBurrito = new MenuBurrito();

        EstadoActual = suspendido;

    }


    public Robot(EstadoRobot  EstadoActual){
        this.EstadoActual = EstadoActual;

        caminando = new EstadoCaminando(this);
        cocinando = new EstadoCocinando(this);
        atendiendo = new EstadoAtendiendo(this);
        suspendido = new EstadoSuspendido(this);
        //FALTA INSTANCIAR MENU
    }

    public EstadoRobot getCaminando(){ return caminando;}
    public EstadoRobot getCocinando(){ return cocinando;}
    public EstadoRobot getAtendiendo(){ return atendiendo;}
    public EstadoRobot getSuspendido(){ return suspendido;}


    public void activarse(){EstadoActual.activarse();}
    public void suspenderse(){EstadoActual.suspenderse();}
    public void recibirOrden(){EstadoActual.recibirOrden();}
    public void entregarPlatillo(){EstadoActual.entregarPlatillo();}
    public void irALaBarra(){EstadoActual.irALaBarra();}
    public void caminar(){EstadoActual.caminar();}
    public void irALaCocina(){EstadoActual.irALaCocina();}
    public void cocinar(){EstadoActual.cocinar();}

    public void setEstadoActual(EstadoRobot  EstadoActual){
        this. EstadoActual = EstadoActual;
    }

    public void desplegarMenuInicial(){
        int indicePedido = 0;
        boolean flag = true;


        do{
            System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        indicePedido = getint("Introduce una opción: \n" + "1.-Salir \n" + "2.-PedirPlatillo", "Introduce una opción válida", 1, 2);
            switch (indicePedido) {
                case 1:
                    flag = false;
                    break;
                case 2:
                    rutaPredeterminada();
                    break;

                default:
                break;
            }
        }while(flag);

    }

    public void rutaPredeterminada(){
        activarse();
        recibirOrden();
        caminar();
        irALaCocina();
        cocinar();
        caminar();
        irALaBarra();
        entregarPlatillo();
        suspenderse();
    }

    /**
    * Despliega un menu de acciones posibles a solicitar a todos los estados.
    */

    public void desplegarRecepcionOrden(){
        int indicePedido = 0;
        boolean mko=true;
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        System.out.println(menu());

        indicePedido = getint("Digite el numero de la opcion y presione enter:" + "\n" + menu(),"No es un numero valido.",1, 23);

        do{
            if(indicePedido>0 && indicePedido<13){
                mko=false;
            }else{
                indicePedido = getint("Digite el numero de la opcion y presione enter:" + "\n" + menu(),"No es un numero valido.",1, 23);
            }
        }while(mko);
        orden = buscaEnMenu(indicePedido);

        System.out.println("Orden recibida.");
    }

    public void desplegarEntregaPlatillo(){
        System.out.println("Le entrego su platillo y con ella su ticket:");
        System.out.println(orden.toString());
    }

    public String menu(){
        String s = "";

        s +="Menu de Hamburguesas \n";
        for(Producto m:staticMenuHamburguesa) s += "   "+ m.toString() + "\n";
        s += "Menu de Pizzas \n";
        for(Producto m:staticMenuPizza)
            if(m != null)s += "   "+ m.toString() + "\n";
        s += "Menu de Burritos \n";
        for(Producto m:staticMenuBurrito) if(m!=null) s += "   "+ m.toString() + "\n";
        return s;
    }

    public Producto buscaEnMenu(int indicePedido){
        for(Producto m:staticMenuHamburguesa) if(m.getIndice() == indicePedido) return m;
        for(Producto m:staticMenuPizza)
            if(m!=null)
                if(m.getIndice() == indicePedido) return m;
        for(Producto m:staticMenuBurrito) {
            if(m!=null)
                if(m.getIndice() == indicePedido) return m;
        }
        return null;
    }

    /**
    * Imprime una indicacion y devuelve la entrada estandar hasta que esta es capaz de ser guardada en un entero, de lo contrario imprime un mensaje de error y la indicacion de nuevo hasta que es asi.
    * @param indicacion el mensaje correspondiente a la indicacion.
    * @param error el mensaje de error.
    * @param limiteInferior el numero minimo aceptable.
    * @param limiteSuperior el numero macimo aceptable.
    * @return el unico digito obtenido de la entrada estandar.
    */
    public int getint(String indicacion, String error, int limiteInferior, int limiteSuperior){
        int num=0;
        boolean c=true;
        Scanner scn=new Scanner(System.in);

        do{
            System.out.println(indicacion);
            if(scn.hasNextInt()){
                num=scn.nextInt();
                if(num>=limiteInferior||num<=limiteSuperior) c=false;
            }
            else{
                scn.next();
                System.out.println(error);
            }
        }while(c);
        return num;
    }

    public void cocinarOrden(){
        TipoProducto tipoOrden = orden.getTipoSupermenu();
        switch (tipoOrden) {
            case hamburguesa:
                moduloCocina = new Hamburguesas();
                break;
            case pizza:
                moduloCocina = new Pizzas();
                break;
            case burrito:
                moduloCocina = new Burritos();
                break;
            default:
                break;
        }
        moduloCocina.cocinar((MenuItem)orden);
    }
}
