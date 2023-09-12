import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean response = true;
        double hoursThisWeek;
        ArrayList<Worker> staff = new ArrayList<Worker>();
        staff.add(new Worker("010203", "Conner", "James", "Senior Eng.", 1997, 27));
        staff.add(new Worker("020304", "Faith", "Hampton", "Ms.", 2002, 18.50));
        staff.add(new Worker("030405", "Michael", "Weston", "Mr.", 1975, 22.40));
        staff.add(new SalaryWorker("040506", "Seth", "Rullmann", "SPC", 2000, 0, 48805));
        staff.add(new SalaryWorker("050607", "John", "Carrasco", "SGT", 1995, 0, 51605));
        staff.add(new SalaryWorker("060708", "Naomi", "Koens", "SPC", 2002, 0, 46950));
        while (response)
       {
           hoursThisWeek = SafeInput.getDouble(in, "How many hours were worked this week?");
           for (Worker s : staff)
           {
               System.out.println(s.getFormalName() + " " + s.displayWeeklyPay(hoursThisWeek));
           }
           response = SafeInput.getYNConfirm(in, "Are there more weeks you'd like to calculate?");
       }















    }
}