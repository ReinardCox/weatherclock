package nyc.c4q.ac21.weatherclock;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.net.URL;

/**
 * Created by Jose on 4/8/15.
 */
public class WeatherStats
{
    public static Long getHumidity() {
        URL url = HTTP.stringToURL("http://api.openweathermap.org/data/2.5/weather?q=New%20York,NY");
        String doc = HTTP.get(url);
        JSONObject obj = (JSONObject) JSONValue.parse(doc);

        JSONObject sys = (JSONObject) obj.get("main");
        if (sys == null)
            return null;
        Long humidity = (Long) sys.get("humidity");
        if (humidity == null)
            return null;
        return humidity;
    }

    public static Double getTemperature() {
        URL url = HTTP.stringToURL("http://api.openweathermap.org/data/2.5/weather?q=New%20York,NY");
        String doc = HTTP.get(url);
        JSONObject obj = (JSONObject) JSONValue.parse(doc);

        JSONObject sys = (JSONObject) obj.get("main");
        if (sys == null)
            return null;
        Double temp = (Double) sys.get("temp");
        if (temp == null)
            return null;

        // convert from Kelvin to Fahrenheit
        temp = (temp - 273.15)*(9/5)+32;

        // round to first decimal place
        double p = Math.pow(10d, 0);
        return Math.round(temp * p)/p;
    }
//
//    public static Long getHumidity() {
//        URL url = HTTP.stringToURL("http://api.openweathermap.org/data/2.5/weather?q=New%20York,NY");
//        String doc = HTTP.get(url);
//        JSONObject obj = (JSONObject) JSONValue.parse(doc);
//
//        JSONObject sys = (JSONObject) obj.get("main");
//        if (sys == null)
//            return null;
//        Long humidity = (Long) sys.get("humidity");
//        if (humidity == null)
//            return null;
//        return humidity;
//    }
}
