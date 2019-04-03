import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


class KYCAnniversaryDate {
    static int getDateRange(String signup, String current) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        format.setLenient(false);
        Date signupDate=null, currentDate=null;
        try{
		//check if the given date is in required format
            signupDate = format.parse(signup);
            currentDate = format.parse(current);
        }
        catch(Exception e){
            System.out.println("Invalid Date!");
            return 0;	
	}
        if(signupDate.after(currentDate)){
            System.out.println("Sign up now and come back after an year! ");
        }
        else{
            Calendar calSignup = GregorianCalendar.getInstance();
            calSignup.setTime(signupDate);
            Calendar calCurrent = GregorianCalendar.getInstance();
            calCurrent.setTime(currentDate);
            int years = calCurrent.get(Calendar.YEAR) - calSignup.get(Calendar.YEAR);
            calSignup.add(GregorianCalendar.YEAR, years);
            calSignup.add(GregorianCalendar.DAY_OF_MONTH, -30);
            System.out.print(format.format(calSignup.getTime()) + " ");
            calSignup.add(GregorianCalendar.DAY_OF_MONTH, 60);
            if(calSignup.before(calCurrent)){
                System.out.println(format.format(calSignup.getTime()));
            }
            else{
                System.out.println(format.format(calCurrent.getTime()));
            }
        }
        return 0;
    }

    public static void main(String[] args)  {
        System.out.println("enter number of set of dates ");
        Scanner scan = new Scanner(System.in);
        int noOfDates = scan.nextInt();
        System.out.println("Enter " + noOfDates + "of dates to which you want to find range " );
        String inputs[][] = new String[noOfDates][2];
        String signupDate = null;
        String currentDate = null;
	//Take the inputs for given number of testcases
        for(int i=0;i<noOfDates;i++){
            signupDate = scan.next();
            currentDate = scan.next();
            inputs[i][0] = signupDate;
            inputs[i][1] = currentDate;
        }
	//for each date calculate starting date and ending date
        for(int i=0;i<noOfDates;i++){
            try {
                    getDateRange(inputs[i][0], inputs[i][1]);
                }
            catch (Exception e) {
                System.out.println("Please Enter valid date");
            }
        }
        scan.close();
    }
}
