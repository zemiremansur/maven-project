package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

  private static Properties properties;

//read the properties file
  static {

      String path ="configuration.properties";

      try {
          // JAVA CAN NOT READ FILES DIRECTLY , IN NEEDS INPUTSTREAM TO READ FILES
          // INPUTSTREAM TAKES THE LOCATION OF THE FILE AS A CONTRUCTOR.

          FileInputStream fileInputStream = new FileInputStream(path);

          //Properties is used to read spacofocally properties files, files with key value pairs
          properties = new Properties();

          //file contents are load to properties from the inputstream
          properties.load(fileInputStream);

          //all inout stream must be closed
          fileInputStream.close();

      } catch (IOException e) {

          e.printStackTrace();

      }

  }
  //return the value of specific property
  public static String getProperty(String property){
      return properties.getProperty(property);

  }



}
