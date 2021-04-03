
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    private static void sleep(){
        try{
            Thread.sleep(1500);
        }
        catch (InterruptedException e){
            System.out.println("Execution got interrupted");
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++)
        {
            sleep();
            logger.fatal("Zöld erdőben jártam,");
            sleep();
            logger.warn("Kék ibolyát láttam,");
            sleep();
            logger.info("El akart hervadni,");
            sleep();
            logger.error("Szabad-e locsolni?");
        }
        /*
        logger.fatal("This is a FATAL message");
        logger.error("This is an ERROR message");
        logger.warn("This is a WARN message");
        logger.info("This is an INFO message");
        logger.debug("This is a DEBUG message");
        logger.trace("This is a TRACE message");
        logger.info("Java version is {}", System.getProperty("java.version"));
        logger.trace("Available free memory: {} kB", () -> Runtime.getRuntime().freeMemory() / 1024);
         */
    }
}
