package com.foo.plugin;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Pavel
 */
public class BarTest {
    
    private static final Logger logger = LoggerFactory.getLogger(BarTest.class);
    
    private boolean weAreAmongModules = false;
    
    @Test
    void tempTest() {
        Bar bar = new Bar();
        logger.info("======UNIT TEST=======");
        logger.info("Lets see JDKModulePath: {}", System.getProperty("jdk.module.path"));
        ModuleLayer.boot().modules().stream().forEach(m -> {
            if (m == this.getClass().getModule() || m == Bar.class.getModule() || m == Logger.class.getModule()) {
                this.weAreAmongModules = true;
            }
        });
        logger.info("");
        logger.info("Let's see if I or SLF4J are among boot layer modules: {}", this.weAreAmongModules);
        if (!this.weAreAmongModules) {
            logger.info("Maybe we are in child layer? Or this is not module path?");
        }
    }
}
