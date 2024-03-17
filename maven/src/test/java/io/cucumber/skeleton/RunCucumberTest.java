package io.cucumber.skeleton;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("io.cucumber.skeleton")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, " +
        "summary, " +
        "json:target/reports/cucumber-reports/cucumber.json, " +
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "io.cucumber.skeleton")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@scenarioOutline")
public class RunCucumberTest {
}
