package ai.yue.library.base.util;

import cn.hutool.core.util.StrUtil;

/**
 * String工具类
 * 
 * @author	ylyue
 * @since	2017年10月28日
 */
public class StringUtils extends StrUtil {
	
	/**
	 * 判断String数组是否为空<br>
	 * <p>弱判断，只确定数组中第一个元素是否为空</p>
	 * @param array 要判断的String[]数组
	 * @return String数组长度==0或者第一个元素为空（true）
	 */
	public static boolean isEmptys(String[] array) {
		return (null == array || array.length == 0 || isEmpty(array[0])) ? true : false;
	}
	
	/**
	 * 确认String数组不为空<br>
	 * <p>弱判断，只确定数组中第一个元素是否为空</p>
	 * @param array 要判断的String[]数组
	 * @return String数组长度==0或者第一个元素为空（true）
	 */
	public static boolean isNotEmptys(String[] array) {
		return !isEmptys(array);
	}
	
	/**
	 * 替换字符串-根据索引
	 * @param str 原始字符串
	 * @param replacedStr 替换字符串
	 * @param start 开始索引，包括此索引
	 * @param end 结束索引，不包括此索引（结束索引==开始索引：将在开始索引处插入替换字符串）
	 * @return 替换后的字符串
	 */
	public static String replace(String str, String replacedStr, int start, int end) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(str);
		stringBuffer.replace(start, end, replacedStr);
		return stringBuffer.toString();
	}
	
	/**
	 * 删除开始相等的字符串
	 * @param sb 		需要处理的字符串
	 * @param condition 条件
	 * @return 删除后的StringBuffer
	 */
	public static StringBuffer deleteFirstEqualString(StringBuffer sb, String condition) {
		if (sb.toString().startsWith(condition)) {
			return sb.delete(0, sb.length());
		}
		return sb;
	}
    
	/**
	 * 删除尾部相等的字符串
	 * @param sb 		需要处理的字符串
	 * @param condition 条件
	 * @return 删除后的StringBuffer
	 */
	public static StringBuffer deleteLastEqualString(StringBuffer sb, String condition) {
		int end = sb.length();
		int start = end - condition.length();
		String str = sb.substring(start, end);
		if (condition.equals(str)) {
			return sb.delete(start, end);
		}
		return sb;
	}
	
    /**
     * 删除前后相等字符串
     * @param str		需要处理的字符串
     * @param firstStr	开始字符串
     * @param lastStr	末尾字符串
     * @return 删除后的字符串
     */
    public static String deleteFirstLastEqualString(String str, String firstStr, String lastStr) {
    	StringBuffer sb = new StringBuffer(str);
    	sb = deleteFirstEqualString(sb, firstStr);
    	sb = deleteLastEqualString(sb, lastStr);
    	return sb.toString();
    }
    
    /**
     * 删除前后字符串
     * @param str		需要处理的字符串
     * @param length	删除长度
     * @return 删除后的字符串
     */
    public static String deleteFirstLastString(String str, int length) {
    	return str.substring(length, str.length() - length);
    }
    
}
