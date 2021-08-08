$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginParam.feature");
formatter.feature({
  "line": 3,
  "name": "jbk offline project",
  "description": "",
  "id": "jbk-offline-project",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@LoginParameter"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "login test1",
  "description": "",
  "id": "jbk-offline-project;login-test1",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user should be on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cuname\u003e\" and \"\u003cpass\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user shpuld be o home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "jbk-offline-project;login-test1;",
  "rows": [
    {
      "cells": [
        "uname",
        "pass"
      ],
      "line": 12,
      "id": "jbk-offline-project;login-test1;;1"
    },
    {
      "cells": [
        "kiran@gmail.com",
        "123456"
      ],
      "line": 13,
      "id": "jbk-offline-project;login-test1;;2"
    },
    {
      "cells": [
        "amruta@gmail.com",
        "vvsghbsjn"
      ],
      "line": 14,
      "id": "jbk-offline-project;login-test1;;3"
    },
    {
      "cells": [
        "reyansh@gmail.com",
        "fggg"
      ],
      "line": 15,
      "id": "jbk-offline-project;login-test1;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6957276700,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "login test1",
  "description": "",
  "id": "jbk-offline-project;login-test1;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@LoginParameter"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user should be on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters \"kiran@gmail.com\" and \"123456\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user shpuld be o home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_should_be_on_login_page()"
});
formatter.result({
  "duration": 5691903200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kiran@gmail.com",
      "offset": 13
    },
    {
      "val": "123456",
      "offset": 35
    }
  ],
  "location": "LoginStepDefs.user_enters_and(String,String)"
});
formatter.result({
  "duration": 478040100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1078222300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_shpuld_be_o_home_page()"
});
formatter.result({
  "duration": 19335900,
  "status": "passed"
});
formatter.after({
  "duration": 333860100,
  "status": "passed"
});
formatter.before({
  "duration": 2912095900,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "login test1",
  "description": "",
  "id": "jbk-offline-project;login-test1;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@LoginParameter"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user should be on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters \"amruta@gmail.com\" and \"vvsghbsjn\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user shpuld be o home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_should_be_on_login_page()"
});
formatter.result({
  "duration": 16549196100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "amruta@gmail.com",
      "offset": 13
    },
    {
      "val": "vvsghbsjn",
      "offset": 36
    }
  ],
  "location": "LoginStepDefs.user_enters_and(String,String)"
});
formatter.result({
  "duration": 3296703300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 984655200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_shpuld_be_o_home_page()"
});
formatter.result({
  "duration": 7501200,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cJavaByKiran | [Log in]\u003e but was:\u003cJavaByKiran | [Dashboard]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.stepdefs.LoginStepDefs.user_shpuld_be_o_home_page(LoginStepDefs.java:56)\r\n\tat ✽.Then user shpuld be o home page(LoginParam.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1057925000,
  "status": "passed"
});
formatter.before({
  "duration": 6245936500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "login test1",
  "description": "",
  "id": "jbk-offline-project;login-test1;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@LoginParameter"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user should be on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters \"reyansh@gmail.com\" and \"fggg\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user shpuld be o home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_should_be_on_login_page()"
});
formatter.result({
  "duration": 33488594600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "reyansh@gmail.com",
      "offset": 13
    },
    {
      "val": "fggg",
      "offset": 37
    }
  ],
  "location": "LoginStepDefs.user_enters_and(String,String)"
});
formatter.result({
  "duration": 6518741700,
  "error_message": "java.lang.NullPointerException\r\n\tat com.stepdefs.LoginStepDefs.user_enters_and(LoginStepDefs.java:43)\r\n\tat ✽.When user enters \"reyansh@gmail.com\" and \"fggg\"(LoginParam.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefs.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefs.user_shpuld_be_o_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1757552100,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d92.0.4515.131)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-PLDSBNV\u0027, ip: \u0027192.168.1.36\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 92.0.4515.131, chrome: {chromedriverVersion: 92.0.4515.43 (8c61b7e2989f2..., userDataDir: C:\\Users\\Amruta\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:64471}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 2bac22b4acce5445f77d414c13daea70\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:605)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.close(RemoteWebDriver.java:438)\r\n\tat com.stepdefs.LoginStepDefs.tearDown(LoginStepDefs.java:30)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:768)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
});