

import io.javalin.Javalin;


public class App 
{

    /**
     * You could run this method to start the server, and then access it using the 'curl' command. For example, you can
     * type into a terminal the following command:
     *      curl localhost:9000/client-side-err
     * Before this endpoint will return any information to you request, you will need to write that logic in
     * JavalinSingleton.java
     *
     * There is no need to change anything in this class. It exists for you to be able to interact with a Javalin server
     * yourself.
     */
    public static void main( String[] args )
    {
        Javalin app = JavalinSingleton.getInstance();
        
        app.start(9000);
    }
}
