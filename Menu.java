import java.util.Iterator;

public interface Menu {
	public Iterator<?> createIterator();

	String name;
	public String getName() {
		return name;
	}
}
