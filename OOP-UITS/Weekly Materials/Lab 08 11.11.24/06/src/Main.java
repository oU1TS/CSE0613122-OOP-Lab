// SupewrClass

class Company{
    
    void CompanyName(){
        
        System.out.println("Company Name in MyCompany");
    }
}
// SubClass 1
class Employee1 extends Company{
    void EmployeeName1(){
        
        System.out.println("Employee Name is Rahim");
    }
}
// SubClass 2
class Employee2 extends Company{
    void EmployeeName2(){
        
        System.out.println("Employee Name is Abir");
    }
}
// SubClass 3
class Employee3 extends Company{
    void EmployeeName3(){
        
        System.out.println("Employee Name is Shakil");
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {
      
        Employee1 E1 = new Employee1();
        E1.CompanyName();
        E1.EmployeeName1();
        Employee2 E2 = new Employee2(); 
         E2.CompanyName();
        E2.EmployeeName2();
        Employee3 E3 = new Employee3(); 
         E3.CompanyName();
        E3.EmployeeName3();
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
