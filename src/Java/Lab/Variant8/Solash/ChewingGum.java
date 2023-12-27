package Java.Lab.Variant8.Solash;

public class ChewingGum extends Food{
    private String flavour;

    static int Count = 0;
    public ChewingGum(String flavour) {
        super("жевательная резинка");
        this.flavour = flavour;
    }
    public void consume() {
        System.out.println(this + " сжёвана");
    }
    public String getFlavour() {
        return flavour;
    }
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String toString() {
        return super.toString() + " привкус '" + flavour.toUpperCase() + "'";
    }


}