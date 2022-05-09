package com.vivek.hibernateDemo.HibernateExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args) throws IOException
    {
        System.out.println( "Project Started!");
               
        // We can write below method call in the same line by using interface
        
        /*
         * Configuration cfg = new Configuration();
         * 
         * cfg.configure();		We can give path of our XML file in configure method.
         * 
         * SessionFactory factory = cfg.buildSessionFactory();
         */
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
           
        // creating student
        Student st = new Student();
        st.setId(102);
        st.setName("Robert");
        st.setCity("New york");
        
        Student st1 = new Student();
        
        st1.setId(103);
        st1.setName("Andrew");
        st1.setCity("Chicago");
        
        System.out.println(st);
        
        // creating object of address class
        Address ad = new Address();
        ad.setSteet("Street15");
        ad.setCity("Nasik");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1233.434);
        
        Address ad1 = new Address();
        
        ad1.setSteet("Street11");
        ad1.setCity("Jaunpur");
        ad1.setOpen(true);
        ad1.setAddedDate(new Date());
        ad1.setX(1124.434);
        
        // reading image
        FileInputStream fis = new FileInputStream("src/main/java/Lord_of_ring.jpg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        ad1.setImage(data);
        
        
        
        // Getting the current session
        Session session = factory.openSession();
        

        	session.beginTransaction();
        	
        	session.save(st);
        	session.save(ad);
        	
        	session.save(st1);
        	session.save(ad1);
        	
        	session.getTransaction().commit();
        
        // closing the session object
        session.close();
        
        System.out.println("Done!!");
 
    }
}
