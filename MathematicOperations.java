public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Devuleve un entero hacia arriba
        System.out.println(Math.ceil(x));

        //Devuleve un entero hacia abajo
        System.out.println(Math.floor(x));

        //Devuelve un número elevado a otro
        System.out.println(Math.pow(x,y));

        //Mayor entre dos valores
        System.out.println(Math.max(x,y));

        //Devolver raíz cuadrada
        System.out.println(Math.sqrt(y));

        //Area de un circulo
        // pi * r^2
        System.out.println(Math.PI * Math.pow(y,2));

        //Area de una esfera
        // 4*PI*r^2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //Volumen de una esfera
        // (4/3) * PI * r^3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));

    }
}
