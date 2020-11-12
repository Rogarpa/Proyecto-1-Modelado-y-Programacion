public class EstadoCaminando implements EstadoRobot{
    
    protected Robot dueño;

    public EstadoCaminando(Robot dueño){
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
        System.out.println("Llendo a la barra");
        dueño.setEstadoActual(dueño.getAtendiendo());
    }
    @Override public void caminar(){
        System.out.println("No es posible caminar.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }
    @Override public void irALaCocina(){
        System.out.println("Llendo a la cocina");
        dueño.setEstadoActual(dueño.getCocinando());
    }
    @Override public void cocinar(){
        System.out.println("No es posible cocinar.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }

}
