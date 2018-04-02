package com.rumpel.common.models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "taste")
public class Taste {

    private Long id;
    private String name;
    private String bar_code;

    private Set<Shop> shops = new HashSet<Shop>();
    private Set<Product> products = new HashSet<Product>();

    public Taste() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "taste_id")
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

    @Column(name = "bar_code")
    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }

    @ManyToMany
    @JoinTable(name = "taste_shop",
            joinColumns = {@JoinColumn(name = "taste_id") },
            inverseJoinColumns = {@JoinColumn(name = "shop_id")})
    public Set<Shop> getShops() {
        return shops;
    }

    public void setShops(Set<Shop> shops) {
        this.shops = shops;
    }

    @ManyToMany
    @JoinTable(name = "product_taste",
            joinColumns = {@JoinColumn(name = "taste_id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id")})
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
