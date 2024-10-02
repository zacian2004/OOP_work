import java.util.Scanner;
public class dateInput{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter year and month: ");
        
        int year = 0;
        boolean validYearCheck = false;
        String month = " ";
        boolean validMonthCheck = false;

        while (!validYearCheck || !validMonthCheck) {
            if(scan.hasNextInt()) {                 //if find an int is scanned
                year = scan.nextInt();
                if(year > 0) {
                    validYearCheck = true;          //mark valid year
                } else {
                    System.out.println("Invalid year. Try again");
                    scan.next();
                }
            } else {
                System.out.println("Invalid year. Try again");
            }
            month = scan.nextLine().trim();
            if(month.equals("Jan.") || month.equals("Jan") || month.equals("1") || month.equals("Mar.") || month.equals("Mar") || month.equals("3") || month.equals("May") || month.equals("5") || month.equals("July") || month.equals("Jul") || month.equals("7") || month.equals("Aug.") || month.equals("Aug") || month.equals("8") || month.equals("Oct.") || month.equals("Oct") || month.equals("10") || month.equals("Dec.") || month.equals("Dec") || month.equals("12")) {
                System.out.println("This month has 31 days.");
                validMonthCheck = true;
            } else if(month.equals("Feb.") || month.equals("Feb") || month.equals("2")) {
                if(year % 4 == 0) {
                    if(year % 100 == 0 && year % 400 != 0) {
                        System.out.println("This month has 28 days.");
                        validMonthCheck = true;
                    } else {
                        System.out.println("This month has 29 days.");
                        validMonthCheck = true;
                    }
                } else {
                    System.out.println("This month has 28 days.");
                    validMonthCheck = true;
                }
            } else if(month.equals("Apr.") || month.equals("Apr") || month.equals("4") || month.equals("June") || month.equals("Jun") || month.equals("6") || month.equals("Sep.") || month.equals("Sep") || month.equals("9") || month.equals("Nov.") || month.equals("Nov") || month.equals("11")) {
                System.out.println("This month has 30 days.");
                validMonthCheck = true;
            } else {
                System.out.println("Invalid month. Try again");
            }
        }
    }
}