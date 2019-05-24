package com.myspring.application.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "entity")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DefaultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, name = "item_name")
    private String itemName;

}
