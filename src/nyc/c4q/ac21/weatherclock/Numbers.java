package nyc.c4q.ac21.weatherclock;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Joe on 4/8/15.
 */
public class Numbers
{
    public static ArrayList<String> DrawTime()
    {
        Calendar cal = Calendar.getInstance();
        String time = DateTime.formatTime(cal, true);
        if(cal.get(Calendar.HOUR_OF_DAY) >= 12)
        {
            time += " PM";
        }
        else
        {
            time += " AM";
        }
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        ArrayList<String> lines = new ArrayList<String>();
        for(int i = 0; i < time.length(); i++)
        {
            if(time.charAt(i) == '1')
            {
                lines.add(" 88  ");
                lines.add("  8  ");
                lines.add("  8  ");
                lines.add("  8  ");
                lines.add("88888");

            }
            else if(time.charAt(i) == '2')
            {
                lines.add("88888");
                lines.add("    8");
                lines.add("88888");
                lines.add("8    ");
                lines.add("88888");

            }
            else if(time.charAt(i) == '3')
            {
                lines.add("88888");
                lines.add("    8");
                lines.add("88888");
                lines.add("    8");
                lines.add("88888");

            }
            else if(time.charAt(i) == '4')
            {
                lines.add("8   8");
                lines.add("8   8");
                lines.add("88888");
                lines.add("    8");
                lines.add("    8");

            }
            else if(time.charAt(i) == '5')
            {
                lines.add("88888");
                lines.add("8    ");
                lines.add("88888");
                lines.add("    8");
                lines.add("88888");

            }
            else if(time.charAt(i) == '6')
            {
                lines.add("88888");
                lines.add("8    ");
                lines.add("88888");
                lines.add("8   8");
                lines.add("88888");

            }
            else if(time.charAt(i) == '7')
            {
                lines.add("88888");
                lines.add("    8");
                lines.add("    8");
                lines.add("    8");
                lines.add("    8");

            }
            else if(time.charAt(i) == '8')
            {
                lines.add("88888");
                lines.add("8   8");
                lines.add("88888");
                lines.add("8   8");
                lines.add("88888");

            }
            else if(time.charAt(i) == '9')
            {
                lines.add("88888");
                lines.add("8   8");
                lines.add("88888");
                lines.add("    8");
                lines.add("    8");

            }
            else if(time.charAt(i) == '0')
            {
                lines.add("88888");
                lines.add("8   8");
                lines.add("8   8");
                lines.add("8   8");
                lines.add("88888");

            }
            else if(time.charAt(i) == ':')
            {
                lines.add("     ");
                lines.add("  8  ");
                lines.add("     ");
                lines.add("  8  ");
                lines.add("     ");

            }
            else if(time.charAt(i) == 'M')
            {
                lines.add("88888");
                lines.add("8 8 8");
                lines.add("8 8 8");
                lines.add("8 8 8");
                lines.add("8 8 8");

            }
            else if(time.charAt(i) == 'P')
            {
                lines.add("88888");
                lines.add("8   8");
                lines.add("88888");
                lines.add("8    ");
                lines.add("8    ");

            }
            else if(time.charAt(i) == ':')
            {
                lines.add("88888");
                lines.add("8   8");
                lines.add("88888");
                lines.add("8   8");
                lines.add("8   8");
            }
            else
            {
                lines.add(" ");
                lines.add(" ");
                lines.add(" ");
                lines.add(" ");
                lines.add(" ");
                lines.add(" ");
            }
        }
        return lines;
    }
}