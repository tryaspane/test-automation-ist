- Install Maven
    - Download Maven  https://maven.apache.org/download.cgi
    - Installation Guide https://maven.apache.org/install.html
    - CMD on the project directory and check Maven version
        
        ```jsx
        mvn -version
        ```
        
- Install Java https://www.oracle.com/java/technologies/downloads
    - Set the environment
- Create Project : java - maven
- Install selenium https://cucumber.io/docs/installation/java/ by update pom.xml (see latest [here](https://www.selenium.dev/downloads/))
    
    ```jsx
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.18.0</version>
        <scope>test</scope>
    </dependency>
    ```
    
- Update  pom.xml dependencies from maven https://mvnrepository.com/
    
    ```jsx
        <dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.21.0</version>
        </dependency>
        </dependencies>
    ```
    
-
