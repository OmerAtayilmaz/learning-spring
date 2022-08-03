package boots;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateBoot {
    /*
     * @Params: Date currentDate
     * @Params: Format yourNewFormat
     * @Returns: String
     */
    public static String dateFormatter(Date date,String formatStr){
        return new SimpleDateFormat(formatStr).format(date);
    }

    /*
     * @Params: String
     * @Params: String the date format in the current string
     * @Returns: Date
     */
    public static Date stringToDate(String convertibleStr,String format) {
    try{
        return new SimpleDateFormat(format).parse(convertibleStr);
    }
    catch(Exception e){
        System.out.println(e);
            return null;
        }
    }

}
