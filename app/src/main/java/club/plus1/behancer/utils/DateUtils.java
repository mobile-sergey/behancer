package club.plus1.behancer.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Vladislav Falzan.
 */

public class DateUtils {

    public static String format(long time) {
        Date date = new Date(time * 1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());

        return sdf.format(date);
    }
}
