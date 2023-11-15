package ant.io.flink.runner;

import org.apache.commons.text.StringSubstitutor;
import org.apache.commons.text.lookup.StringLookup;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceEnvironmentVariable {
    public static String replace(String s) {
        String pattern = "\\$\\{([A-Za-z0-9_]+)\\}";
        Pattern expr = Pattern.compile(pattern);
        Matcher matcher = expr.matcher(s);
        Map<String, String> valMap = new HashMap<>();
        while (matcher.find()) {
            String key = matcher.group(1);
            String value = System.getenv(key)==null? "" : System.getenv(key);
            valMap.put(key, value);
        }
        StringSubstitutor stringSubstitutor = new StringSubstitutor(valMap);
        return stringSubstitutor.replace(s);
    }
}
