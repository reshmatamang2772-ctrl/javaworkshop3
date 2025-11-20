
/**
 * Write a description of class QUESTIONSIX here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QUESTIONSIX{

    public static void main (String[] args){
        int WaterLevel=1000;
        System.out.println("Current Water Level:" + WaterLevel + "L");
        String message = ( WaterLevel >= 1000)
        ?"Warning: WaterLevel has reached 1000L or more!"
        :"status: Normal";
        System.out.println(message);
    }        
}