package com.fundamentals.practice;
import java.io.Serializable;
public class SerializationPractice implements Serializable {
    int id;
    String name;
    public SerializationPractice(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}
