package com.hibernate.entity;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 * Created by pravin on 2/13/2017.
 */
@Entity
public class Spec_value {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sv_id;
    private String value;
//    @OneToOne
//    @JoinColumn(name = "spec_id")
//    Specification specification;
//    @ManyToOne
//    @JoinColumn(name = "spec_id")
//    Specification specification;

    public Spec_value() {
    }

    public int getS_id() {
        return sv_id;
    }

    public void setS_id(int s_id) {
        this.sv_id = s_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Spec_value(int s_id, String value) {
        this.sv_id = s_id;
        this.value = value;
    }

//    public Specification getSpecification() {
//        return specification;
//    }
//
//    public void setSpecification(Specification specification) {
//        this.specification = specification;
//    }
}


