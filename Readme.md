# Herokuapp
This project contains automation that is build using Selenium with Java programming languange. This project is developed using tools Maven. 

## Features
The scenario in this automation consists of some features:
1. Valid username and password → user is successfully logged in to herokuapp web and see success message.
2. Invalid username and valid password → user is failed logged in to herokuapp web and see error message.
3. Valid username and invalid password → user is failed logged in to herokuapp web and see error message.

## Prerequisites
- Java
- Selenium
- Chromedriver
- Editor Intellij/Eclipse
- Git

## How to Run?
1. Clone the repository
2. Go to the reposiotry automation and open in the Editor
3. **Add Selenium Jar** → Click go to File → Project Structure → in a project setting tab look for Modules → Dependencies → Click on ‘+’ Sign → Select for JARs or directories
4. **Open file scenario** → Open on the folder `/src/main/java/automation_login`.
5. **Update the location on the chromedriver**
   ```System.setProperty("webdriver.chrome.driver", "<chromedriver location on local>");```
6. **Run the scenario** → Right click the each file and select Run file name.
7. **Open the browser** It will open the chrome browser automatically and run each steps on the scenario.
