$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customers.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboad",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Dashboad()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new Customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_customers_Menu()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d97.0.4692.99)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u00271SMTKJ2\u0027, ip: \u0027192.168.2.115\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 97.0.4692.99, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\VIPINS~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:57897}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 9581a51f7f37e4d5bd6fef70620ba59a\n*** Element info: {Using\u003dxpath, value\u003d//a[@href\u003d\u0027#\u0027]//p[contains(text(),\u0027Customers\u0027)]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pageObjects.AddcustomerPage.clickOnCustomersMenu(AddcustomerPage.java:76)\r\n\tat stepDefinitions.Steps.user_click_on_customers_Menu(Steps.java:209)\r\n\tat ✽.User click on customers Menu(file:Features/Customers.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Add_new_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view Add new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Add_new_customer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enter customer info",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_enter_customer_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_confirmation_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d97.0.4692.99)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u00271SMTKJ2\u0027, ip: \u0027192.168.2.115\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 97.0.4692.99, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\VIPINS~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:57930}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 39e62da72d5537f8712419216288b629\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat stepDefinitions.Steps.user_opens_URL(Steps.java:99)\r\n\tat ✽.User opens URL \"http://admin-demo.nopcommerce.com/login\"(file:Features/Customers.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view Dashboad",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Dashboad()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Search Customer by EMailID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter customer EMail",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_customer_EMail()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should found Email in the Search table",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_found_Email_in_the_Search_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboad",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Dashboad()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d97.0.4692.99)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u00271SMTKJ2\u0027, ip: \u0027192.168.2.115\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 97.0.4692.99, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\VIPINS~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:57947}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: fd961a0eed9a5d6acc5558bb4605e434\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:281)\r\n\tat pageObjects.AddcustomerPage.getPageTitle(AddcustomerPage.java:70)\r\n\tat stepDefinitions.Steps.user_can_view_Dashboad(Steps.java:197)\r\n\tat ✽.User can view Dashboad(file:Features/Customers.feature:10)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Search Customer by Name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter customer FirstName",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_customer_FirstName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter customer LastName",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_customer_LastName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should found Name in the Search table",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_found_Name_in_the_Search_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});