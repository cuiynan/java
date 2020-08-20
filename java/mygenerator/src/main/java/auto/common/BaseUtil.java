package auto.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

/**
 * @author JiaFuJun
 * 2019年12月05日 16:56:00
 */
public class BaseUtil {
    private static Properties properties;

    public static Properties getProperties(String classPath) throws Exception {
        if (properties == null) {
            String path = System.getProperty("user.dir");
            path += classPath;
            properties = new Properties();
            // 使用InPutStream流读取properties文件
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            properties.load(bufferedReader);
        }
        return properties;
    }
}
