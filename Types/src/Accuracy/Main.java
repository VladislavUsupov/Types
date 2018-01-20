package Accuracy;

public class Main {

    public static void main(String[] args)
    {
        float f1 = 0.998f;
        float f2 = 1.2f;

        double d1 = f1 + 0.002;
        double d2 = f2 - 0.2;

        if (d1 == d2) System.out.println("d1 == d2");
        else System.out.println(d1 + " != " + d2);

        float a, b, f;
        a = 2000;
        b = 0.00001f;
        f = a - b;
        System.out.println(f);

    }

    //1.0000000257492065 != 1.0000000476837159
    //2000.0

}
