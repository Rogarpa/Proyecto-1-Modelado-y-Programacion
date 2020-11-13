import java.util.Iterator;
import java.util.Scanner;
public class Robot{
    
    private EstadoRobot caminando;
    private EstadoRobot cocinando;
    private EstadoRobot suspendido;
    private EstadoRobot atendiendo;
    
    private EstadoRobot EstadoActual;
    
    private MenuItem orden;
    
    private Cocinar moduloCocina;
    
    private MenuItem menuMaster;
    
    private MenuHamburguesa; 
    private MenuPizza; 
    private MenuBurrito; 
    
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
    
    public MenuItem getOrden(){return orden;}
    public MenuItem getMenuMaster(){return menuMaster;}
    
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
                if(num<limiteInferior||num>limiteSuperior) c=false;
            }
            else{
                scn.next();
                System.out.println(error);
            }
        }while(c);
        return num;
    }
    
    /**
    * Despliega un menu de acciones posibles a solicitar a todos los estados.
    */
    
    public void desplegarRecepcionOrden(){
        int indicePedido = 0;
        
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        
        imprimeMenu();
        
        indicePedido = getint("Digite el numero de la opcion y presione enter:" + "/n" + menuMaster.toString() ,"No es un numero valido.",1, 15);
        
        orden = buscaEnMenu(indicePedido);
        
        System.out.println("Orden recibida.");
    }
    
    public void desplegarEntregaPlatillo(){
        System.out.println("Le entrego su platillo y con ella su ticket:");
        System.out.println(orden.toString());
    }
    
    public String imprimeMenu(){
        System.out.println("Menu de Hamburguesas");
        for(MenuItem m:staticMenuHamburguesa) System.out.println("   "+m.toString());
        System.out.println("Menu de Pizzas");
        for(MenuItem m:staticMenuPizza) System.out.println("   "+m.toString());
        System.out.println("Menu de Burritos");
        for(MenuItem m:staticMenuBurrito) System.out.println("   "+m.toString());
    }
    
    public MenuItem buscaEnMenu(int indicePedido){
        for(MenuItem m:staticMenuHamburguesa) if(m.getIndice == indicePedido) return m;
        for(MenuItem m:staticMenuPizza) if(m.getIndice == indicePedido) return m;
        for(MenuItem m:staticMenuBurrito) if(m.getIndice == indicePedido) return m;
    }
}