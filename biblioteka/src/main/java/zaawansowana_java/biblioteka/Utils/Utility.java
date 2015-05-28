package zaawansowana_java.biblioteka.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Utility {

	/**
	 * Parsing string in expected form to java.sql.Date
	 * @param strDate date in string in form yyyy-mm-dd
	 * @return
	 * @throws ParseException
	 */
	public static java.sql.Date covertStringToSqlDate(String strDate) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		java.util.Date date=sdf.parse(strDate);
		return new java.sql.Date(date.getTime());
	}
	
}
