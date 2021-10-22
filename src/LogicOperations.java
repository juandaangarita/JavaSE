public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        // Operadores de asignación
        System.out.println("a es igual a b? " + (a == b));
        System.out.println("a es diferente a b" + (a != b));
        //Operadores relacionales
        System.out.println("a es mayor a b?" + (a > b));
        System.out.println("a es menor o igual a b" + (a <= b));

        if ((a == b) && (a > b)){
            System.out.println("a es igual a b y mayor");
        } else if (a != b){
            System.out.println("a es diferente a b");
        }else if (a > b){
            System.out.println("a es mayor que b");
        } else if (a <= b){
            System.out.println("A es menor o igual que b");

        }
    }
}
