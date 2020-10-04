package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //#1- We created the properties object
    private static Properties properties = new Properties();


    static {
        try {
            //#2- We get the path and pass it into FileInputStream, to open the file
            FileInputStream file = new FileInputStream("configuration.properties");
        } catch (IOException e) {
            System.out.println("Properties file not found.");
        }
        //#3- We load the opened file into properties object
    }
    //#4- We read from file
    //#5- close the file


}
