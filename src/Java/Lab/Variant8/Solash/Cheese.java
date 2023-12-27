package Java.Lab.Variant8.Solash;

public class Cheese extends Food {

    static int Count = 0;

    public Cheese() {	super("Сыр");	}

    public void consume() {	System.out.println(this + " съеден");	}

}
