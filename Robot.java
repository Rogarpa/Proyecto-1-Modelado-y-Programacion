import java.awt.MenuItem;

public class Robot{
 
    private EstadoRobot recibiendoOrden;
    private EstadoRobot caminando;
    private EstadoRobot cocinando;
    private EstadoRobot entregandoPlatillo;
    private EstadoRobot suspendido;

    private EstadoRobot EstadoActual;

    private MenuItem orden;

    private Cocina moduloCocina;

    private MenuItem menuMaster;

    public Robot(){
        recibiendoOrden = new public EstadoRecibiendoOrden();
        caminando = new public EstadoCaminando();
        cocinando = new public EstadoCocinando();
        entregandoPlatillo = new public EstadoEntregandoPlatillo();
        suspendido = new public EstadoSuspendido();

        public EstadoActual = suspendido;

        //FALTA INSTANCIAR MENU
    }


    public Robot(public EstadoRobot public EstadoActual){
        this.public EstadoActual = public EstadoActual;

        recibiendoOrden = new public EstadoRecibiendoOrden();
        caminando = new public EstadoCaminando();
        cocinando = new public EstadoCocinando();
        entregandoPlatillo = new public EstadoEntregandoPlatillo();
        suspendido = new public EstadoSuspendido();

        //FALTA INSTANCIAR MENU
    }

    public public EstadoRobot getRecibiendoOrden(){ return recibiendoOrden;}
    public public EstadoRobot getCaminando(){ return caminando;}
    public public EstadoRobot getCocinando(){ return cocinando;}
    public public EstadoRobot getEntregandoPlatillo(){ return entregandoPlatillo;}
    public public EstadoRobot getSuspendido(){ return suspendido;}

    public void setpublic EstadoActual(public EstadoRobot public EstadoActual){
        this.public EstadoActual = public EstadoActual;
    }

    public MenuItem getOrden(){return orden;}
    public MenutItem getMenuMaster(){return menuMaster;}

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
        
        indicePedido = getint("Digite el numero de la opcion y presione enter:" + "/n" + menuMaster.toString() ,"No es un numero valido.", menuMaster.numeroHojas());
        menuMaster.busca(indicePedido);
        System.out.println("Orden recibida.");
        
    }

    public void desplegarEntregaPlatillo(){
        System.out.println("Le entrego su platillo y con ella su ticket:");
        System.out.println(orden.toString());
    }

}