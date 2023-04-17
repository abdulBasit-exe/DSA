package DSA_Lab;
//        Create a class called Employee that includes three pieces of information as data members—a first name (type char*), a last name
//        (type string) and a monthly salary (type int). Your class should have a setter function that initializes the three data
//        members. Provide a getter function for each data member. If the monthly salary is not positive, set it to 0.
//        Write a test program that demonstrates class Employee’s capabilities. Create two Employee objects and display
//        each object’s yearly salary. Then give each Employee a 10 percent
//        raise and display each Employee’s yearly salary again. Identify and add any other related functions to achieve the said goal.

// DSA lab, group tasks, 4-Jan,2023 Lab 6

public class que2_lab2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.setDetails("abdulBasit","memon", 3000);
        emp2.setDetails("muzammilHussain","soomro",4000);
        int yearlySalary = emp1.getMonthlySalary()*12;
        System.out.println("yearly salary of emp 1: "+yearlySalary);
        float totalSalary = ((yearlySalary/10)*100)+yearlySalary;
        System.out.println("yearly salary after bonus is: "+totalSalary);

        int yearlySalary2 = emp2.getMonthlySalary()*12;
        System.out.println("yearly salary of emp2 : "+yearlySalary2);
        float totalSalary2 = ((yearlySalary2/10)*100)+yearlySalary2;
        System.out.println("yearly salary after bonus is: "+totalSalary2);
    }
}

class  Employee{
    String firstName;
    String lastName;
    int monthlySalary;


    public void setDetails(String firstName, String lastName, int monthlySalary){
        this.firstName=firstName;
        if (monthlySalary<=0){
            this.monthlySalary=0;
        }
        this.lastName=lastName;
        this.monthlySalary=monthlySalary;
    }

    public int getMonthlySalary(){
        return monthlySalary;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

}
