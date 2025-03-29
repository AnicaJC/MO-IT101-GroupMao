import java.util.Scanner;
class Employee {
    int id;
    String name;
    String birth;
    float prate;
    float deduc = 10; // Deduction rate (10%)

    public Employee(int id, String name, String birth, float prate) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.prate = prate;
    }

    // Default toString() without prate
    @Override
    public String toString() {
        return String.format("| %-8d| %-20s  | %s  |", id, name, birth);
    }

    // toString() with prate and net salary
    public String toStringWithNet() {
        float net = prate - (prate * (deduc / 100)); // Calculate net salary
        return String.format("| %-8d| %-21s  | %-9.2f | %-9.2f |", id, name, prate, net);
    }
}

public class motorph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee list alignment logic
        Employee[] people = {
            new Employee(10001, "Manuel III Garcia", "10-11-1983", 90000),
            new Employee(10002, "Antonio Lim", "06-19-1988", 60000),
            new Employee(10003, "Bianca Sofia Aquino", "08-04-1989", 60000),
            new Employee(10004, "Isabella Reyes", "06-16-1994", 60000),
            new Employee(10005, "Eduard Hernandez", "09-23-1989", 52670),
            new Employee(10006, "Andrea Mae Villanueva", "02-14-1988", 52670),
            new Employee(10007, "Brad San Jose", "03-15-1996", 42975),
            new Employee(10008, "Alice Romualdez", "05-14-1992", 22500),
            new Employee(10009, "Rosie Atienza", "09-24-1948", 22500),
            new Employee(10010, "Roderick Alvaro", "03-30-1988", 52670),
            new Employee(10011, "Anthony Salcedo", "09-14-1993", 50825),
            new Employee(10012, "Josie Lopez", "01-14-1987", 38475),
            new Employee(10013, "Martha Farala", "01-11-1942", 24000),
            new Employee(10014, "Leila Martinez", "07-11-1970", 24000),
            new Employee(10015, "Fredrick Romualdez", "03-10-1985", 53500),
            new Employee(10016, "Christian Mata", "10-21-1987", 42975),
            new Employee(10017, "Selena De Leon", "02-20-1975", 41850),
            new Employee(10018, "Allison San Jose", "06-24-1986", 22500),
            new Employee(10019, "Cydney Rosario", "10-06-1996", 22500),
            new Employee(10020, "Mark Bautista", "02-12-1991", 23250),
            new Employee(10021, "Darlene Lazaro", "11-25-1985", 23250),
            new Employee(10022, "Kolby Delos Santos", "02-26-1980", 24000),
            new Employee(10023, "Vella Santos", "12-31-1983", 22500),
            new Employee(10024, "Tomas Del Rosario", "12-18-1978", 22500),
            new Employee(10025, "Jacklyn Tolentino", "05-19-1984", 24000),
            new Employee(10026, "Percival Gutierrez", "12-18-1970", 24750),
            new Employee(10027, "Garfield Manalaysay", "08-28-1986", 24750),
            new Employee(10028, "Lizeth Villegas", "12-12-1981", 24000),
            new Employee(10029, "Carol Ramos", "08-20-1978", 22500),
            new Employee(10030, "Emelia Maceda", "04-14-1973", 22500),
            new Employee(10031, "Delia Aguilar", "01-27-1989", 22500),
            new Employee(10032, "John Rafael Castro", "02-09-1992", 52670),
            new Employee(10033, "Carlos Ian Martinez", "11-16-1990", 52670),
            new Employee(10034, "Beatriz Santos", "08-07-1990", 52670)
        };

        System.out.println("+-----------------------------------+");
        System.out.println("| Welcome to MotorPH Payroll System |");
        System.out.println("+-----------------------------------+");
        System.out.println("\nAre you Admin or Employee? [A/E]: ");
        char enter = sc.next().charAt(0);

        // Will determine access
        switch (enter) {
            case 'A': case 'a':
                System.out.println("\nWelcome Payroll Admin!");
                System.out.println("    [1] Employee Management");
                System.out.println("    [2] Employee Details");
                System.out.println("    [3] Generate Payroll");
                System.out.println("    [4] Payroll Report (Summary)");
                System.out.println("\nWhat would you like to view?");
                String admin = sc.next();

                if (admin.equals("1")) {
                    System.out.println("\n+---------------------------------+");
                    System.out.println("|       Employee Management       |");
                    System.out.println("+---------------------------------+\n");

                    System.out.println("+------------------------------------------------+");
                    System.out.println("|  Emp #  |       Full Name        |  Birthday   |");
                    System.out.println("+------------------------------------------------+");
                    for (Employee employee : people) {
                        System.out.println(employee);
                    }
                    System.out.println("+------------------------------------------------+");
                }

                if (admin.equals("2")) {
                    System.out.println("\n+---------------------------------+");
                    System.out.println("|         Employee Details        |");
                    System.out.println("+---------------------------------+\n");
                    System.out.println("Please fill in blanks for new employee information.");
                    System.out.println("    Employee Number: ");
                    //int newId = sc.nextInt();
                    System.out.println("    Employee Name: ");
                    //String newName = sc.next();
                    System.out.println("    Birthday (MM-DD-YYYY): ");
                    //String newBirth = sc.next();
                    System.out.println("    Pay Rate: ");
                    //float newPrate = sc.nextFlaot();
                }

                if (admin.equals("3")) {
                    System.out.println("\n+---------------------------------+");
                    System.out.println("|         Generate Payroll        |");
                    System.out.println("+---------------------------------+\n");
                    System.out.println("    Pay Period Start: ");
                    System.out.println("    Pay Period End: ");
                    
                    System.out.println("+----------------------------------------------------------+");
                    System.out.println("|  Emp #  |      Full Name         |  Pay Rate |    Net    |");
                    System.out.println("+----------------------------------------------------------+");
                    for (Employee employee : people) {
                        System.out.println(employee.toStringWithNet()); // Calls toStringWithNet()
                    }
                    System.out.println("+----------------------------------------------------------+");
                }

                if (admin.equals("4")) {
                    System.out.println("\n+---------------------------------+");
                    System.out.println("|          Payroll Report         |");
                    System.out.println("+---------------------------------+\n");
                    System.out.println("    Pay Period (days): ");
                    // Float ppr = sc.next();

                    System.out.println("+----------------------------------------------------------+");
                    System.out.println("|  Emp #  |      Full Name         |  Pay Rate |    Net    |");
                    System.out.println("+----------------------------------------------------------+");
                    for (Employee employee : people) {
                        System.out.println(employee.toStringWithNet());
                    }
                    System.out.println("+----------------------------------------------------------+");
                }

                break;

            case 'E': case 'e':
                System.out.println("\nWelcome Employee!");

                System.out.println("+---------------------------------+");
                System.out.println("|          My Information:        |");
                System.out.println("+---------------------------------+\n");
                System.out.print("    Employee Number: ");
                int empId = sc.nextInt();
                
                Employee foundEmployee = null;
                for (Employee employee : people) {
                    if (employee.id == empId) {
                        foundEmployee = employee;
                        break;
                    }
                }

                if (foundEmployee != null) {
                    System.out.println("    Employee Name: " + foundEmployee.name);
                    System.out.println("    Employee Birthday: " + foundEmployee.birth);
                    
                    System.out.println("\n+---------------------------------+");
                    System.out.println("|            My Payroll:          |");
                    System.out.println("+---------------------------------+\n");
                    System.out.print("    Pay Period (days): ");
                    float pperiod = sc.nextFloat(); 
                    float gross = foundEmployee.prate * pperiod;
                    float net = gross - (gross * (foundEmployee.deduc / 100));
                    
                    System.out.println("    Gross Salary: " + gross);
                    System.out.println("    Deductions: " + foundEmployee.deduc + "%");
                    System.out.println("    Net Salary: " + net);
                } else {
                    System.out.println("    Employee not found!");
                }

                break;
        }
    }
}
