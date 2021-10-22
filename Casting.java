public class Casting {
    public static void main(String[] args) {
        // En un año ubicar 30 perritos
        // Cuántos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //Estimación (Siempre trunca, es decir covierte al entero menor)
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        double c = (double) a / b;
        System.out.println(c);

        char n ='1';
        int nI = n;
        System.out.println(n);
        System.out.println(nI);

        short nS = (short)  n;
        System.out.println(nS);

        // Lección 21 Ejercicio 2 platzi
        char cz = 'z';
        int nC = cz;
        int i = 250; //conviertelo a long y luego de long a short
        double d = 301.067; //conviertelo a long
        int j = 100; //súmale 5000.66 y conviertelo a float
        int k = 737; //multiplícalo por 100 y conviertelo a byte
        double e = 298.638; //divídelo entre 25 y conviertelo a long
    }
}
