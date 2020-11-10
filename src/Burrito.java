import java.util.Hashtable;
import java.util.LinkedList;

public class Burrito implements ElementoMenu{

    protected Hastable<Integer,ElementoMenu> listaHijos;

    public Burrito(){
        listaHijos = new Hashtable<>();
    }


    */
    public void agregarHijo(ElementoMenu h){
        listaHijos.add(h);
<<<<<<< HEAD
=======
    }

    public void eliminaHIjo(ElementoMenu h){
        listaHijos.remove(h);
>>>>>>> 7a32041ca6ed9786223c4b11d64b1605bcd25cd4
    }

    @Override
    public String toString(){
        return "";
    }
<<<<<<< HEAD

    @Override
    public void buscaHoja(){
=======
    public Hoja buscaHoja(){
>>>>>>> 7a32041ca6ed9786223c4b11d64b1605bcd25cd4

    }

    @Override
    public LinkedList<Integer> rangoHojas(){
        return null;
    }
}
