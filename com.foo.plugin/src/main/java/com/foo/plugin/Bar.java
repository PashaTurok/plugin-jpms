
package com.foo.plugin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Pavel
 */
public class Bar {
    
    private static final Logger logger = LoggerFactory.getLogger(Bar.class);
    
    public void test() {
        logger.info("I work");
    }
}
