# cloud-microservice-azure
A simple Rest Endpoint made with Java Spark focusing on deploy to Azure Cloud   
   
This is a simple Rest Endpoint made in Java with Spark microservice framework, i have used the following steps to deploy the project as a WAR file instead of the default JAR:    
http://sparkjava.com/documentation#other-web-server   

The server used in my development test is apache-tomcat-8.5.32 and the following step has been made in Azure to deploy:   

Login into Azure Portal.   
Create a New Service -> Web App.   
Name your app and create it.   
Once the app was created:
    App Configurations -> Add Java and Select Newsest Tomcat 8.5 as Java Web Container.
    Deploy Options -> Configure to connect to GitHub   
    ... to be continued (im still learnin to deploy =) )
