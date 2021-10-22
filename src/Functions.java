public class Functions {
    public static void main(String[] args) {
        double y = 3;
        //Area de un circulo
        double area = circleArea(y);
        System.out.println(area);

        //Area de una esfera
        System.out.println(sphereArea(y));

        //Volumen de una esfera
        System.out.println(sphereVolume(y));

        System.out.println("PESOS a DOLARES: " + converToDolar(200,"MXN"));
        System.out.println("PESOS a DOLARES: " + converToDolar(200,"COP"));

    }

    public static double circleArea (double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea (double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolume (double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Description: This function convert a currency (MXN, COP) into dollars.
     * @param quantity Amount of money in the currency you want to convert to dollar.
     * @param currency It only accept MXN or COP.
     * @return quantity This return the amount in dollars.
     */
    public static double converToDolar(double quantity, String currency){
        //MXN o COP
        switch (currency){
            case"MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
        }
        return quantity;
    }

}
