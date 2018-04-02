package com.rumpel.common.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "shop")
public class Shop implements Serializable{
    private Long id;
    private String name;
    private String location;


    private Set<Taste> tastes = new HashSet<Taste>();

    public Shop() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shop_id")
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @ManyToMany (mappedBy = "shops")
    public Set<Taste> getTastes() {
        return tastes;
    }

    public void setTastes(Set<Taste> tastes) {
        this.tastes = tastes;
    }
}
