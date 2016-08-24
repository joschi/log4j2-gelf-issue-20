package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class Main {
    private static final Logger logger = LogManager.getLogger("HelloWorld");

    public static void main(String[] args) {
        ThreadContext.put("test", "foobar");
        ThreadContext.push("Test");
        logger.info("Hello, World!");
    }
}
