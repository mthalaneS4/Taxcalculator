public class TAXcalculator {
    public static void main(String[] args) {
        TAXcalculator emp1 = new TAXcalculator("JAVA", 1010, 700000);
          emp1.displayInfo(); 
    }
     private String name;
      private int number;
       private double salary;


    public TAXcalculator (String n, int num, double s) {
         name = n; 
         number = num; 
         salary = s; 
        }
    
    public double calculateTax() { if (salary > 40000)
         { return salary * 0.25; } else if (salary > 20000)
          { return salary * 0.20; } else if (salary > 10000)
           { return salary * 0.10; } else { return 0;
         }
         }
    
    public double getTaxPercentage() { if (salary > 40000) {
         return 0.25;
     } else if (salary > 20000) {
         return 0.20;
     } else if (salary > 10000) { 
        return 0.10;
     } else {
         return 0;
     }
     }
    
    public void displayInfo() {
         System.out.println("Name: " + name);
          System.out.println("Employee Number: " + number); 
          System.out.println("Salary: R" + salary);
           System.out.println("Tax Amount: R" + calculateTax()); 
           System.out.println("Tax Percentage: " + getTaxPercentage()*100 + "%");
         }
         }