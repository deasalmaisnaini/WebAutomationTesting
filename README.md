# Web Automation Testing 
<img src="https://drive.google.com/uc?id=1O5vMZ6EybOVWGQKiRE-PSjZf1U0k4y_3" alt="Web Automation Testing" width="700">

[![Collaborators](https://img.shields.io/badge/Collaborators-Falia%20Davina%20%7C%20Dea%20Salma%20%7C%20Syifa%20Khairina-blue)]
[![Technologies](https://img.shields.io/badge/Technologies-Selenium%20%7C%20Cucumber%20%7C%20Maven%20%7C%20Java%20%7C%20JUnit-red)](https://github.com/deasalmaisnaini/WebAutomationTesting)

(https://github.com/deasalmaisnaini/WebAutomationTesting)

Repositori ini merupakan proyek untuk melakukan pengujian fungsionalitas Login dan Logout pada website [SauceDemo](https://www.saucedemo.com/) yang dilakukan secara otomatis menggunakan Selenium, Cucumber, dan build tools Maven dengan bahasa pemrograman Java.

<!-- TABLE OF CONTENTS -->
## :ledger: Table Of Content
- [Web Automation Testing](#web-automation-testing)
  - [:ledger: Table Of Content](#ledger-table-of-content)
  - [:beginner: About](#beginner-about)
    - [👩‍💻 Author](#-author)
    - [:dart: Tujuan](#dart-tujuan)
    - [:mag_right: Test Case](#mag_right-test-case)
  - [:gear: Tools](#gear-tools)
    - [Java 11](#java-11)
    - [JUnit 4](#junit-4)
    - [Cucumber](#cucumber)
    - [Selenium](#selenium)
    - [WebDriver Chrome](#webdriver-chrome)
  - [:electric_plug: Installation](#electric_plug-installation)
    - [Prasyarat](#prasyarat)
    - [Panduan Instalasi Langkah-demi-Langkah](#panduan-instalasi-langkah-demi-langkah)
      - [Untuk Windows:](#untuk-windows)
  - [:wrench: Development](#wrench-development)
    - [:file_folder: File Structure](#file_folder-file-structure)
    - [:file_folder: Menambahkan Test Script](#file_folder-menambahkan-test-script)

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
| 0.0.1 | Login Page View  | Positif         | Verify login page          | 1. User has opened swag labs browser |  | | 1. There are fields for inputting username and password that have not been filled in<br>2. There is a green Login Button<br>3. There is a Swag Labs logo name |
| 0.1.1 | Login Functionality | Positif      | Check the login is successful with the credentials registered on the system | 1. User has opened swag labs browser | 1. User enters username & password<br>2. User clicks on login button | - Username: standard_user<br>- Password: secret_sauce | 1. User should be able to see Dashboard page |
| 0.1.2 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is registered username and empty password field | 1. User has opened swag labs browser| 1. User enters username & password<br>2. User clicks on login button | - Username: standard_user<br>- Password: | 1. Showing symbol red x in the password field<br>2. Showing Error message "You need Password"<br>3. Stay on the login page<br>4. The label and border in the password field are red |
| 0.1.3 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is registered password and empty username field | 1. User has opened swag labs browser| 1. User enters username & password<br>2. User clicks on login button | - Username: <br>- Password: secret_sauce | 1. Showing symbol red x in the username field<br>2. Showing Error message "You need Username"<br>3. Stay on the login page<br>4. The label and border in the username field are red |
| 0.1.4 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is empty username and password | 1. User has opened swag labs browser | 1. User enters username & password<br>2. User clicks on login button | - Username: <br>- Password: | 1. Showing symbol red x in the username field and password field<br>2. Showing Error message "You need Username & Password"<br>3. Stay on the login page<br>4. The label and border in the username field and password field are red |
| 0.1.5 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is registered username and the unregistered password | 1. User has opened swag labs browser | 1. User enters username & password<br>2. User clicks on login button | - Username: standard_user<br>- Password: secret | 1. Showing symbol red x in the username field and password field<br>2. Showing Error message "Username and password do not match any user in this service"<br>3. Stay on the login page<br>4. The label and border in the username field and password field are red |
| 0.1.6 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is unregistered username and the registered password | 1. User has opened swag labs browser | 1. User enters username & password<br>2. User clicks on login button | - Username: standard<br>- Password: secret_sauce | 1. Showing symbol red x in the username field and password field<br>2. Showing Error message "Username and password do not match any user in this service"<br>3. Stay on the login page<br>4. The label and border in the username field and password field are red |
| 0.1.7 | Login Functionality | Negative      | Check for is un-successful with invalid credentials. It is unregistered username and password | 1. User has opened swag labs browser | 1. User enters username & password<br>2. User clicks on login button | - Username: standard<br>- Password: secret | 1. Showing symbol red x in the username field and password field<br>2. Showing Error message "Username and password do not match any user in this service"<br>3. Stay on the login page<br>4. The label and border in the username field and password field are red |
| 0.2.1 | Logout Functionality | Positive    | Verify if logout is successful | 1. User has opened swag labs browser | 1. User clicks on hamburger icon at top left corner<br>2. User clicks on logout button | | 1. User should be able to log out successfully |

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

## :electric_plug: Installation
Berikut adalah langkah-langkah detail untuk menginstal dan menjalankan proyek ini berdasarkan sistem operasi yang Anda gunakan.

### Prasyarat
1. **Java Development Kit (JDK)**
   - Pastikan Anda memiliki JDK terinstal. Anda dapat mengunduhnya dari [situs resmi Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
   
2. **Maven**
   - Pastikan Anda memiliki Apache Maven terinstal. Anda dapat mengunduhnya dari [situs resmi Maven](https://maven.apache.org/download.cgi).
   
3. **Cucumber**
   - Jika Anda menggunakan Eclipse, Anda perlu menginstal plugin Cucumber.

### Panduan Instalasi Langkah-demi-Langkah

#### Untuk Windows:

1. **Clone Repository**
   - Buka Command Prompt dan navigasikan ke direktori tempat Anda ingin meng-clone repository.
   - Jalankan perintah berikut:
     ```sh
     git clone https://github.com/deasalmaisnaini/WebAutomationTesting.git
     ```

2. **Install Plugin Cucumber di Eclipse**
   - Buka Eclipse.
   - Pergi ke `Help` > `Eclipse Marketplace`.
   - Di kolom `Find`, ketik `Cucumber`.
   - Klik `Go`, dan dari hasil pencarian, klik `Install` di sebelah `Cucumber Eclipse Plugin`.
   - Ikuti petunjuk untuk menyelesaikan instalasi dan restart Eclipse jika diperlukan.

3. **Navigasikan ke Direktori Proyek**
   - Di Command Prompt, navigasikan ke direktori repository yang telah di-clone:
     ```sh
     cd WebAutomationTesting
     ```

4. **Jalankan Proyek**
   - Jalankan perintah berikut untuk menjalankan pengujian menggunakan Maven:
     ```sh
     mvn test
     ```

##  :wrench: Development

###  :file_folder: File Structure
Add a file structure here with the basic details about files, below is an example.

```
.
├── .settings
│   
├── src
│   └── test
│       ├── java
│       │   ├── actions
│       │   │   ├── LoginPageActions.java             # Kelas untuk tindakan halaman login
│       │   │   └── LogoutPageActions.java            # Kelas untuk tindakan halaman logout
│       │   ├── locators
│       │   │   ├── LoginPageLocators.java            # Kelas untuk locator halaman login
│       │   │   └── LogoutPageLocators.java           # Kelas untuk locator halaman logout
│       │   ├── runner
│       │   │   └── CucumberRunnerTest.java           # Kelas runner untuk menjalankan tes Cucumber
│       │   ├── stepdefinitions
│       │   │   ├── Hooks.java                        # Kelas hooks untuk setup dan teardown
│       │   │   ├── LoginSteps.java                   # Kelas definisi langkah untuk login
│       │   │   └── LogoutSteps.java                  # Kelas definisi langkah untuk logout
│       │   ├── utils
│       │   │   └── HelperClass.java                  # Kelas utilitas untuk mendukung tes
│       └── resources
│           ├── LoginPage.feature                     # Fitur Cucumber untuk pengujian login
│           └── LogoutPage.feature                    # Fitur Cucumber untuk pengujian logout
├── target
│   ├── classes
│   ├── HtmlReports                                   # Direktori untuk laporan HTML hasil pengujian
│   ├── JSonReports                                   # Direktori untuk laporan JSON hasil pengujian
│   ├── JUnitReports                                  # Direktori untuk laporan JUnit hasil pengujian
│   └── test-classes
├── .classpath
├── .project
├── pom.xml                                           # File konfigurasi Maven
└── README.md                                         # Dokumentasi proyek

```
### :file_folder: Menambahkan Test Script

1. **Buat File Cucumber**
   - Buat file fitur Cucumber pada direktori `src\test\resources`.
   - Contoh: `LoginPage.feature` dan `LogoutPage.feature`.

2. **Buat Class Locator**
   - Buat class locator dari elemen pada halaman yang akan diuji dan simpan di direktori `src\test\java\locators`.
   - Contoh:
     ```java
     package locators;

     import org.openqa.selenium.WebElement;
     import org.openqa.selenium.support.FindBy;
     import org.openqa.selenium.support.PageFactory;

     public class LoginPageLocators {
         @FindBy(id = "user-name")
         public WebElement usernameField;

     }
     ```

3. **Buat Class Actions**
   - Buat class actions yang menggunakan locator pada file locator yang telah dibuat sebelumnya dan simpan di direktori `src\test\java\actions`.
   - Pada file ini, jangan lupa untuk menginisiasi driver dengan menambahkan kode berikut:
     ```java
        nama_kelas_locators nama_variabel = null;

            public nama_kelas_actions() {
                this.nama_variabel = new nama_kelas_locators();
                PageFactory.initElements(HelperClass.getDriver(), nama_variabel);
            }
     ```

4. **Buat Step Definitions**
   - Buat step definitions berdasarkan file Gherkin yang telah dibuat dan simpan di direktori `src\test\java\stepdefinitions`.
   - Contoh:
     ```java
     package stepdefinitions;

     import actions.LoginPageActions;
     import io.cucumber.java.en.When;
     import io.cucumber.java.en.Then;

     public class LoginSteps {
         LoginPageActions loginPageActions = new LoginPageActions();

         @When("^user enters username \"([^\"]*)\"$")
         public void user_enters_username(String username) {
             loginPageActions.enterUsername(username);
         }

     }
     ```
   
Dengan mengikuti langkah-langkah di atas, script pengujian dapa ditambahkan
