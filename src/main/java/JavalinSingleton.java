

import io.javalin.Javalin;

public class JavalinSingleton {
    /**
     * Assignment: return the status code for a generic "client side error" in the http response
     *
     * You will not need to run app.start in this method. The test cases, or main method, will do this for you - this
     * method only needs to return a properly configured Javalin Server, represented by the 'app' object created below.
     *
     * Please refer to the "StatusCodes.MD" file.
     */
    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        // Javalin Endpoint Handler - here to GET some data to client from endpoint '/client-side-err' at PORT app.start(9000) specified in App.java
        app.get("/client-side-err", ctx -> {
            
            //write logic here
            // Note: 2nd parameter of app.get() is a lambda expression taking in (parameter list: 'ctx') -> expression (below)
            // call upon .status() response method from Javalin's Context obj -- here to set status code to generic client-side (FE) error (400-499)
            ctx.status(400);
            
        });

        return app;
    }
    
}
