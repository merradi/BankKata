$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("depositWithdrawsAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Deposit into account",
  "description": "",
  "id": "deposit-into-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create account for Customer with account",
  "description": "",
  "id": "deposit-into-account;create-account-for-customer-with-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "create account for Customer \"marouane\" with 200 EUR in his account",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "he deposits 100 EUR into his account",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "he withdraws 50 EUR from his account",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "customer new balance is 250 EUR",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "marouane",
      "offset": 29
    },
    {
      "val": "200",
      "offset": 44
    }
  ],
  "location": "RunDepositWithdrawsAccountTest.create_account_for_Customer(String,int)"
});
formatter.result({
  "duration": 144450306,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 12
    }
  ],
  "location": "RunDepositWithdrawsAccountTest.he_deposits_EUR_into_his_account(int)"
});
formatter.result({
  "duration": 337633,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 13
    }
  ],
  "location": "RunDepositWithdrawsAccountTest.he_withdraws_EUR_from_his_account(int)"
});
formatter.result({
  "duration": 284711,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "250",
      "offset": 24
    }
  ],
  "location": "RunDepositWithdrawsAccountTest.customer_new_balance_is_EUR(int)"
});
formatter.result({
  "duration": 2443429,
  "status": "passed"
});
});