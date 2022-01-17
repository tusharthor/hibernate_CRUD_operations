package com.hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	//Student is persistent class (means its object is stored in the database)
        Student student = new Student();
        
        //Store data in db
        student.setStudentId(2);
        student.setStudentName("Chintu Patil");
        //class
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        //interface
        SessionFactory sf = con.buildSessionFactory();
        //interface
        Session session = sf.openSession();
        //begin transaction
        Transaction tr = session.beginTransaction();
        //save student object
        //session.save(student);
        session.delete(1);
        
        //fetch data from db (using get)
        student = (Student) session.get(Student.class, 1);
        tr.commit();
        
        System.out.println(student);
    }
}
