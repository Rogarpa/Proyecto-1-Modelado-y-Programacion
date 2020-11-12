public class EstadoCocinando implements EstadoRobot{

    protected Robot dueño;

    public EstadoCocinando(Robot dueño){
        this.dueño = dueño;
    }
    
    @Override public void activarse(){
        System.out.println("No es posible activarse.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }
    @Override public void suspenderse(){
        System.out.println("No es posible suspenderse.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }
    @Override public void recibirOrden(){
        System.out.println("No es posible recibir la orden.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }
    @Override public void entregarPlatillo(){
        System.out.println("No es posible entregar el platillo.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }
    @Override public void irALaBarra(){
        System.out.println("No es posible ir a la barra.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }
    @Override public void caminar(){
        System.out.println("Caminando");
        dueño.setEstadoActual(dueño.getCaminando());
    }
    @Override public void irALaCocina(){
        System.out.println("No es posbile ir a la cocina.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }
    @Override public void cocinar(){
        System.out.println("Cocinando");
        dueño.setEstadoActual(dueño.getCocinando());
    }

}
