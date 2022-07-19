package com.iTier.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.iTier.entity.Reimbursement;

public class ReimbursementDao {
 
    public void insert (Reimbursement reimbursement){

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory connect = cfg.buildSessionFactory();

        Session session = connect.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(reimbursement);

        transaction.commit();
        
    }


}
