public class ForLoop {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();
        for (int i = 0; i <= 10; i++) {
            printSOS();
        }
    }

    /**
     * Description: This function print a SOS message simulating the signal SOS that you use when you need help*/
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    /**
     * Description: This function change the state of the lamp of the cellphone, but it is a simulation. 
     * @return
     */
    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
