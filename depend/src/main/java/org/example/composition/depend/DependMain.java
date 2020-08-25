package org.example.composition.depend;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class DependMain {
  public static void info() {
    System.out.println("I am version 1.0");

  }

  public static int getResources() {
    int i = 0;
    try {
      Enumeration<URL> enumeration = DependMain.class.getClassLoader().getResources("depend.info");
      while (enumeration.hasMoreElements()) {
        i++;
        System.out.println(enumeration.nextElement());
      }
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("Total: " + i);
    return i;
  }

  public static void main(String[] a) {
    info();

    getResources();
  }
}
