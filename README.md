# Spring Data Cassandra REST API

This application uses Spring Data Cassandra and DataStax Astra to build a REST API for a backend service that interacts with products and orders.

## Steps 

Running in Gitpod

1. Create a [DataStax Astra](https://astra.datastax.com/) account and free-tier Cassandra Database: 
   ![88737275-c938f080-d0ed-11ea-8273-f547da8ef9e6](https://user-images.githubusercontent.com/69874632/90799424-0f860780-e2c8-11ea-962e-ad43ebafc085.png)
   
2. Once your database is created, click on manage organizations at the top: 
   ![Screen Shot 2020-08-20 at 9 24 13 AM](https://user-images.githubusercontent.com/69874632/90799837-a5ba2d80-e2c8-11ea-8104-35ef6c0723ef.png)
  
3. Go to actions, then click manage organizations on the side: 
   ![Screen Shot 2020-08-20 at 9 25 03 AM](https://user-images.githubusercontent.com/69874632/90799981-da2de980-e2c8-11ea-98ff-0089fe467d4d.png)
   
4. Go to the top and click add service account: 
   ![Screen Shot 2020-08-20 at 9 25 29 AM](https://user-images.githubusercontent.com/69874632/90800086-02b5e380-e2c9-11ea-9f60-d6df6ba78fe1.png)

5. Then click the logo to copy your credentials. 
   ![Screen Shot 2020-08-20 at 9 25 50 AM](https://user-images.githubusercontent.com/69874632/90800145-1b25fe00-e2c9-11ea-9ae1-534e5a085008.png)

6. Once you have copied your credentials, click to Open in Gitpod:

   [![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/DataStax-Examples/spring-data-starter)
   
7. Once your Gitpod workspace has loaded, paste your service account credentials at the bottom of the screen
   ![Screen Shot 2020-08-20 at 9 28 42 AM](https://user-images.githubusercontent.com/69874632/90800275-51637d80-e2c9-11ea-89b8-858e7c4d80b9.png)
   
8. After entering, open this link in your browser: http://localhost:8081/swagger-ui/

9. You're ready to use this application! 
   ![Swagger](https://github.com/DataStax-Examples/spring-data-starter/blob/master/doc/pics/spring-data-swagger-ui.png?raw=true)
