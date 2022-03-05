package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Balathilagar\\eclipse-workspace\\Cucumber\\src\\test\\resources\\login.Feature"},glue= {"org.def"})
public class TestRunner {
}
