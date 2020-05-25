import java.util.Scanner;

public class TimeCoversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(returnTime(s));
        /*String[] stringArr = s.split(":");

        String result ;

        int hour = Integer.parseInt(stringArr[0]);
        String min = stringArr[1];
        String sec = stringArr[2].substring(0,stringArr[2].length()-2);
        String period = stringArr[2].substring(stringArr[2].length()-2, stringArr[2].length());

        System.out.println(hour+":"+min+":"+sec+":"+period);

        if ((0 <= hour && hour < 12) && (period.equalsIgnoreCase("AM"))) {
          result=  String.format("%02d", hour) +":"+min+ ":"+sec;
        }
        else if ((0 <= hour && hour < 12) && (period.equalsIgnoreCase("PM"))) {
          result = (hour + 12) +":"+min+":"+sec;

        }
        else if ((hour == 12) && (period.equalsIgnoreCase("PM"))) {
           result =  hour + ":"+ min +":"+ sec;
         }
        else if ((hour == 12) && (period.equalsIgnoreCase("AM"))) {
           result = "00:" + min+":"+sec;
        }*/
    }
    public static String returnTime(String s){
        String[] stringArr = s.split(":");

        String result = null ;

        int hour = Integer.parseInt(stringArr[0]);
        String min = stringArr[1];
        String sec = stringArr[2].substring(0,stringArr[2].length()-2);
        String period = stringArr[2].substring(stringArr[2].length()-2, stringArr[2].length());

        System.out.println(hour+":"+min+":"+sec+":"+period);

        if ((0 <= hour && hour < 12) && (period.equalsIgnoreCase("AM"))) {
            result=  String.format("%02d", hour) +":"+min+ ":"+sec;
        }
        else if ((0 <= hour && hour < 12) && (period.equalsIgnoreCase("PM"))) {
            result = (hour + 12) +":"+min+":"+sec;

        }
        else if ((hour == 12) && (period.equalsIgnoreCase("PM"))) {
            result =  hour + ":"+ min +":"+ sec;
        }
        else if ((hour == 12) && (period.equalsIgnoreCase("AM"))) {
            result = "00:" + min+":"+sec;
        }
        return result;
    }
}
