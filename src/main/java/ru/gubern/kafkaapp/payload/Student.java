package ru.gubern.kafkaapp.payload;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {

    private int id;
    private String firstname;
    private String lastname;
}
