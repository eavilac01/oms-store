
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import page.SessionPage;
import printMessages.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber/report.html"}
)

public abstract class TestRunner {

    static Messages messages = new Messages();
    private static final Logger logger = LoggerFactory.getLogger(TestRunner.class);

    @AfterClass
    public static void cleanDriver(){
        SessionPage.closeBrowser();
        logger.info("[----{}----]", messages.getMessagesCloseSession());
    }
}