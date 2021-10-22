public class WhileLoop {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {

        turnOnOffLight();

        int i = 1;

        while (isTurnOnLight && i <= 10){
            printSOS();
            i++;
        }

    }

    /**
     * Description: This function print a SOS message simulating the signal SOS that you use when you need help*/
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    /**
     * Description: This function change the state of the lamp of the cellphone, but it is a simulation. This function
     * includes the ternario operation wich permits to save a lot of code lines and goes like
     * (variableToEvaluate)?ValueIfItIsTrue:ValueIfItIsFalse
     * @return
     */
    public static boolean turnOnOffLight(){

        isTurnOnLight = (isTurnOnLight)?false:true;
//        Se llama operador terniario sirve para simplificar todo el siguiente código e indica si el valor en el parentesis es verdadero devuelve el primer valor, de lo contrario devuelve el segundo
//        if (isTurnOnLight){
//            isTurnOnLight = false;
//        } else{
//            isTurnOnLight = true;
//        }
        return isTurnOnLight;
    }
}
