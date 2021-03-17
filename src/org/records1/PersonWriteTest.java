package org.records1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonWriteTest {
  public static void main(String... args) throws IOException {
    try (var out = new ObjectOutputStream(new FileOutputStream("persons.bin"))) {
      out.writeObject(new PersonRecord("Heinz", "Kabutz"));
      out.writeObject(new PersonClass("Heinz", "Sommerfeld"));
      out.writeObject(null);
    }
  }
}
