package org.records1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonReadTest {
  public static void main(String... args) throws IOException, ClassNotFoundException {
    try (var in = new ObjectInputStream(new FileInputStream("persons.bin"))) {
      Person p;
      while ((p = (Person) in.readObject()) != null) {
        System.out.println(p);
      }
    }
  }
}

// why?
// PersonRecord[firstName=Heinz, lastName=Kabutz]
// org.records.PersonClass@71d095c9
