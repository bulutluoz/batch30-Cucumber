package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
    plugin={"html:target\\cucumber-reports.html"},
    features="src/test/resources/features",
    glue="stepdefinitions",
    tags="@editor2"  ,

    dryRun= false        // dryRun=true dedigimizde testi calistirmadan bize eksik adimi verir
        // dryRun=false yaparsak testi calistirir, eksik bir adimla karsilasirsa
        // test failed olur ve bize eksik adimi raporlar

)


public class Runner {

}
