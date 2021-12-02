$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/test.feature");
formatter.feature({
  "name": "StepDefination",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumber3.StepDefinations.i_have_open_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open Facebook website",
  "keyword": "When "
});
formatter.match({
  "location": "cucumber3.StepDefinations.i_open_Facebook_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login button should exits",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumber3.StepDefinations.login_button_should_exits()"
});
formatter.result({
  "status": "passed"
});
});