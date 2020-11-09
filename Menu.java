import java.util.Iterator;
import java.util.ArrayList;

public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String nombre;
    String descripcion;

    public Menu(String nombre, String description) {
        this.nombre = nombre;
        this.descriction = descripcion;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
    }

    public String getNombre() {
        return name;
    }

    public String getDescripcion() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getNombre());
        System.out.println(", " + getDescripcion());
        System.out.println("---------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent =
                (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}
