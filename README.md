# Spring Data Cassandra REST API

This application uses Spring Data Cassandra and DataStax Astra to build a REST API for a backend service that interacts with products and orders.

## Getting Started Paths:
1. [Run the app on Gitpod](#running-on-gitpod)

### Running on Gitpod

1. Create a [DataStax Astra](https://astra.datastax.com/register?utm_source=github&utm_medium=referral&utm_campaign=spring-data-starter) account and free-tier Cassandra Database: 
![image](https://user-images.githubusercontent.com/3254549/90944037-75aa8180-e3d1-11ea-9b17-91929d55bc07.png)

   
2. Once your Astra database is created, click 'Your Databases', then 'Manage Organizations' on the top navigation: 
![image](https://user-images.githubusercontent.com/3254549/90944069-9f63a880-e3d1-11ea-834a-968ffe69e37b.png)
  
  
3. On the right side of your organization, click the elipsis (...) then 'Manage Organizations': 
![image](https://user-images.githubusercontent.com/3254549/90944096-c02bfe00-e3d1-11ea-9513-b3362cdfd77a.png)

4. Click the action menu, then select 'Add Service Account':
![image](https://user-images.githubusercontent.com/3254549/90944155-05503000-e3d2-11ea-9d2a-8c376b027358.png)

5. Click the copy icon to copy your Astra service account credentials to your clipboard:
![image](https://user-images.githubusercontent.com/3254549/90944221-3c264600-e3d2-11ea-9d04-46915f1c3731.png)

6. Once you have copied your credentials to your clipboard, click the 'Open in Gitpod' button below:

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/from-referrer)
   
7. Once your Gitpod workspace has loaded, paste your service account credentials in the Gitpod terminal at the bottom of the screen:
   ![Screen Shot 2020-08-20 at 9 28 42 AM](https://user-images.githubusercontent.com/69874632/90801910-5e816c00-e2cb-11ea-874b-fb64ee7a26ae.png)

8. After entering, open this link in your browser: http://localhost:8081/swagger-ui/

9. You're ready to use this application! 
   ![Swagger](doc/pics/spring-data-swagger-ui.png?raw=true)
