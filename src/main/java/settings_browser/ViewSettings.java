package settings_browser;

public class ViewSettings {
    /**
     *
     * Execution modes: "--headed" + and + "--headless"
     *
     * */
    private final String headed_mode;
    private final String headless_mode;


    public ViewSettings(){
        this.headed_mode = "--headed";
        this.headless_mode = "--headless";
    }

    public String getHeaded_mode(){
        return this.headed_mode;
    }

    public String getHeadless_mode(){
        return this.headless_mode;
    }
}