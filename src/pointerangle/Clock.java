
package pointerangle;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Clock {
    
    public long returnsClockAngle(GregorianCalendar horario)
    {
        double hour = horario.get(Calendar.HOUR);
        double minute = horario.get(Calendar.MINUTE);
        
        double hours = hour == 12 ? 0:hour;
        
        long angle = Math.round(Math.abs(((60* hours ) - (11*minute)) /2)) ;
        
        return Math.min(360 - angle, angle);
    }
}
