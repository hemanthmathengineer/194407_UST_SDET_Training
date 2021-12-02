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
  "keyword": "Then "
});
formatter.match({
  "location": "jenkinscucumber.StepDef.navigate_to_Browser()"
});
formatter.result({
  "status": "passed"
});
});