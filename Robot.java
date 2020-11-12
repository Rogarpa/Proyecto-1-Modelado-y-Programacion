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

    public Robot(){
        caminando = new EstadoCaminando(this);
        cocinando = new EstadoCocinando(this);
        atendiendo = new EstadoAtendiendo(this);
        suspendido = new EstadoSuspendido(this);

        EstadoActual = suspendido;

        //FALTA INSTANCIAR MENU
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
        
        //ARREGLAR ITERACION LIMITE SUPERIOR E INFERIOR
        indicePedido = getint("Digite el numero de la opcion y presione enter:" + "/n" + menuMaster.toString() ,"No es un numero valido.",1,2);
        menuMaster.buscaHoja(indicePedido);
        System.out.println("Orden recibida.");
        
    }

    public void desplegarEntregaPlatillo(){
        System.out.println("Le entrego su platillo y con ella su ticket:");
        System.out.println(orden.toString());
    }

}