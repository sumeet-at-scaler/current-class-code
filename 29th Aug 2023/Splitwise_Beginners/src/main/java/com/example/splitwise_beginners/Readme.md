# Steps for making backend Restful (handle HTTP requests)
1. Add maven dependency for springboot web
   1.1 Search 
   1.2 Add to pom
   1.3 Update maven
2. Decorate your controller with @RestController
3. HTTP Methods supported by methods of controller
   3.1 RestMapping = HTTP Get (sends data in url) => Clients use this for passing "small" info (url has size limits) and used for getting data from user
   3.2 PostMapping = HTTP Post (sends data in body of HTTP Request) => Clients use this for insertion and updates on the server
4. Change parameter type of methods in controller to receive data sent with HTTP (RequestBody, RequestParam)