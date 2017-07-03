package com.javacodegeeks.at.login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"json:target/integration_cucumber.json"},//what formatters to use
        tags = {"@login"})//what tags to incluse(@)/exclude(@~)
public class LoginTest {
}
