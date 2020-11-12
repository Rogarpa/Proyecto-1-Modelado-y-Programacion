public class Hamburguesas implements Cocinar{

    protected MenuItem aCocinar;

    public void cocinar(MenuItem platillo){
        System.out.println("Calentando la plancha.");
        System.out.println("Preparando los panes de la Hamburguesa.");
        System.out.println("Calentando la carne en la plancha.");
        System.out.println("Juntanto todo... Está lista tu Hamburguesa");
    }

}
