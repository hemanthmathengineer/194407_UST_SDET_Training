$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "Login Feature File",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login scenario test for Gmail",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "navigate to Gmail page",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumber.LoginSteps.navigate_to_Gmail_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user loged in",
  "keyword": "When "
});
formatter.match({
  "location": "cucumber.LoginSteps.user_loged_in()"
});
formatter.result({
  "status": "passed"
});
});