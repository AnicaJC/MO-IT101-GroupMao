import java.util.Scanner;
public class motorph {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("+---------------------------------+");
        System.out.println("|Welcome to MotorPH Payroll System|");
        System.out.println("+---------------------------------+");
        System.out.println("\nAre you Admin or Employee? [A/E]: ");
        char enter = sc.next().charAt(0);
        
        //will determine access
        switch(enter) {
            case 'A': case 'a':
            System.out.println("\n+---------------------------------+");
            System.out.println("|      Welcome Payroll Admin      |");
            System.out.println("+---------------------------------+\n");
            System.out.println("    [1] Employee Management");
            System.out.println("    [2] Employee Details");
            System.out.println("    [3] Generate Payroll");
            System.out.println("    [4] Payroll Report (Summary)");
            System.out.println("\nWhat would you like to view?");
            String admin = sc.next();
            
            if (admin.equals("1")){
                System.out.println("\n+---------------------------------+");
                System.out.println("|        Employee Management       |");
                System.out.println("+--------------------------------- +\n");
                
                System.out.println("\n+---------------------------------------+");
                System.out.println("|   Emp #  |   Full Name   |   Birthday  |");
                System.out.println("+----------------------------------------+");
                
                
            }
            if (admin.equals("2")){
                System.out.println("\n+---------------------------------+");
                System.out.println("|         Employee Details        |");
                System.out.println("+---------------------------------+\n");
                System.out.println("    Employee Number: ");
                //String newEmpnum = sc.next();
                System.out.println("    Employee Name: ");
                //String newEmpn = sc.next();
                System.out.println("    Birthday (YYYY-MM-DD): ");
                //String newBday = sc.next();
                System.out.println("    Pay Rate: ");
                //String newPr = sc.next();
                
            }
            if (admin.equals("3")){
                System.out.println("\n+---------------------------------+");
                System.out.println("|         Generate Payroll        |");
                System.out.println("+---------------------------------+\n");
                System.out.println("    Pay Period Start: ");
                //Int pps = sc.next();
                System.out.println("    Pay Period End: ");
                //Int ppe = sc.next();
                
                //Float genpay;
                //genpay = 
                
                //System.out.println("    Generate Paryoll: " + genpay);
                
            }
            if (admin.equals("4")){
                System.out.println("\n+ --------------------------------- +");
                System.out.println("|          Payroll Report         |");
                System.out.println("+---------------------------------+\n");
                System.out.println("    Pay Period: ");
                //Float ppr = sc.next();
                
                //do
                //System.out.println("")
                
            }
            
            break;
            
            case 'E' : case 'e':
            System.out.println("\n+---------------------------------+");
            System.out.println("|        Welcome Employee         |");
            System.out.println("+---------------------------------+\n");
            System.out.println("    [1] View Employees Info");
            System.out.println("    [2] View Payroll");
            System.out.println("\nWhat would you like to view?");
            String employee = sc.next();
            
            if (employee.equals("1")){
                System.out.println("\n+---------------------------------+");
                System.out.println("|          My Information:        |");
                System.out.println("+---------------------------------+\n");
                System.out.println("    Employee Number: ");
                //String empnum = sc.next();
                System.out.println("    Employee Name: ");
                System.out.println("    Employee Birthday: ");

            }
            if (employee.equals("2")){
                System.out.println("\n+---------------------------------+");
                System.out.println("|            My Payroll:          |");
                System.out.println("+---------------------------------+\n");
                System.out.println("    Pay Period: ");
                //String pperiod = sc.next();
                System.out.println("    Gross Salary: ");
                System.out.println("    Deductions: ");
                System.out.println("    Net Salary: ");
            }
            
            
            break;
            
        }
    }
}