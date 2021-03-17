package org.records1;

public record PersonRecord(String firstName, String lastName)
        implements Person, java.io.Serializable {
}