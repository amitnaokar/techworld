package com.techworld.hibernate.basic;

import com.techworld.hibernate.model.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Amit on 20-Apr-16.
 */
public class EmployeeCRUD {
    private static SessionFactory sessionFactory;

    public Integer addEmployee(String fName, String lName, int salary){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        Integer employeeId = null;
        try {
            transaction = session.beginTransaction();
            Employee employee = new Employee(fName,lName,salary);
            employeeId = (Integer) session.save(employee);
            transaction.commit();
        }catch (Exception e){
            if(transaction!=null)
                transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return employeeId;

    }

    public Employee updateEmployee(Integer id,String fName){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        Employee employee = null;
        try{
            transaction = session.beginTransaction();
            employee = session.get(Employee.class,id);
            employee.setfName("Keshav");
            session.update(employee);
            transaction.commit();
        }catch (Exception e){
            if(transaction!=null)
                transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return employee;
    }

    public void deleteEmployee(Integer id){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            Employee employee = session.get(Employee.class,id);
            session.delete(employee);
            transaction.commit();
        }catch (Exception e){
            if(transaction!=null)
                transaction.rollback();
        }finally {
            session.close();
        }

    }

    public void listAllEmployees(){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            List employees = session.createQuery("From Employee").list();
            Iterator iterator = employees.iterator();
            while (iterator.hasNext()){
                Employee employee = (Employee) iterator.next();
                System.out.print("First Name: " + employee.getfName());
                System.out.print("\tLast Name: " + employee.getlName());
                System.out.println("\tSalary: " + employee.getSalary());
            }
            transaction.commit();
        }catch (Exception e){
            if(transaction!=null)
                transaction.rollback();
            e.printStackTrace();
        }finally{
            session.close();
        }
    }

    public static void main(String args[]){
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }catch (Exception e){
            System.out.println("failed to create session factory");
            e.printStackTrace();
        }

        EmployeeCRUD employeeCRUD = new EmployeeCRUD();
        Integer empID1 = employeeCRUD.addEmployee("Amit","Naokar",45000);
        Integer empID2 = employeeCRUD.addEmployee("Nitin","Khilwani",55000);
        Integer empID3 = employeeCRUD.addEmployee("Vinay","Agrawal",40000);

        employeeCRUD.updateEmployee(empID1,"Keshav");
        
        employeeCRUD.listAllEmployees();
        
        employeeCRUD.deleteEmployee(empID3);
    }

}
