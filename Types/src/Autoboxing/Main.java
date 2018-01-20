package Autoboxing;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer in = new Integer(-150);

        //Распаковка через вызов метода
        int value = method(in);
        System.out.println("value " + in + " = " + value);

        //Автоупаковка через вызов метода
        List<Double> doubleList = new ArrayList<Double>();
        doubleList.add(3.1415926535);

        //Распаковка через присвоение
        double pi = doubleList.get(0);
        System.out.println("Pi = " + pi);
    }

    public static int method(int i) {
        return i;
    }
}