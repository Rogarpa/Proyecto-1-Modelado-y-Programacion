public class Pizzas implements Cocinar{

    protected MenuItem aCocinar;

    public void cocinar(MenuItem platillo){
    System.out.println("Preparando masa fresca.");
    System.out.println("Agregando la salsa a la pizza.");
    System.out.println("Agregamos los toppings y la metemos al horno de barro.");
    System.out.println("Esperamos... tu pizza está lista y crocante.");
    }

}
