package clone;

/**
 * Created by lihuaf on 2016/5/12.
 */
public class CloneTest {
    public static void main(String[] args){
        try{
            Employee original = new Employee("John Q. Public", 50000);
            original.setHireDay(2000, 1, 1);
            Employee copy = original.clone();
            copy.setHireDay(2002, 12, 31);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
