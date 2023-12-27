package Java.Lab.Variant8.Solash;

public class Main {
    public static void main( String[] args) {
        Food[] breakfast = new Food[20];
        ChewingGum coffee = new ChewingGum (null);
        Cheese cheese = new Cheese();
        Apple apple = new Apple(null);

        int itemsSoFar = 0;

        for (String arg: args) {
            String[] parts = arg.split("/");

            if (parts[0].equals("ChewingGum")) {
                breakfast[itemsSoFar] = new ChewingGum(parts[1]);
            } else
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else
            if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            itemsSoFar++;
        }
        for (Food item: breakfast)
            if (item!=null)
            {
                if (item.equals(coffee)) ChewingGum.Count++;
                if (item.equals(cheese)) Cheese.Count++;
                if (item.equals(apple)) Apple.Count++;
                item.consume();
            }
            else
                break;
        System.out.println("Съедено сыра: " + Cheese.Count);
        System.out.println("Съедено яблок: " + Apple.Count);
        System.out.println("Сжёвано жвачек: " + ChewingGum.Count);
        System.out.println("Всего хорошего!");
    }
}