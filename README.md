# zana.lt page testing project

## Setup
### Packages used
- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`

### Site used for testing
[zana.lt](https://zana.lt/)

### Pages used for testing
1. [Home](https://zana.lt/)
2. [Search](https://zana.lt/)
3. [Get subscription](https://zana.lt/)
4. [Login](https://zana.lt/prisijungimas?back=my-account)
5. [Choose shop](https://zana.lt/parduotuves)


## Tests used for pages testing

### - 1.Choose "About Us" from menu
##### - Open https://zana.lt/
##### - Click on "Abouts" from head menu
##### - Check if title contains "Apie mus"

### 2. Search for word "puodelis"
##### - Open https://zana.lt/
##### - Click on "Search" field
##### - Type "puodelis"
##### - Click enter
##### - Check if "Search" field contains word "puodelis"

### 3. Get subscription
##### - Open  https://zana.lt/
##### - Type "miauroar@gmail.com" in email field
##### - Click confirm button
##### - Click on "Get" button
##### - Check if email field contains "@"


### 4. Login with existing user
##### - Open https://zana.lt/prisijungimas?back=my-account
##### - Type "miauroar@gmail.com" in email field
##### - Type "Testing123" in password field
##### - Click  "Login" button
##### - Check if "Logout" function appeared

### 5. Choose to show Vilnius shops
##### - Open https://zana.lt/parduotuves
##### - Choose "Vilnius" option from menu
##### - Check if showed shops emails name contains word "vilnius"

