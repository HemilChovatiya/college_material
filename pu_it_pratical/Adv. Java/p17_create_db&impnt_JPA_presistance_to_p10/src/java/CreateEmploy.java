
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;
import javax.persistence.Persistence;

public class CreateEmploy {

 public static void main(String[] args) {
 Employ employee = new Employ();
 employee.setid(101);
 employee.setname("Ravi");
 employee.setSalary(60000);
 employee.setDeg("Technical Support");
 entitymanager.persist(employee);
 entitymanager.getTransaction().commit();
 entitymanager.close();
 emfactory.close();
 }}
