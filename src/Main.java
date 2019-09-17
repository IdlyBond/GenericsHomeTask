import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Задание Generics1
        Generics1 gen = new Generics1();
        String[] lines = {"line1", "line2", "line3"};
        gen.changePositions(lines, 0, 2);
        for (String line: lines) System.out.print(line);
        System.out.println();

        // Задание Generics2
        Generics2 gen2 = new Generics2();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(6);
        integerList.add(5);
        integerList.add(9);
        integerList.add(6);
        System.out.println(integerList);
        System.out.println(gen2.getMaxElement(integerList));
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(6.4);
        doubleList.add(5.1);
        doubleList.add(-1.0);
        doubleList.add(6.1);
        System.out.println(doubleList);
        System.out.println(gen2.getMaxElement(doubleList));
    }
}
