package com.ethan.stratege;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;
import org.jooq.tools.StringUtils;

/**
 * @Auther: qi.xia
 * @Date: 2018/12/25 17:11
 * @Description:
 */
public class MyStratege extends DefaultGeneratorStrategy {

    private String tablePrefix = "t_";

    public String getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }


    @Override
    public String getJavaClassName(Definition definition, Mode mode) {

        StringBuilder result = new StringBuilder();

        String outputName = definition.getOutputName();
        if (!StringUtils.isBlank(tablePrefix) && outputName.startsWith(tablePrefix)) {
            outputName = outputName.substring(tablePrefix.length());
        }
        result.append(StringUtils.toCamelCase(outputName));

        if (mode == Mode.RECORD) {
            result.append("Record");
        } else if (mode == Mode.DAO) {
            result.append("Dao");
        } else if (mode == Mode.INTERFACE) {
            result.insert(0, "I");
        }
        return result.toString();
    }
}
