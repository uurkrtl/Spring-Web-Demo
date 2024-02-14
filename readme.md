
## Coding: HelloWorld Controller

Create a new Spring Boot project in IntelliJ and implement a simple 'HelloWorld' controller. Use the concepts you have learned, such as annotations, HTTP methods, and path variables.

-   Step 1: Create a Spring Boot application using the Spring Initializr and add the spring-web-starter.
-   Step 2: Write a controller that handles a GET request to '/api/hello' and returns 'Hello, World!'.

Test your controller method with a REST client or Postman and document your results.

Please post the link to your GitHub repository here, where you created your HelloWorld application.  `inputfield`

## Coding: HelloSomeone Controller

-   Step 3: Use path variables to customize the name in the message. Example: '/api/hello/John' returns 'Hello, John!'.

Test your controller method with a REST client or Postman and document your results.

-   If you have already completed this task earlier, you may work on the bonus task on the next page.

## Bonus: Message Controller (POST)

Great, you have time for the bonus task! Work on these optional additional tasks to further deepen your knowledge.

-   Step 1: Create a new class 'Message' with the fields 'name', 'message', and 'id' of type String.
-   Step 2: The controller should now have a list of Message objects.
-   Step 3: Implement an additional controller method that handles a POST request to '/api/messages'. This method should accept an id, a name, and a message in the request body and store them in the list.

If you are done with this task, continue with the next bonus task on the next page.

## Bonus: Message Controller (GET)

-   Step 4: Implement an additional controller method that handles a GET request to '/api/messages'. This method should return the list of messages.

If you are done with this task, continue with the next bonus task on the next page.

## Bonus: Message Controller (DELETE)

-   Step 5: Implement an additional controller method that handles a DELETE request to '/api/messages/id'. This method should delete the message with the corresponding id from the list. (use a path variable)