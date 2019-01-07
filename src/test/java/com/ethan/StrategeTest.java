package com.ethan;

import org.jooq.tools.StringUtils;

/**
 * @Auther: qi.xia
 * @Date: 2018/12/25 17:48
 * @Description:
 */
public class StrategeTest {

    private static String tablePrefix = "t_";

    public String getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    /**
     * 前缀测试
     *
     * @param args
     */
    public static void main(String[] args) {


        StringBuilder result = new StringBuilder();

        String outputName = "t_user";
        if (!StringUtils.isBlank(tablePrefix) && outputName.startsWith(tablePrefix)) {
            outputName = outputName.substring(tablePrefix.length());
        }
        result.append(StringUtils.toCamelCase(outputName));

        System.out.println(result.toString());

    }
}
