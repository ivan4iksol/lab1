package Java.Lab.Variant8.Solash;

public class Apple extends Food{

    private String size;

    static int Count = 0;

    public Apple(String size) {
        super ("Яблоко");
        this.size = size;
    }

    public void consume() {		System.out.println(this + " съедено");	}

    public String getSize() {	return size;	}

    public void setSize(String size) {	this.size = size;	}



    public String toString() {	return super.toString() + " размера '" + size.toUpperCase() + "'";	}
}
