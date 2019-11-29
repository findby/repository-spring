package org.part.spring.commutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * @author wenxiang.fei
 * @Description 时间格式转换工具类
 * @time 2019-11-27 16:48:40
 */
public class DateUtils {
	private static String DEFAULT_DATE_FORMART = "yyyy-MM-dd";
	private static String SIMPLE_DATE_FORMART = "yyyy-MM-dd HH:mm:ss";
	//private String DEFAULT_FORMART = "";

	/***
	 * @Description Date时间转String
	 * @param date 待转换的时间
	 * @return
	 */
	public static String defaultDateToStr(Date date) {
		SimpleDateFormat defaultDateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMART);
		if (null == date) {
			return null;
		}
		return defaultDateFormat.format(date);
	}

	/***
	 * @Description Date时间转String
	 * @param date 待转换的时间
	 * @return
	 */
	public static String simpleDateToStr(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(SIMPLE_DATE_FORMART);
		if (null == date) {
			return null;
		}
		return simpleDateFormat.format(date);
	}

	/***
	 * @Description String转Date
	 * @param dateStr 待转换的时间字符串
	 * @param feature (给数值1/2)1:转换成yyyy-MM-dd格式
	 * 				  2:转换成yyyy-MM-dd HH:mm:ss格式
	 * @return
	 */
	public static Date strToDate(String dateStr, Integer feature) {
		Date date = null;
		switch (feature) {
		case 1:// 默认时间格式 yyyy-MM-dd
			SimpleDateFormat defaultDateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMART);
			try {
				date = defaultDateFormat.parse(dateStr);
			} catch (ParseException e) {
				throw new RuntimeException(dateStr + ":时间格式错误");
			}
			break;
		case 2:// yyyy-MM-dd HH:mm:ss
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(SIMPLE_DATE_FORMART);
			try {
				int length = dateStr.length();
				
				if(length==9) {
					StringBuffer stringBuffer = new StringBuffer(dateStr);
					stringBuffer.append(" 00:00:00");
					dateStr=stringBuffer.toString();
				}
				if(length==12) {
					StringBuffer stringBuffer = new StringBuffer(dateStr);
					stringBuffer.append(":00:00");
					dateStr=stringBuffer.toString();
				}
				if(length==15) {
					StringBuffer stringBuffer = new StringBuffer(dateStr);
					stringBuffer.append(":00");
					dateStr=stringBuffer.toString();
				}
				date = simpleDateFormat.parse(dateStr);
			} catch (ParseException e) {
				throw new RuntimeException(dateStr + ":时间格式错误");
			}
			break;
		default:
			break;
		}
		return date;
	}
}
