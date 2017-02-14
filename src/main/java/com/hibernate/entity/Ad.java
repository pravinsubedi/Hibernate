package com.hibernate.entity;

import javax.persistence.*;

/**
 * Created by pravin on 2/13/2017.
 */
@Entity
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ad_id;
    private String ad_name;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id")
//    Catagory catagory;

    public Ad(int ad_id, String ad_name) {
        this.ad_id = ad_id;
        this.ad_name = ad_name;
    }

    public Ad() {
    }

    public int getAd_id() {
        return ad_id;
    }

    public void setAd_id(int ad_id) {
        this.ad_id = ad_id;
    }

    public String getAd_name() {
        return ad_name;
    }

    public void setAd_name(String ad_name) {
        this.ad_name = ad_name;
    }

//    public Catagory getCatagory() {
//        return catagory;
//    }
//
//    public void setCatagory(Catagory catagory) {
//        this.catagory = catagory;
//    }
//
//    public Ad(int ad_id, String ad_name, Catagory catagory) {
//        this.ad_id = ad_id;
//        this.ad_name = ad_name;
//        this.catagory = catagory;
//    }
}
