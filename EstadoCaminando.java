public class EstadoCaminando implements EstadoRobot{
    
    protected Robot dueño;

    public EstadoCaminando(Robot dueño){
        this.dueño = dueño;
    }
    
    @Override void activarse(){
        System.out.println("No es posible activarse.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }
    @Override void suspenderse(){
        System.out.println("No es posible suspenderse.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }
    @Override void recibirOrden(){
        System.out.println("No es posible recibir la orden.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }
    @Override void entregarPlatillo(){
        System.out.println("No es posible entregar el platillo.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }
    @Override void irALaBarra(){
        System.out.println("Llendo a la barra");
        dueño.setEstadoActual(dueño.getAtendiendo());
    }
    @Override void caminar(){
        System.out.println("No es posible caminar.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }
    @Override void irALaCocina(){
        System.out.println("Llendo a la cocina");
        dueño.setEstadoActual(dueño.getCocinando());
    }
    @Override void cocinar(){
        System.out.println("No es posible cocinar.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }

}
