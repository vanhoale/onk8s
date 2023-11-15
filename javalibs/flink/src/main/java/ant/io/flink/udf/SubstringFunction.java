package ant.io.flink.udf;

import org.apache.flink.table.functions.ScalarFunction;

/**
 * CREATE FUNCTION myfunc AS 'ant.io.flink.udf.SubstringFunction'
 * LANGUAGE Java;
 *
 * SELECT myfunc(field, 1, 3) FROM atable;
 */
public class SubstringFunction extends ScalarFunction {
    public String eval(String s, Integer begin, Integer end) {
        return s.substring(begin, end);
    }
}