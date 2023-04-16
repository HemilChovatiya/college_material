
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Employ {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double sal;
    private String deg;

    public Employ(int id, String name, double sal, String deg) {
        super();
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.deg = deg;
    }

    public Employ() {
        super();
    }

    public int getid() {
        return id;
    }

    public void setid(int eid) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "Employee [Id=" + id + ", Name=" + name + ", Salary=" + sal + ", deg=" + deg + "]";
    }

    void setSalary(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
