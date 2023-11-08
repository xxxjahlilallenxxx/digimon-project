# <center> **Digimon Project README** </center>

## Table of Contents
- [Introduction](/introduction)
- [Features](/features)
- [Technologies Used](/technologies_used)
- [Setup](/setup)
    - [Prerequisites](/setup/prerequisites)
    - [Installation](/setup/installation)
- [Contributing](/contributing)
  
## <a href="/introduction"> Introduction </a>
<p style="text-align: justify">Welcome to the Digimon Project! This is a small web application that allows you to manage and explore information about Digimon creatures. The project is built using Spring Web, Spring JPA, Angular 13, and PostgreSQL 4, providing a modern and efficient platform to interact with Digimon data.</p>

## <a href="/features"> Features </a>
- View a list of Digimon creatures
- Add new Digimon entries

## <a href="/technologies_used"> Technologies Used </a>
- **Spring Web**: Provides the backend framework for building RESTful web services.
- **Spring JPA**: Offers support for database persistence and the Java Persistence API.
- **Angular 13**:  A powerful front-end framework for creating dynamic and interactive web applications.
- **PostgreSQL 4**: An open-source relational database management system.

## <a href="/setup"> Setup </a>
### <a href="/setup/prerequisites"> Prerequisites </a>
<p style="text-align: justify"> Before you can run the Digimon Project, you need to ensure that you have the following software installed on your system: </p>

- Java Development Kit (JDK)
- Node.js and npm
- Angular CLI
- PostgreSQL
- Gradle
- Your favorite IDE (e.g., IntelliJ IDEA, Visual Studio Code)

### <a href="/setup/installation"> Installation </a>
1. Clone the repository: 
    ```bash 
    git clone https://github.com/xxxjahlilallenxxx/digimon-project.git 
    ```
2. Navigate to the project directory:
   ```bash
   cd digimon-project 
   ```
3. Backend Setup:
   ```application.properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/digimon-project
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   ```
4. Frontend Setup:
   ```bash
   cd digimon-app
   npm install
   ```
5. Run the backend Spring Boot application:
   ```bash
   ./gradlew bootRun
   ```
6. Run the frontend Angular Project:
   ```bash
   cd digimon-app
   ng serve
   ```
7. Access the application in your web browser:
   http://localhost:4200/

## <a href="/contributing"> Contributing </a>
I welcome contributions to this project.