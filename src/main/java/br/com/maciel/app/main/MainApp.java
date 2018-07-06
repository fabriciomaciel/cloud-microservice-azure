package br.com.maciel.app.main;

import static spark.Spark.get;

import spark.servlet.SparkApplication;

/**
 * The Class MainApp.
 */
public class MainApp implements SparkApplication {

    /*
     * (non-Javadoc)
     * 
     * @see spark.servlet.SparkApplication#init()
     */
    public void init() {

        get("/api/", (req, res) -> "Rest API return String");
        //
        System.out.println("Server is online on:\r\nhttp://localhost:8080/cloud-microservice-azure/api/");// 8080 = Default tomcat port
    }
}
