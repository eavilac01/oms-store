package conts;

import utils.PropertyReader;

public class PropertyConst {
    public static final String WEB_SITE = PropertyReader.getProperty("input.properties", "web.url.sterling");
    public static final String USER = PropertyReader.getProperty("input.properties", "web.sterling.user");
    public static final String PASS = PropertyReader.getProperty("input.properties", "web.sterling.pass");
}