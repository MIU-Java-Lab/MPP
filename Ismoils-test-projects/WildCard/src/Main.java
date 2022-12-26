import java.util.*;

class Employee {}
class Manager extends Employee {}

public class Main {
    public static <T> void main(String[] args) {

        // --------Generics rule 1, arrays are covariant
        Manager[] managers = {new Manager(), new Manager()};
        Employee[] employees = managers;

        // Collections are not covariant
        List<Manager> managerList = Arrays.asList(new Manager(), new Manager());
        //List<Employee> employeeList = managerList;        //--not possible

        // --------Generics rule 2
        //T[] arr = new T[2];       //--generic array creation not possible

        // --------Generics rule 3
        //List<String>[] list = new ArrayList<String>[5];

        // --------Wild card boundaries
        // 1. ? extends - Parent Type (Upper Boundary)
        // 2. > super - Child Type (Lower Boundary)
        // 3. ? (No boundaries) - Unknown type

        // 1.
        List<? extends Employee> employeeList = managerList; // Means right side type should extend Employee

        // We can't add any value because type is unknown
        //List< ? extends Number> numberList = new ArrayList<>();
        //numberList.add(5);

        // 2. Solution is to use Lower Boundary
        List< ? super Number> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2.5);
        System.out.println(numberList.get(1));

        // 3. No boundaries
        Collection<?> collect;
        // abbreviation of
        Collection<? extends Object> objectCollect;
    }
}