package io.github.mkaksoy.elementapi.api.logger;

public class Logger {
    public static void log(String name, String message, LogType type) {
        final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(name);
        String prefix = "[" + type + "] ";

        switch (type) {
            case INFO:
            case DEBUG:
                logger.info(prefix + message);
                break;
            case WARN:
                logger.warning(prefix + message);
                break;
            case ERROR:
                logger.severe(prefix + message);
                break;
        }
    }
}