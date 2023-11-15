package ant.io.flink.runner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junitpioneer.jupiter.SetEnvironmentVariable;

import static org.junit.jupiter.api.Assertions.*;

public class ReplaceEnvironmentVariableTest {
    @Test
    @SetEnvironmentVariable(key = "DB_USERNAME", value = "dbuser")
    @SetEnvironmentVariable(key = "DB_PASSWORD", value = "dbpassword")
    public void testEnvString() {
        String testString = "This is a test ${DB_USERNAME} and ${DB_PASSWORD}";
        String expected = "This is a test dbuser and dbpassword";
        assertEquals(expected,ReplaceEnvironmentVariable.replace(testString));
    }

    @Test
    @SetEnvironmentVariable(key = "DB_USERNAME", value = "dbuser")
    @SetEnvironmentVariable(key = "USERNAME", value = "username")
    public void testEnvStringACase() {
        String testString = "CREATE TABLE orders (\n" +
                "  order_number BIGINT,\n" +
                "  price        DECIMAL(32,2),\n" +
                "  buyer        ROW<first_name STRING, last_name STRING>,\n" +
                "  order_time   TIMESTAMP(3)\n" +
                ") WITH (\n" +
                "  'connector' = 'datagen',\n" +
                "  'username' = '${USERNAME}'\n" +
                ");";
        String expected = "CREATE TABLE orders (\n" +
                "  order_number BIGINT,\n" +
                "  price        DECIMAL(32,2),\n" +
                "  buyer        ROW<first_name STRING, last_name STRING>,\n" +
                "  order_time   TIMESTAMP(3)\n" +
                ") WITH (\n" +
                "  'connector' = 'datagen',\n" +
                "  'username' = 'username'\n" +
                ");";
        assertEquals(expected,ReplaceEnvironmentVariable.replace(testString));
    }
}