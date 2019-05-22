$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("currency.feature");
formatter.feature({
  "line": 2,
  "name": "user should able to change currency  from drop down box and verify price should be updated in selected currency",
  "description": "",
  "id": "user-should-able-to-change-currency--from-drop-down-box-and-verify-price-should-be-updated-in-selected-currency",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@currency"
    }
  ]
});
formatter.before({
  "duration": 10811925429,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "user should able to change currency  from drop down box",
  "description": "",
  "id": "user-should-able-to-change-currency--from-drop-down-box-and-verify-price-should-be-updated-in-selected-currency;user-should-able-to-change-currency--from-drop-down-box",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on dropdown box",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "select option",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should be able to  change currency",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user should able to see prices of product in selected currency",
  "keyword": "And "
});
formatter.match({
  "location": "Currencysmokeclass.user_is_on_homepage()"
});
formatter.result({
  "duration": 172205118,
  "status": "passed"
});
formatter.match({
  "location": "Currencysmokeclass.user_click_on_dropdown_box()"
});
formatter.result({
  "duration": 52657,
  "status": "passed"
});
formatter.match({
  "location": "Currencysmokeclass.select_option()"
});
formatter.result({
  "duration": 1379403626,
  "status": "passed"
});
formatter.match({
  "location": "Currencysmokeclass.user_should_be_able_to_change_currency()"
});
formatter.result({
  "duration": 33915,
  "status": "passed"
});
formatter.match({
  "location": "Currencysmokeclass.user_should_able_to_see_prices_of_product_in_selected_currency()"
});
formatter.result({
  "duration": 55499353,
  "status": "passed"
});
formatter.after({
  "duration": 848362428,
  "status": "passed"
});
formatter.uri("registration.feature");
formatter.feature({
  "line": 2,
  "name": "user should be able to register sucessfully so that he can use all feature from our website",
  "description": "",
  "id": "user-should-be-able-to-register-sucessfully-so-that-he-can-use-all-feature-from-our-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@register"
    }
  ]
});
formatter.before({
  "duration": 5871129082,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User  navigate on registration  form after click on Register",
  "description": "",
  "id": "user-should-be-able-to-register-sucessfully-so-that-he-can-use-all-feature-from-our-website;user--navigate-on-registration--form-after-click-on-register",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on register",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user navigate to registration form",
  "keyword": "Then "
});
formatter.match({
  "location": "smoketest.user_is_on_homepage()"
});
formatter.result({
  "duration": 59351,
  "status": "passed"
});
formatter.match({
  "location": "smoketest.user_clicks_on_register()"
});
formatter.result({
  "duration": 79432,
  "status": "passed"
});
formatter.match({
  "location": "smoketest.user_navigate_to_registration_form()"
});
formatter.result({
  "duration": 2449483223,
  "status": "passed"
});
formatter.after({
  "duration": 849107662,
  "status": "passed"
});
formatter.uri("sort.feature");
formatter.feature({
  "line": 3,
  "name": "user should be able to sort products from high to low and verify product should be from high to low",
  "description": "",
  "id": "user-should-be-able-to-sort-products-from-high-to-low-and-verify-product-should-be-from-high-to-low",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sort"
    }
  ]
});
formatter.before({
  "duration": 5929117157,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "user should sort product from high to low",
  "description": "",
  "id": "user-should-be-able-to-sort-products-from-high-to-low-and-verify-product-should-be-from-high-to-low;user-should-sort-product-from-high-to-low",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user select notebook in Computers",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on sort by price:high to low",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should  see  product price from high to low",
  "keyword": "Then "
});
formatter.match({
  "location": "Currencysmokeclass.user_is_on_homepage()"
});
formatter.result({
  "duration": 45071,
  "status": "passed"
});
formatter.match({
  "location": "Sortby.user_select_notebook_in_Computers()"
});
formatter.result({
  "duration": 1210441834,
  "status": "passed"
});
formatter.match({
  "location": "Sortby.click_on_sort_by_price_high_to_low()"
});
formatter.result({
  "duration": 1050910590,
  "status": "passed"
});
formatter.match({
  "location": "Sortby.user_should_see_product_price_from_high_to_low()"
});
formatter.result({
  "duration": 38823,
  "status": "passed"
});
formatter.after({
  "duration": 832867377,
  "status": "passed"
});
});