public class public EstadoAtendiendo implements EstadoRobot{
    protected Robot dueño;

    public EstadoAtendiendo(Robot dueño){
        this.dueño = dueño;
    }
    
    @Override void activarse(){
        System.out.println("No es posible activarse.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.")
    }
    @Override void suspenderse(){
        System.out.println("Suspendiendo");
        dueño.setEstadoActual(dueño.getSuspendido());
    }
    @Override void recibirOrden(){
        System.out.println("Recibiendo Orden.");
        dueño.desplegarRecepcionOrden();
        dueño.setEstadoActual(dueño.getAtendiendo());
    }
    @Override void entregarPlatillo(){
        System.out.println("Entregando Platillo.");
        dueño.entregarPlatillo();
        dueño.setEstadoActual(dueño.getAtendiendo());
    }
    @Override void irALaBarra(){
        System.out.println("No es posible ir a la barra.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.")
    }
    @Override void caminar(){
        System.out.println("Caminando");
        dueño.setEstadoActual(dueño.getCaminar());
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
