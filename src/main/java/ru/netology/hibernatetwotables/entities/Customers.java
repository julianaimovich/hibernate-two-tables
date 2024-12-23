package ru.netology.hibernatetwotables.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String surname;

    private int age;

    private String phoneNumber;

    @OneToOne(mappedBy = "customers")
    private Orders orders;
}