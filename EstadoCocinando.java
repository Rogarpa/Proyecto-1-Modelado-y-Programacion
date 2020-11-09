public class public EstadoCocinando implements EstadoRobot{

    protected Robot dueño;

    public EstadoCocinando(Robot dueño){
        this.dueño = dueño;
    }
    
    @Override void activarse(){
        System.out.println("No es posible activarse.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.")
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
        System.out.println("Caminando");
        dueño.setEstadoActual(dueño.getCaminar());
    }
    @Override void irALaCocina(){
        System.out.println("No es posbile ir a la cocina.");
        throw new UnsupportedOperationException("Acción no disponible en el robot.")
    }
    @Override void cocinar(){
        System.out.println("Cocinando");
        dueño.setEstadoActual(dueño.getCocinando());
    }

}
