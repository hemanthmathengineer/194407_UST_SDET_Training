$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "This test the urbanladder website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test the living module",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user opens the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumber.StepDefinations.the_user_opens_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to urban ladder",
  "keyword": "When "
});
formatter.match({
  "location": "cucumber.StepDefinations.the_user_navigates_to_google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search living",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumber.StepDefinations.search_living()"
});
formatter.result({
  "status": "passed"
});
});