
package employee;

public class Employee {

    public static void main(String[] args) {
        System.out.println("Name\tYear of joining\t    Address");
        Employee ob=new Employee();
        ob.Robert();
        ob.Sam();
        ob.john();            
    }
    void Robert()
    {
        System.out.println("Robert\t  1994\t\t 64C-WallsStreet");
    }
    void Sam()
    {
        System.out.println("Sam\t  2000\t\t 68D-WallsStreet");
    }
    void john()
    {
        System.out.println("John\t  1999\t\t 26B-WallsStreet");
    }
}
