
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

        for (int i = 1; i < iterations+1; i++) //Starting from 1 in order to match the iteration number with the current i variable. 1 added to iterations so it doesn't affect cl arguments.
        {
            ThreadContext.put("iteration",String.format("%d",i));

            sleep();
            logger.fatal(STATEMENT_MARKER,"E szép házba nyitottam,");
            sleep();
            logger.warn("Nefelejcset találtam,");
            sleep();
            logger.info(STATEMENT_MARKER,"Nem hagyhatom hervadni,");
            sleep();
            logger.error(QUESTION_MARKER, "Meg szabad-e locsolni?");
        }
    }
}
