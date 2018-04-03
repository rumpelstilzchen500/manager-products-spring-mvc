package com.rumpel.common.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Product implements Serializable{

    private Long id;
    private String fullName;
    private String article;
    private String code_id_from_1c;
    private String code;
    private Integer price_retail;
    private Integer price_wholesale;
    private Integer price_purchase;
    private Set<Taste> tastes = new HashSet<Taste>();

    public Product() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Column(name = "article")
    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "price_retail")
    public Integer getPrice_retail() {
        return price_retail;
    }

    public void setPrice_retail(Integer price_retail) {
        this.price_retail = price_retail;
    }

    @Column(name = "price_wholesale")
    public Integer getPrice_wholesale() {
        return price_wholesale;
    }

    public void setPrice_wholesale(Integer price_wholesale) {
        this.price_wholesale = price_wholesale;
    }

    @Column(name = "price_purchase")
    public Integer getPrice_purchase() {
        return price_purchase;
    }

    public void setPrice_purchase(Integer price_purchase) {
        this.price_purchase = price_purchase;
    }

    @Column(name = "code_id_from_1c")
    public String getCode_id_from_1C() {
        return code_id_from_1c;
    }

    public void setCode_id_from_1C(String code_id_from_1C) {
        this.code_id_from_1c = code_id_from_1C;
    }

    @ManyToMany(mappedBy = "products")
    public Set<Taste> getTastes() {return tastes;}

    public void setTastes(Set<Taste> tastes) {this.tastes = tastes;}
}
