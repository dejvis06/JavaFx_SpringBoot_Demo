# Integration of JavaFx and Spring boot

## Main class:
JavaFX also has its main application class, which is used as an entry point for starting JavaFX applications. Instead of running the Spring app directly, 
we'll use it to run our JavaFX app. And the JavaFX Application will be responsible for properly starting the Spring application context and integrating everything together 
using JavaFX Weaver.

## javafx.application.Application:

Life-cycle

The entry point for JavaFX applications is the Application class. The JavaFX runtime does the following, in order, whenever an application is launched:

- Constructs an instance of the specified Application class
- Calls the init() method
- Calls the start(javafx.stage.Stage) method
- Waits for the application to finish, which happens when either of the following occur:
the application calls Platform.exit()
the last window has been closed and the implicitExit attribute on Platform is true
- Calls the stop() method

Note that the start method is abstract and must be overridden. The init and stop methods have concrete implementations that do nothing.
