package org.smart.chapter.util;

import org.apache.commons.lang3.StringUtils;

/**
 * webdemo2
 *
 * @author todayliao
 * @date 2019/1/21
 **/
public class StringUtil {
    /**
     * 判断字符串是否为空
     */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
