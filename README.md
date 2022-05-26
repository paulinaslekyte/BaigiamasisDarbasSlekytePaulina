# random.org page testing project

## Setup
### Packages used
- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`

### Site used for testing
[random.org](https://www.random.org/)

### Pages used for testing
1. [Home](https://www.random.org/)
2. [Search](https://www.random.org/home)
3. [Login](https://accounts.random.org/)
4. [Coin flipper](https://www.random.org/coins/)
5. [Dice Roller](https://www.random.org/dice/)

## Tests used for pages testing

### - 1.Click on "Banned Hosts" from menu
##### - Open https://www.random.org/
##### - Click on "Web Tools" from menu
##### - Click on "Banned Hosts" button
##### - Check if title contains "List of Banned Hosts"

### 2. Search for word "Hello"
##### - Open https://www.random.org/home
##### - Click on "Search" field
##### - Type "Hello"
##### - Click "Search" button
##### - Check if new page was opened
##### - Check if "Search" field contains word "hello site:random.org"

### 3. Login with existing user
##### - Open  https://accounts.random.org/
##### - Type "Testinglogin" in login field
##### - Type "testinglogin123" in password field
##### - Click on "Login" button
##### - Check if login is successful (for ex. by appearing button "Edit Account")


### 4. Pick values for Coin Flipper
##### - Open https://www.random.org/coins/
##### - Choose value "1" for "Flip" from drowpdown
##### - Choose value "Australian $1" for "Type" from dropdown
##### - Click  "Flip Coin(s)" button
##### - Check if 1 coin flipped on Australian $1

### 5. Login
##### - Open https://www.random.org/dice/
##### - Choose value "1" for "Roll" from drowpdown
##### - Click  "Roll dice" button
##### - Check if 1 random dice rolled


