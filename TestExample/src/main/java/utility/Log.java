package utility;

import org.apache.log4j.Logger;

public class Log {

    private static Logger Log = Logger.getLogger(utility.Log.class.getName());
  //  private static FileAppender fileAppender = new FileAppender();

    public static void startTestCase(String sTestCaseName) {

      /*  fileAppender.setFile("logfile.log");
        fileAppender.setLayout(new SimpleLayout());
        Log.addAppender(fileAppender);
        fileAppender.activateOptions();
        */

        Log.info("****************************************************************************************");

        Log.info("                     " + sTestCaseName + "                     ");


        Log.info("****************************************************************************************");
    }

        public static void endTestCase(String sTestCaseName){

            Log.info("                     " + "-E---N---D-" + "                     ");

            Log.info("X");

            Log.info("X");

            Log.info("X");

            Log.info("X");

        }

    // Need to create these methods, so that they can be called

    public static void info(String message) {

        Log.info(message);

    }

    public static void warn(String message) {

        Log.warn(message);

    }

    public static void error(String message) {

        Log.error(message);

    }

    public static void fatal(String message) {

        Log.fatal(message);

    }

    public static void debug(String message) {

        Log.debug(message);

    }
}

