# Web Automation Testing 
<img src="https://drive.google.com/uc?id=1O5vMZ6EybOVWGQKiRE-PSjZf1U0k4y_3" alt="Web Automation Testing" width="700">

[![Collaborators](https://img.shields.io/badge/Collaborators-Falia%20Davina%20%7C%20Dea%20Salma%20%7C%20Syifa%20Khairina-blue)](https://github.com/deasalmaisnaini)
[![Technologies](https://img.shields.io/badge/Technologies-Selenium%20%7C%20Cucumber%20%7C%20Maven%20%7C%20Java%20%7C%JUnit-red)](https://github.com/deasalmaisnaini/WebAutomationTesting)

Repositori ini merupakan proyek untuk melakukan pengujian fungsionalitas Login dan Logout pada website [SauceDemo](https://www.saucedemo.com/) yang dilakukan secara otomatis menggunakan Selenium, Cucumber, dan build tools Maven dengan bahasa pemrograman Java.

<!-- TABLE OF CONTENTS -->
## Table of Contents



<!-- ABOUT THE PROJECT -->
## About The Project
Proyek ini merupakan pengujian fungsionalitas Login dan Logout pada website [SauceDemo](https://www.saucedemo.com/). Pengujian dilakukan secara otomatis menggunakan Selenium untuk mengotomatisasi interaksi dengan browser, Cucumber untuk penulisan skenario pengujian dalam bahasa Gherkin, JUnit untuk menjalankan dan mengelola unit test, dan Maven sebagai build tools proyek dan pengelolaan dependency. Proyek ini dibuat menggunakan bahasa pemrograman Java.

### Author
- Dea Salma Isnaini
  
- Falia Davina Gustaman 
  
- Syifa Khairina 

### Tujuan
Tujuan utama dari proyek ini adalah untuk memenuhi tugas mata kuliah Pengujian Perangkat Lunak Praktikum mengenai Pemahaman Automation Testing Web
Application dengan Cucumber dan Selenium

### Test Case
Sebelum melakukan pengujian otomatis kami telah membuat test case menggunakan Pendekatan BDD dengan detail pada tabel berikut 

| TC ID | Module (Feature) | Case (-/+/edge) | Test Case Name (Scenario) | Precondition (GIVEN) | Steps to execute (WHEN) | Test Data | Expected Result (THEN) |
|-------|------------------|-----------------|----------------------------|----------------------|-------------------------|-----------|------------------------|
| 0.0.1 | Login Page View  | Positif         | Verify login page          | 1. User has opened swag labs browser | 1. User has opened swag labs browser | | 1. There are fields for inputting username and password that have not been filled in<br>2. There is a green Login Button<br>3. There is a Swag Labs logo name |
| 0.1.1 | Login Functionality | Positif      | Check the login is successful with the credentials registered on the system | 1. User has opened swag labs browser<br>2. User has navigated to the login page | 1. User enters username & password<br>2. User clicks on login button | - Username: standard_user<br>- Password: secret_sauce | 1. User should be able to see Dashboard page |
| 0.1.2 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is registered username and empty password field | 1. User has opened swag labs browser<br>2. User has navigated to the login page | 1. User enters username & password<br>2. User clicks on login button | - Username: standard_user<br>- Password: | 1. Showing symbol red x in the password field<br>2. Showing Error message "You need Password"<br>3. Stay on the login page<br>4. The label and border in the password field are red |
| 0.1.3 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is registered password and empty username field | 1. User has opened swag labs browser<br>2. User has navigated to the login page | 1. User enters username & password<br>2. User clicks on login button | - Username: <br>- Password: secret_sauce | 1. Showing symbol red x in the username field<br>2. Showing Error message "You need Username"<br>3. Stay on the login page<br>4. The label and border in the username field are red |
| 0.1.4 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is empty username and password | 1. User has opened swag labs browser<br>2. User has navigated to the login page | 1. User enters username & password<br>2. User clicks on login button | - Username: <br>- Password: | 1. Showing symbol red x in the username field and password field<br>2. Showing Error message "You need Username & Password"<br>3. Stay on the login page<br>4. The label and border in the username field and password field are red |
| 0.1.5 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is registered username and the unregistered password | 1. User has opened swag labs browser<br>2. User has navigated to the login page | 1. User enters username & password<br>2. User clicks on login button | - Username: standard_user<br>- Password: secret | 1. Showing symbol red x in the username field and password field<br>2. Showing Error message "Username and password do not match any user in this service"<br>3. Stay on the login page<br>4. The label and border in the username field and password field are red |
| 0.1.6 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is unregistered username and the registered password | 1. User has opened swag labs browser<br>2. User has navigated to the login page | 1. User enters username & password<br>2. User clicks on login button | - Username: standard<br>- Password: secret_sauce | 1. Showing symbol red x in the username field and password field<br>2. Showing Error message "Username and password do not match any user in this service"<br>3. Stay on the login page<br>4. The label and border in the username field and password field are red |
| 0.1.7 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is unregistered username and password | 1. User has opened swag labs browser<br>2. User has navigated to the login page | 1. User enters username & password<br>2. User clicks on login button | - Username: standard<br>- Password: secret | 1. Showing symbol red x in the username field and password field<br>2. Showing Error message "Username and password do not match any user in this service"<br>3. Stay on the login page<br>4. The label and border in the username field and password field are red |
| 0.2.1 | Logout Functionality | Positive    | Verify if logout is successful | 1. User has opened swag labs browser<br>2. User has logged in to swag labs | 1. User clicks on hamburger icon at top left corner<br>2. User clicks on logout button | | 1. User should be able to log out successfully |





