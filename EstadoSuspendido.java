public class public EstadoSuspendido implements EstadoRobot{
    
    protected Robot dueño;

    public EstadoSuspendido(Robot dueño){
        this.dueño = dueño;
    }
    
    @Override void activarse(){
        System.out.println("Activandose.");
        dueño.setEstadoActual(dueño.getAtendiendo());
    }
    @Override void suspenderse(){
        System.out.println("No es posible suspenderse.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.")
    }
    @Override void recibirOrden(){
        System.out.println("No es posible recibir la orden.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.")
    }
    @Override void entregarPlatillo(){
        System.out.println("No es posible entregar el platillo.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.")
    }
    @Override void irALaBarra(){
        System.out.println("No es posible ir a la barra.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.")
    }
    @Override void caminar(){
        System.out.println("No es posible caminar.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.")
    }
    @Override void irALaCocina(){
        System.out.println("No es posbile ir a la cocina.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.")
    }
    @Override void cocinar(){
        System.out.println("No es posible cocinar.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.")
    }

}
