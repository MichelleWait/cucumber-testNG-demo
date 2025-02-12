package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features", // 特性文件路径
        glue = "com.example.stepsDefinitions",              // 步骤定义包路径
        plugin = {
                "pretty",                            // 格式化输出
                "html:target/cucumber-reports.html", // 生成 HTML 报告
                "json:target/cucumber-reports.json"  // 生成 JSON 报告
        }
)

@Test
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}

