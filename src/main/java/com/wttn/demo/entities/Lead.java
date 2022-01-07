package com.wttn.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "lead_data")
@Entity
public class Lead {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String desc;
}
