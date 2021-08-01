package com.example.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.apache.logging.log4j.Logger;
//import ch.qos.logback.classic.Logger;
//import java.util.logging.Logger;

@RestController
public class ControllerLog {

    private static final Logger logger = LoggerFactory.getLogger(ControllerLog.class);

    @RequestMapping("/log")
    public String index() {

        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        return "Howdy! Check out the Logs to see the output...";
    }
}
