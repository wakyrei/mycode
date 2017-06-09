

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTool {
	public Date calendar_to_date(Calendar calendar, SimpleDateFormat simpleDateFormat) {
		String format = simpleDateFormat.format(calendar.getTime());
		try {
			return simpleDateFormat.parse(format);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
