public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5; // vidas inciales
        lives -= 1;
        System.out.println(lives);
        //Forma posfija
        lives--; //Decremento
        System.out.println(lives);

        // acá me gané una vida
        lives++; //Incremento
        System.out.println(lives);
        //Forma prefija
        int gift = 100 + lives++; //Primero se ingresa al valor, se realiza la operación y después se incrementa lives
        System.out.println(gift);
        System.out.println(lives); // Acá se evidencia que la variable con el ++ al final se incrementó


    }
}
