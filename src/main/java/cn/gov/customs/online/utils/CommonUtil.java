package cn.gov.customs.online.utils;

import java.util.List;

/**
 * 公共工具类
 */
public class CommonUtil {

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isStringEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    /**
     * 判断List是否为空
     * @param list
     * @return
     */
    public static boolean isListEmpty(List list) {
        return list == null || list.size() == 0;
    }

}
