package utility;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EonTransfer {

    public static void eonTransfer(String eon, Float amount) throws InterruptedException {

        Process proc = null;

        //    String command = "cd /home/rem/Загрузки/EON_82/";
        List<String> command = new ArrayList<String>();
        command.add("home");
        //    command.add("--headless");
        //     command.add("--convert-to pdf:'writer_pdf_Export' --outdir " + getDestinationDirectory(order) + " " + getInvoiceFilename() + ".fodt");

        try {

            String eon_command = "./eon payment -r "+eon+" -a "+amount;

            String[] cmd = { "/bin/sh", "-c", "pwd; cd /home/rem/Загрузки/EON_82/; ./bal_add.sh" };
//./eon payment -r EON-H8XCD-9WCJU-EGNYU -a 100

            //  proc = Runtime.getRuntime().exec("cd /home/rem/Загрузки/EON_82/");
            proc = Runtime.getRuntime().exec(cmd);
            //  proc = Runtime.getRuntime().exec(String.valueOf(command));
            //Process proc = new ProcessBuilder("xterm", "-c", "sh /home/rem/Загрузки/EON_82/bal_add.sh").start();
            //Process proc = new ProcessBuilder("/bin/sh", "-c", "sh /home/rem/Загрузки/EON_82/bal_add.sh").start();
            //exec(command);
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(proc.getInputStream()));

            String line = "";
            while((line = reader.readLine()) != null) {
                System.out.print(line + "\n");
            }

            proc.waitFor();


        } catch (Exception e) {

            e.printStackTrace();
        }



    }



}
