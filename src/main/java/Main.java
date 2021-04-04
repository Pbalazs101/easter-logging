
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import java.util.Optional;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    private static final Marker STATEMENT_MARKER = MarkerManager.getMarker("STATEMENT");
    private static final Marker QUESTION_MARKER = MarkerManager.getMarker("QUESTION");

    private static void sleep(){
        try{
            Thread.sleep(1500);
        }
        catch (InterruptedException e){
            System.out.println("Execution got interrupted");
        }
    }

    public static void main(String[] args) {

        int iterations = 1;

        try{
            iterations = Integer.parseInt(args[0]);
        }
        catch(Exception e){
            System.out.println("Missing argument defaulting to 1");
        }

        for (int i = 0; i < iterations; i++)
        {
            sleep();
            logger.fatal(STATEMENT_MARKER,"Zöld erdőben jártam,");
            sleep();
            logger.warn("Kék ibolyát láttam,");
            sleep();
            logger.info(STATEMENT_MARKER,"El akart hervadni,");
            sleep();
            logger.error(QUESTION_MARKER, "Szabad-e locsolni?");
        }
    }
}
