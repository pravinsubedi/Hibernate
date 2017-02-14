package com.hibernate.controller;

import com.hibernate.entity.Ad;
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
public class SpecificationController {

    @Autowired
    SessionFactory sessionFactory;
    Session session;

    @Transactional
    @RequestMapping(value = "/specification",method = RequestMethod.POST,consumes = "application/json",headers = "Content-Type=application/json")
    @ResponseBody
    public String addSpec(@RequestBody Specification specification) throws SQLException {
        session=sessionFactory.getCurrentSession();
        session.save(specification);
        return "specification saved";
    }

    @Transactional
    @RequestMapping(value = "/specifications",method = RequestMethod.GET)
    @ResponseBody
    public List<Specification> showSpec() throws SQLException {
        session=sessionFactory.getCurrentSession();
        return session.createCriteria(Specification.class).list();
    }
}
