/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log4JDemo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 *
 * @author SB604-19
 */
public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public void tampil(String msg) {
        if (logger.isDebugEnabled()) {
            logger.debug("Ini adalah debug message : " + msg);
        }

        if (logger.isInfoEnabled()) {
            logger.info("ini adalah info message : " + msg);
        }

        logger.warn("Ini adalah warn message : " + msg);
        logger.error("Ini adalah error message : " + msg);
        logger.fatal("Ini adalah fatal message : " + msg);

    }

    public static void main(String[] args) {

        BasicConfigurator.configure();

        Main main = new Main();
        main.tampil("Contoh Log4J");

    }
}
