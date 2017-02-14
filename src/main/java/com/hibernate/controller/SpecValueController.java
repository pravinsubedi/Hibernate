package com.hibernate.controller;

import com.hibernate.entity.Spec_value;
import com.hibernate.entity.Specification;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by pravin on 2/13/2017.
 */
@Controller
public class SpecValueController {

    @Autowired
    SessionFactory sessionFactory;
    Session session;

    @Transactional
    @RequestMapping(value = "/specValue",method = RequestMethod.POST,consumes = "application/json",headers = "Content-Type=application/json")
    @ResponseBody
    public String addSpec(@RequestBody Spec_value specification) throws SQLException {
        session=sessionFactory.getCurrentSession();
        session.save(specification);
        return "specification value saved";
    }

    @Transactional
    @RequestMapping(value = "/specValue",method = RequestMethod.GET)
    @ResponseBody
    public List<Specification> showSpec() throws SQLException {
        session=sessionFactory.getCurrentSession();
        return session.createCriteria(Spec_value.class).list();
    }
}
