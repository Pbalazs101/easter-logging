
import org.apache.logging.log4j.*;

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
            System.out.println("Missing argument. Using default value: 1");
        }

        for (int i = 1; i < iterations+1; i++)
        {
            ThreadContext.put("iteration",String.format("%d",i));

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
