package com.robert.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author：李艳鹏
 * @since：Jun 11, 2017 6:20:27 PM
 * @version: 1.0
 */
public class Log4j2Demo {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

        logger.trace("Trace Level");
        logger.debug("Debug Level");
        logger.info("Info Level");
        logger.warn("Warn Level");
        logger.error("Error Level");
        logger.fatal("Fatal Level");
    }
}
