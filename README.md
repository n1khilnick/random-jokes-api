# Random Jokes 

## Built With
* `Java 17`
* `Maven 4.0.0`
* `Spring Boot 3.0.5`
* `IntelliJ IDEA 2023.1 (Community Edition)`


## Data Flow

### 2. Controller:
* It consists of  **JokeController** ,**PatientController** and **AppointmentController** classes in which used the annotations like **@RestController** to annotate the class as Controller.
* Used annotation **_@GetMapping_** , **_@PostMapping_** , **_@PutMapping_** , **_@DeleteMapping_** to map the HTTP web requests to the specific handler methods.

<br>

### API Reference:
<br>

>Joke API References
<br>

* Add Jokes:
```*.sh-session
  http://localhost:8080/jokes
```

* Get Joke:
```*.sh-session
 http://localhost:8080/joke
```


### 2. Service:
* It consists of **JokeService** class in which provide some business functionalities of every handler methods.
* Used _**@Service**_ annotation to indicate that a class belongs to the service layer.


### 3. Repository:
* It consists of **DoctorDao** that contains CRUD operations on a repository for a specific type. Usually represent the database access layer in an application.
* Used **Iterable** type of List' to manage the data of entity classes by performing CRUD operations.
* Used _**@Repository**_ annotation is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.

## Data Structure
* Used `Iterable<List>`  to store the Jokes.

## Summary
 In this project we create a api that store, get the random jokes by performing CRUD operations.