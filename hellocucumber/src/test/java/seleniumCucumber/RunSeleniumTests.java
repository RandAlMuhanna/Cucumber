package seleniumCucumber;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;


@Suite
@IncludeEngines("cucumber")
@SelectPackages("seleniumCucumber")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber.html")
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME , value = "@BetterGherkin")

public class RunSeleniumTests {
}