package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
        public static String getProperty(String fileName, String key) {
            Properties properties = new Properties();
            InputStream inputStream = null;
            String propertyValue = null;

            try {
                inputStream = ClassLoader.getSystemResourceAsStream(fileName);
                properties.load(inputStream);
                propertyValue = properties.getProperty(key);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                closeInput(inputStream);
            }
            return propertyValue;
        }

        public static void closeInput(InputStream inputStream) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
}

