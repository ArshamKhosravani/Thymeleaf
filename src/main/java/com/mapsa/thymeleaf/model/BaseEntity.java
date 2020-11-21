package com.mapsa.thymeleaf.model;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity<T extends Serializable> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 15, nullable = false, unique = true)
    private T id;

    public BaseEntity() {
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
