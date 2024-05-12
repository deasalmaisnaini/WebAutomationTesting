# Web Automation Testing 
<img src="https://drive.google.com/uc?id=1O5vMZ6EybOVWGQKiRE-PSjZf1U0k4y_3" alt="Web Automation Testing" width="700">

[![Collaborators](https://img.shields.io/badge/Collaborators-Falia%20Davina%20%7C%20Dea%20Salma%20%7C%20Syifa%20Khairina-blue)](https://github.com/deasalmaisnaini)
[![Technologies](https://img.shields.io/badge/Technologies-Selenium%20%7C%20Cucumber%20%7C%20Maven%20%7C%20Java%20%7C%20JUnit-red)](https://github.com/deasalmaisnaini/WebAutomationTesting)

(https://github.com/deasalmaisnaini/WebAutomationTesting)

Repositori ini merupakan proyek untuk melakukan pengujian fungsionalitas Login dan Logout pada website [SauceDemo](https://www.saucedemo.com/) yang dilakukan secara otomatis menggunakan Selenium, Cucumber, dan build tools Maven dengan bahasa pemrograman Java.

<!-- TABLE OF CONTENTS -->
## :ledger: Table Of Content



<!-- ABOUT THE PROJECT -->
##  :beginner: About
Proyek ini merupakan pengujian fungsionalitas Login dan Logout pada website [SauceDemo](https://www.saucedemo.com/). Pengujian dilakukan secara otomatis menggunakan Selenium untuk mengotomatisasi interaksi dengan browser, Cucumber untuk penulisan skenario pengujian dalam bahasa Gherkin, JUnit untuk menjalankan dan mengelola unit test, dan Maven sebagai build tools proyek dan pengelolaan dependency. Proyek ini dibuat menggunakan bahasa pemrograman Java.

### 👩‍💻 Author
- Dea Salma Isnaini
- Falia Davina Gustaman
- Syifa Khairina

### :dart: Tujuan
Tujuan utama dari proyek ini adalah untuk memenuhi tugas mata kuliah Pengujian Perangkat Lunak Praktikum mengenai Pemahaman Automation Testing Web
Application dengan Cucumber dan Selenium

### :mag_right: Test Case
Sebelum melakukan pengujian otomatis kami telah membuat test case menggunakan Pendekatan BDD dengan detail pada tabel berikut 

| TC ID | Module (Feature) | Case (-/+/edge) | Test Case Name (Scenario) | Precondition (GIVEN) | Steps to execute (WHEN) | Test Data | Expected Result (THEN) |
|-------|------------------|-----------------|----------------------------|----------------------|-------------------------|-----------|------------------------|
| 0.0.1 | Login Page View  | Positif         | Verify login page          | 1. User has opened swag labs browser<br>2. User has navigated to the login page |  | | 1. There are fields for inputting username and password that have not been filled in<br>2. There is a green Login Button<br>3. There is a Swag Labs logo name |
| 0.1.1 | Login Functionality | Positif      | Check the login is successful with the credentials registered on the system | 1. User has opened swag labs browser<br>2. User has navigated to the login page | 1. User enters username & password<br>2. User clicks on login button | - Username: standard_user<br>- Password: secret_sauce | 1. User should be able to see Dashboard page |
| 0.1.2 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is registered username and empty password field | 1. User has opened swag labs browser<br>2. User has navigated to the login page | 1. User enters username & password<br>2. User clicks on login button | - Username: standard_user<br>- Password: | 1. Showing symbol red x in the password field<br>2. Showing Error message "You need Password"<br>3. Stay on the login page<br>4. The label and border in the password field are red |
| 0.1.3 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is registered password and empty username field | 1. User has opened swag labs browser<br>2. User has navigated to the login page | 1. User enters username & password<br>2. User clicks on login button | - Username: <br>- Password: secret_sauce | 1. Showing symbol red x in the username field<br>2. Showing Error message "You need Username"<br>3. Stay on the login page<br>4. The label and border in the username field are red |
| 0.1.4 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is empty username and password | 1. User has opened swag labs browser<br>2. User has navigated to the login page | 1. User enters username & password<br>2. User clicks on login button | - Username: <br>- Password: | 1. Showing symbol red x in the username field and password field<br>2. Showing Error message "You need Username & Password"<br>3. Stay on the login page<br>4. The label and border in the username field and password field are red |
| 0.1.5 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is registered username and the unregistered password | 1. User has opened swag labs browser<br>2. User has navigated to the login page | 1. User enters username & password<br>2. User clicks on login button | - Username: standard_user<br>- Password: secret | 1. Showing symbol red x in the username field and password field<br>2. Showing Error message "Username and password do not match any user in this service"<br>3. Stay on the login page<br>4. The label and border in the username field and password field are red |
| 0.1.6 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is unregistered username and the registered password | 1. User has opened swag labs browser<br>2. User has navigated to the login page | 1. User enters username & password<br>2. User clicks on login button | - Username: standard<br>- Password: secret_sauce | 1. Showing symbol red x in the username field and password field<br>2. Showing Error message "Username and password do not match any user in this service"<br>3. Stay on the login page<br>4. The label and border in the username field and password field are red |
| 0.1.7 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is unregistered username and password | 1. User has opened swag labs browser<br>2. User has navigated to the login page | 1. User enters username & password<br>2. User clicks on login button | - Username: standard<br>- Password: secret | 1. Showing symbol red x in the username field and password field<br>2. Showing Error message "Username and password do not match any user in this service"<br>3. Stay on the login page<br>4. The label and border in the username field and password field are red |
| 0.2.1 | Logout Functionality | Positive    | Verify if logout is successful | 1. User has opened swag labs browser<br>2. User has logged in to swag labs | 1. User clicks on hamburger icon at top left corner<br>2. User clicks on logout button | | 1. User should be able to log out successfully |

## :gear: Tools
Proyek ini menggunakan beberapa teknologi utama:

### Java 11
[![Java](https://img.shields.io/badge/Java-11-blue?logo=java)](https://www.oracle.com/java/)

Bahasa pemrograman Java versi 11 digunakan dalam proyek ini untuk mengembangkan skrip otomatisasi.

### JUnit 4
[![JUnit](https://img.shields.io/badge/JUnit-4-green?logo=junit)](https://junit.org/junit4/)

JUnit 4 digunakan untuk menjalankan dan mengelola unit test dalam proyek ini.

### Cucumber
[![Cucumber](https://img.shields.io/badge/Cucumber-BDD-orange?logo=cucumber)](https://cucumber.io/)

Cucumber digunakan untuk menulis skenario pengujian dalam bahasa Gherkin agar lebih mudah dipahami dan terstruktur.

### Selenium
[![Selenium](https://img.shields.io/badge/Selenium-Automation-blueviolet?logo=selenium)](https://www.selenium.dev/)

Selenium digunakan untuk mengotomatisasi interaksi dengan browser web dalam pengujian otomatis.

### WebDriver Chrome 
[![Chrome Driver](https://img.shields.io/badge/Chrome%20Driver-Latest-yellow?logo=googlechrome)](https://chromedriver.chromium.org/)

WebDriver Chrome versi 1.24 digunakan sebagai driver untuk mengontrol browser Google Chrome dalam pengujian.

###  :electric_plug: Installation
- Steps on how to install this project, to use it.
- Be very detailed here, For example, if you have tools which run on different operating systems, write installation steps for all of them.




