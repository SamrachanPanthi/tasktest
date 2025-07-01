class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    double calculateSalary() {
        return 0.0;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }

  
    void displayDetails() {
        super.displayDetails();
        System.out.println("Employment Type: Full-Time");
        System.out.println("Monthly Salary: $" + calculateSalary());
        
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

   
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Employment Type: Part-Time");
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: $" + calculateSalary());
        
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Alice", 101, 5000);
        PartTimeEmployee pte = new PartTimeEmployee("Bob", 102, 20, 80);

        fte.displayDetails();
        pte.displayDetails();
    }
}
