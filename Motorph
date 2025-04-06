import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Motorph {
    
    static class Employee {
        String employeeNumber;
        String employeeName;
        String birthday;
        double hourlyRate;
        double sssMonthly;
        double pagIbigMonthly;
        double philhealthMonthly;
        double withholdingTaxMonthly;

        public Employee(String employeeNumber, String employeeName, String birthday, double hourlyRate,
                       double sssMonthly, double pagIbigMonthly, double philhealthMonthly, 
                       double withholdingTaxMonthly) {
            this.employeeNumber = employeeNumber;
            this.employeeName = employeeName;
            this.birthday = birthday;
            this.hourlyRate = hourlyRate;
            this.sssMonthly = sssMonthly;
            this.pagIbigMonthly = pagIbigMonthly;
            this.philhealthMonthly = philhealthMonthly;
            this.withholdingTaxMonthly = withholdingTaxMonthly;
            }

        public String toStringEmpDetails(double netSalary) {
            return String.format("| %-8s| %-21s | %-9.2f | %-9.2f |", employeeNumber, employeeName, hourlyRate, netSalary);
        }
        public String toString() {
            return String.format("| %-8d| %-20s  | %s  |", employeeNumber, employeeName, birthday);
        }
    }

    public static double calculateGrossSalary(double hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }

    public static double calculateNetSalary(double grossSalary, double totalWeeklyDeductions) {
        return grossSalary - totalWeeklyDeductions;
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("10001", "Manuel Garcia", "10-11-1983", 535.71, 1125.00, 100.00, 1350.00, 17060.40),
            new Employee("10002", "Antonio Lim", "06-19-1988", 357.14, 1125.00, 100.00, 900.00, 8635.50),
            new Employee("10003", "Bianca Sofia Aquino", "08-04-1989", 357.14, 1125.00, 100.00, 900.00, 8635.50),
            new Employee("10004", "Isabella Reyes", "06-16-1994", 357.14, 1125.00, 100.00, 900.00, 8635.50),
            new Employee("10005", "Eduard Hernandez", "09-23-1989", 313.51, 1125.00, 100.00, 790.05, 6830.49),
            new Employee("10006", "Andrea Mae Villanueva", "02-14-1988", 313.51, 1125.00, 100.00, 790.05, 6830.49),
            new Employee("10007", "Brad San Jose", "03-15-1996", 255.80, 1125.00, 100.00, 664.63, 4443.09),
            new Employee("10008", "Alice Romualdez", "05-14-1992", 133.93, 1012.50, 100.00, 337.50, 43.40),
            new Employee("10009", "Rosie Atienza", "09-24-1948", 133.93,1012.50, 100.00, 337.50, 43.40),
            new Employee("10010", "Roderick Alvaro", "03-30-1988", 313.51, 1125.00, 100.00, 790.05, 6830.49),
            new Employee("10011", "Anthony Salcedo", "09-14-1993", 302.53, 1125.00, 100.00, 762.38, 6376.16),
            new Employee("10012", "Josie Lopez", "01-14-1987", 229.02, 1125.00, 100.00, 577.13, 3334.97),
            new Employee("10013", "Martha Farala", "01-11-1942", 142.86, 1080.00, 100.00, 360.00, 325.40),
            new Employee("10014", "Leila Martinez", "07-11-1970", 142.86, 1080.00, 100.00, 360.00, 325.40),
            new Employee("10015", "Fredrick Romualdez", "03-10-1985", 318.45, 1125.00, 100.00, 802.50, 7034.88),
            new Employee("10016", "Christian Mata", "10-21-1987", 255.80, 1125.00, 100.00, 644.43, 4443.09),
            new Employee("10017", "Selena De Leon", "02-20-1975", 249.11,1125.00, 100.00, 627.75, 4166.06),
            new Employee("10018", "Allison San Jose", "06-24-1986", 133.93, 1012.50, 100.00, 337.50, 43.40),
            new Employee("10019", "Cydney Rosario", "10-06-1996", 133.93, 1012.50, 100.00, 337.50, 43.40),
            new Employee("10020", "Mark Bautista", "02-12-1991", 133.93, 1035.00, 100.00, 348.75, 186.65),
            new Employee("10021", "Darlene Lazaro", "11-25-1985", 133.93, 1035.00, 100.00, 348.75, 186.65),
            new Employee("10022", "Kolby Delos Santos", "02-26-1980", 142.86, 1080.00, 100.00, 360.00, 325.40),
            new Employee("10023", "Vella Santos", "12-31-1983", 133.93, 1012.50, 100.00, 337.50, 43.40),
            new Employee("10024", "Tomas Del Rosario", "12-18-1978", 133.93, 1012.50, 100.00, 337.050, 43.40),
            new Employee("10025", "Jacklyn Tolentino", "05-19-1984", 142.86, 1080.00, 100.00, 360.00, 325.40),
            new Employee("10026", "Percival Gutierrez", "12-18-1970", 147.32, 1102.50, 100.00, 371.20, 468.65),
            new Employee("10027", "Garfield Manalaysay", "08-28-1986", 147.32, 1102.50, 100.00, 371.25, 468.65),
            new Employee("10028", "Lizeth Villegas", "12-12-1981", 142.86, 1080.00, 100.00, 360.00, 325.40),
            new Employee("10029", "Carol Ramos", "08-20-1978", 133.93, 1012.50, 100.00, 337.50, 43.40),
            new Employee("10030", "Emelia Maceda", "04-14-1973", 133.93, 1012.50, 100.00, 337.50, 43.40),
            new Employee("10031", "Delia Aguilar", "01-27-1989", 133.93, 1012.50, 100.00, 337.50, 43.40),
            new Employee("10032", "John Rafael Castro", "02-09-1992", 313.51, 1125.00, 100.00, 790.05, 6830.49),
            new Employee("10033", "Carlos Ian Martinez", "11-16-1990", 313.51, 1125.00, 100.00, 790.05, 6830.49),
            new Employee("10034", "Beatriz Santos", "08-07-1990", 313.51, 1125.00, 100.00, 790.05, 6830.49)
        };
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("+-----------------------------------+");
        System.out.println("| Welcome to MotorPH Payroll System |");
        System.out.println("+-----------------------------------+");
        System.out.println("\nAre you Admin or Employee? [A/E]: ");
        char enter = scanner.next().charAt(0);

        // Will determine access
        switch (enter) {
            case 'A': case 'a':
                System.out.println("\nWelcome Payroll Admin!");
                System.out.println("    [1] Employee Management");
                System.out.println("    [2] Employee Details");
                System.out.println("    [3] Generate Payroll");
                System.out.println("    [4] Payroll Report (Summary)");
                System.out.println("\nWhat would you like to view?");
                String admin = scanner.next();

                if (admin.equals("1")) {
                    System.out.println("\n+---------------------------------+");
                    System.out.println("|       Employee Management       |");
                    System.out.println("+---------------------------------+\n");

                    System.out.println("+------------------------------------------------+");
                    System.out.println("|  Emp #  |       Full Name        |  Birthday   |");
                    System.out.println("+------------------------------------------------+");
                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                    System.out.println("+------------------------------------------------+");
                }

                if (admin.equals("2")) {
                    System.out.println("\n+---------------------------------+");
                    System.out.println("|         Employee Details        |");
                    System.out.println("+---------------------------------+\n");
    
    
                }

                if (admin.equals("3")) {
                    System.out.println("\n+---------------------------------+");
                    System.out.println("|         Generate Payroll        |");
                    System.out.println("+---------------------------------+\n");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                    
                    System.out.println("Please Enter date period below (MM/DD/YYYY)");
                    System.out.print("Pay Period Start: ");
                    String firstDate = scanner.next();
                    System.out.print("Pay Period End: ");
                    String secondDate = scanner.next();
                    
                    LocalDate date1 = LocalDate.parse(firstDate, formatter);
                    LocalDate date2 = LocalDate.parse(secondDate, formatter);
                    long daysBetween = Math.abs(ChronoUnit.DAYS.between(date1, date2));
                    
                    // Calculate actual work days (Monday-Friday)
                    long workDays = date1.datesUntil(date2.plusDays(1)) // Include end date
                                         .filter(d -> d.getDayOfWeek().getValue() < 6) // 1-5 = Mon-Fri
                                         .count();
                    
                    System.out.println("+---------------------------------------------------------+");
                    System.out.println("|  Emp #  |      Full Name        |  Rate/Hr  |    Net    |");
                    System.out.println("+---------------------------------------------------------+");
                    for (Employee employee : employees) {
                        // Calculate gross salary (8 hours/day)
                        double grossSalary = workDays * 8 * employee.hourlyRate;
                        
                        // Calculate deductions proportionally
                        double deductionFactor = Math.min(workDays / 5.0, 1.0);
                        double sssWeekly = (employee.sssMonthly / 4) * deductionFactor;
                        double pagIbigWeekly = (employee.pagIbigMonthly / 4) * deductionFactor;
                        double philhealthWeekly = (employee.philhealthMonthly / 4) * deductionFactor;
                        double withholdingTaxWeekly = (employee.withholdingTaxMonthly / 4) * deductionFactor;
                        
                        double totalWeeklyDeductions = sssWeekly + pagIbigWeekly + philhealthWeekly + withholdingTaxWeekly;
                        double netSalary = calculateNetSalary(grossSalary, totalWeeklyDeductions);
                        
                        System.out.println(employee.toStringEmpDetails(netSalary));
                    }
                    System.out.println("+---------------------------------------------------------+");
                }


                if (admin.equals("4")) {
                    System.out.println("\n+---------------------------------+");
                    System.out.println("|          Payroll Report         |");
                    System.out.println("+---------------------------------+\n");
                    System.out.print("    Pay Period (days): ");
                    double daysWorked = scanner.nextDouble();

                    System.out.println("+---------------------------------------------------------+");
                    System.out.println("|  Emp #  |      Full Name        |  Rate/Hr  |    Net    |");
                    System.out.println("+---------------------------------------------------------+");

                    for (Employee employee : employees) {
                        double grossSalary = daysWorked * 8 * employee.hourlyRate;
                        
                        // Calculate deductions proportionally
                        double deductionFactor = Math.min(daysWorked / 5.0, 1.0);
                        double sssWeekly = (employee.sssMonthly / 4) * deductionFactor;
                        double pagIbigWeekly = (employee.pagIbigMonthly / 4) * deductionFactor;
                        double philhealthWeekly = (employee.philhealthMonthly / 4) * deductionFactor;
                        double withholdingTaxWeekly = (employee.withholdingTaxMonthly / 4) * deductionFactor;
                        
                        double totalWeeklyDeductions = sssWeekly + pagIbigWeekly + philhealthWeekly + withholdingTaxWeekly;
                        double netSalary = calculateNetSalary(grossSalary, totalWeeklyDeductions);
                        
                        System.out.println(employee.toStringEmpDetails(netSalary));
                    }
                    System.out.println("+---------------------------------------------------------+");
                }

                break;

            case 'E': case 'e':
                System.out.println("\nWelcome Employee!\n");

                System.out.println("+---------------------------------+");
                System.out.println("|          My Information:        |");
                System.out.println("+---------------------------------+\n");
                System.out.print("Employee Number: ");
                String searchEmployeeNumber = scanner.next();

                // Search for the employee
                Employee selectedEmployee = null;
                for (Employee employee : employees) {
                    if (employee.employeeNumber.equals(searchEmployeeNumber)) {
                        selectedEmployee = employee;
                        break; // Exit the loop once found
                    }
                }
 
                if (selectedEmployee != null) {
                    System.out.println("\nEmployee Information:");
                    System.out.println("  Employee Number: " + selectedEmployee.employeeNumber);
                    System.out.println("  Employee Name: " + selectedEmployee.employeeName);
                    System.out.println("  Employee Birthday: " + selectedEmployee.birthday);
        
                    System.out.print("\nEnter number of hours worked in a week: ");
                    double hoursWorked = scanner.nextDouble();
        
                    double grossSalary = calculateGrossSalary(hoursWorked, selectedEmployee.hourlyRate);
        
                    // Calculate weekly deductions from monthly deductions
                    double sssWeekly = selectedEmployee.sssMonthly / 4;
                    double pagIbigWeekly = selectedEmployee.pagIbigMonthly / 4;
                    double philhealthWeekly = selectedEmployee.philhealthMonthly / 4;
                    double withholdingTaxWeekly = selectedEmployee.withholdingTaxMonthly / 4;
        
                    double totalWeeklyDeductions = sssWeekly + pagIbigWeekly + philhealthWeekly + withholdingTaxWeekly;
        
                    double netSalary = calculateNetSalary(grossSalary, totalWeeklyDeductions);
        
                    System.out.println("\n+---------------------------------+");
                    System.out.println("|            My Payroll:          |");
                    System.out.println("+---------------------------------+\n");
                    System.out.println("  Gross Weekly Salary: $" + grossSalary);
                    System.out.printf("  SSS Weekly Deduction: $%.2f\n", sssWeekly);
                    System.out.printf("  PAG-IBIG Weekly Deduction: $%.2f\n", pagIbigWeekly);
                    System.out.printf("  PhilHealth Weekly Deduction: $%.2f\n", philhealthWeekly);
                    System.out.printf("  Withholding Tax Weekly Deduction: $%.2f\n", withholdingTaxWeekly);
                    System.out.println("  Net Weekly Salary (after deductions): $" + netSalary);
                } else {
                    System.out.println("Employee not found.");
                }
        
                scanner.close();

                break;
        }
    }
}
