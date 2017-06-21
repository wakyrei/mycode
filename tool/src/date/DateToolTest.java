package date;
import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DateToolTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void calendar_to_date_T() {
		DateTool dateTool = new DateTool();
		Calendar calendar = Calendar.getInstance();
		//计算月份开始和结束时间
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-01 00:00:00");
		calendar.add(Calendar.MONTH, -1);
		Date selectTime = dateTool.calendar_to_date(calendar, simpleDateFormat);
		System.out.println(selectTime);
	}

}
