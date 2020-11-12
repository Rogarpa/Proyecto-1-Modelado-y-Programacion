public class EstadoAtendiendo implements EstadoRobot{
    protected Robot dueño;

    public EstadoAtendiendo(Robot dueño){
        this.dueño = dueño;
    }
    
    @Override public void activarse(){
        System.out.println("No es posible activarse.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }
    @Override public void suspenderse(){
        System.out.println("Suspendiendo");
        dueño.setEstadoActual(dueño.getSuspendido());
    }
    @Override public void recibirOrden(){
        System.out.println("Recibiendo Orden.");
        dueño.desplegarRecepcionOrden();
        dueño.setEstadoActual(dueño.getAtendiendo());
    }
    @Override public void entregarPlatillo(){
        System.out.println("Entregando Platillo.");
        dueño.desplegarEntregaPlatillo();
        dueño.setEstadoActual(dueño.getAtendiendo());
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
        System.out.println("No es posible cocinar.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.");
    }


}
