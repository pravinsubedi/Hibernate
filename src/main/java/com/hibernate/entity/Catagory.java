package com.hibernate.entity;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * Created by pravin on 2/13/2017.
 */
@Entity
public class Catagory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private String cat_name;
    private int parent_id;

    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "id")
    List<Ad> ads;

    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "id")
    List<Specification> specifications;

    public Catagory(int id, String cat_name) {
        this.id = id;
        this.cat_name = cat_name;
    }

    public Catagory(String cat_name) {
        this.cat_name = cat_name;
    }

    public Catagory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public Catagory(String cat_name, List<Ad> ads) {
        this.cat_name = cat_name;
        this.ads = ads;
    }

    public List<Ad> getAds() {
        return ads;
    }

    public void setAds(List<Ad> ads) {
        this.ads = ads;
    }

//    public Catagory(String cat_name, int parent_id, List<Ad> ads) {
//        this.cat_name = cat_name;
//        this.parent_id = parent_id;
//        this.ads = ads;
//    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public Catagory(String cat_name, int parent_id, List<Ad> ads, List<Specification> specifications) {
        this.cat_name = cat_name;
        this.parent_id = parent_id;
        this.ads = ads;
        this.specifications = specifications;
    }

    public List<Specification> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<Specification> specifications) {
        this.specifications = specifications;
    }

    public Catagory(String cat_name, int parent_id, List<Specification> specifications) {
        this.cat_name = cat_name;
        this.parent_id = parent_id;
        this.specifications = specifications;
    }
}

