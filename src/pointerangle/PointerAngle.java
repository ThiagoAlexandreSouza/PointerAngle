
package pointerangle;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PointerAngle {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int hour = 0;
        int minute = 0;
        boolean error = false;
        
        do {
            System.out.println("Entre com o horário(HH:MM, hora 0 à 12, minutos 0 à 59): ");
            String schedule = input.next();
            String[] hoursAndMinutes = schedule.split(":");
            
            hour = Integer.parseInt(hoursAndMinutes[0]);
            minute = Integer.parseInt(hoursAndMinutes[1]);

            if (hour > 12 || hour < 0 || minute < 0 || minute >= 60){
                error = true;
                System.out.println("Horário inválido!");
            }
        
        }while(error);      

        GregorianCalendar calend = new GregorianCalendar();
        calend.set(Calendar.HOUR, hour);
        calend.set(Calendar.MINUTE, minute);
        
        Clock clock = new Clock();
        double result = clock.returnsClockAngle(calend);
        
        System.out.println("O ângulo entre os dois ponteiros é de: " + result);
    }
}
