package Lesson4.SingletonClass;

// Understanding Singleton Class
// A Singleton class in Java is a class that allows only one instance of itself to be created
// and provides a way to access that instance from anywhere in the program. Singleton classes
// are appropriate when you want to ensure that there's only one instance of a class throughout
// the entire application, such as logging, configuration settings, database connections, etc.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance = null;
    
    private Logger() {
        // Private constructor to prevent instantiation
    }
    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    public void log(String message) {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println("[" + formattedTime + "] " + message);
    }
}

