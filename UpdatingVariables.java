public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        // bono $200 adición
        salary += 200;
        System.out.println(salary);

        // pension: $50 descuento
        salary -= 50;
        System.out.println(salary);

        // 2 horas extra $30 c/u adición
        //comida: $45 desceunto
        salary = salary + (2 * 30);
        salary = salary - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Juan David Angarita";
        employeeName = employeeName + " Colorado";
        System.out.println(employeeName);
        employeeName = "Ing " + employeeName;
        System.out.println(employeeName);
    }
}
