# Herokuapp
This project contains automation that is build using Selenium with Java programming languange. This project is developed using tools Maven. 

## Features
The scenario in this automation consists of some features:
1. Valid username and password → user is successfully logged in to herokuapp web and see success message.
2. Invalid username and valid password → user is failed logged in to herokuapp web and see error message.
3. Valid username and invalid password → user is failed logged in to herokuapp web and see error message.

## How to Run?
1. **Add Selenium Jar** → Click go to File → Project Structure → in a project setting tab look for Modules → Dependencies → Click on ‘+’ Sign → Select for JARs or directories
2. **Open file scenario** → Open on the folder `/src/main/java/automation_login`.
3. **Update the location on the chromedriver**
   ```System.setProperty("webdriver.chrome.driver", "<chromedriver location on local>");```
4. **Run the scenario** → Right click the each file and select Run file name.
5. **Open the browser** It will open the chrome browser automatically and run each steps on the scenario.
