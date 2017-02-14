package com.hibernate.entity;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * Created by pravin on 2/13/2017.
 */
@Entity
public class Specification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int spec_id;
    private String spec_name;
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "spec_id")
    List<Spec_value> spec_value;


        public Specification() {
        }

        public Specification(int spec_id, String spec_name) {
            this.spec_id = spec_id;
            this.spec_name = spec_name;
        }

        public Specification(String spec_name) {
            this.spec_name = spec_name;
        }

        public int getSpec_id() {
            return spec_id;
        }

        public void setSpec_id(int spec_id) {
            this.spec_id = spec_id;
        }

        public String getSpec_name() {
            return spec_name;
        }

        public void setSpec_name(String spec_name) {
            this.spec_name = spec_name;
        }

    public List<Spec_value> getSpec_value() {
        return spec_value;
    }

    public void setSpec_value(List<Spec_value> spec_value) {
        this.spec_value = spec_value;
    }
}
