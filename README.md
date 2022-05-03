# product-service-using-cqrs
product-service-using-cqrs is a event driven microservice with CQRS design pattern

### To Run this microservice need to follow below steps

* Go to Axon Developer site [link](https://developer.axoniq.io/download)
* Download the Axon Server Jar and run the ```axonserver.jar``` with below command  
```java 
 java -jar axonserver.jar
```
    The default port for Axon server is ***8024***
 
 * Now you are good to go you can run the spring application

### API's exposed

* http://localhost/api/v1/products - POST 
  * Body

  ```json
  {
    "name": "{product_name}",
    "price": "{product_price}",
    "quantity": "{product_quantity}"
  }
  ```
  * Response
  
  ```
   0ff3f9e4-48ff-4c10-a30a-b07754c85f05
  ```
  
 * http://localhost/api/v1/products - GET
   * Response
  ```json
  [
    {
        "name": "{product_name}",
        "price": "{product_price}",
        "quantity": "{product_quantity}"
    },
    {
      "name": "{product_name}",
      "price": "{product_price}",
      "quantity": "{product_quantity}"
    }
]
  ```
   

