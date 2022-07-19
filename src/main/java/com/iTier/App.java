package com.iTier;

import com.iTier.dao.ReimbursementDao;

// import org.hibernate.SessionFactory;
// import org.hibernate.cfg.Configuration;
// import org.hibernate.Session;
// import org.hibernate.Transaction;

import com.iTier.entity.Reimbursement;
/**
 * Hello world!
 *
 */
public class App 
{
   
    public static void main(String[] args)
    {
        //System.out.println( "Hello World!" );

        Reimbursement reimbursement = new Reimbursement(12,"Tareka",3000,"Moving");
        System.out.println(reimbursement.toString());

        ReimbursementDao reimbursementDao = new ReimbursementDao();
        //Reimbursement reimbursement;
        reimbursementDao.insert(reimbursement);

        // Configuration cfg = new Configuration();
        // cfg.configure("hibernate.cfg.xml");

        // SessionFactory connect = cfg.buildSessionFactory();

        // Session session = connect.openSession();

        // Transaction transaction = session.beginTransaction();

        // session.save(accounts);

        // transaction.commit();
            
        
    }
}
