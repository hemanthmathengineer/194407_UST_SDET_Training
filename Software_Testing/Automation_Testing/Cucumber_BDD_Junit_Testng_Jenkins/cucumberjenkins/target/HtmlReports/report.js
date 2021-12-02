$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/feature.feature");
formatter.feature({
  "name": "Cucumber-Selinieum-TestNG",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User Registrarion",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Navigate to Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumberjenkins.StepDef.navigate_to_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Contact Information",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberjenkins.StepDef.contact_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Mailing Information",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberjenkins.StepDef.mailing_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Information",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberjenkins.StepDef.user_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login Information",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberjenkins.StepDef.login_information()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d95.0.4638.69)\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027DESKTOP-RRR4LHT\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 95.0.4638.69, chrome: {chromedriverVersion: 95.0.4638.54 (d31a821ec901f..., userDataDir: C:\\Users\\heman\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60823}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: a9b3ea5c02dfd3bbef73ce6393317aa3\n*** Element info: {Using\u003dname, value\u003duserName}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:448)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat cucumberjenkins.StepDef.login_information(StepDef.java:54)\r\n\tat ✽.Login Information(file:///C:/Users/heman/eclipse-workspace/cucumberjenkins/src/test/resources/Features/feature.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Preferences",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberjenkins.StepDef.preferences()"
});
formatter.result({
  "status": "skipped"
});
});