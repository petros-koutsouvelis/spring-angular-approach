# spring-angular-table

Note: That this project does not focus on the UI.

Getting Started
Prerequisites:

    Java 17
    Maven
    Angular
    MariaDB
    
1. Clone the repository:
   https://github.com/petros-koutsouvelis/spring-angular-table

2. You must insert the nation.sql file into your database. Afterwards navigate to your MariaDB database with the command prompt and initiate it. 
3. Navigate to the Angular Folder called "frontend" inside the project file
   
4. Install the dependencies with "npm install"
5. While still inside the frontend projectfile start the frontend server with ng s

6. Inside the code of the backend file, there is an application.properties file.
   You will need to change the username and password to the ones corresponding to your localhost database otherwise the project will fail
7.Once the changes have been applied you can launch the backend file which should have successfully established a connection with the frontend

Goals of this project
  1. Create a connection between DB and Spring Application
  2. Use this connection and define the right architecture of your spring project. By doing that,
  results from these queries needs to be served in a RESTful way.
  3. Consume the results coming from the endpoints and visualize them in the Angular App.
