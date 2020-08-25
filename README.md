# Spring Data Cassandra REST API

This application uses Spring Data Cassandra and DataStax Astra to build a REST API for a backend service that interacts with products and orders.

## Getting Started Paths:
1. [Run the app on Gitpod](#running-on-gitpod)
2. [Run the app on Astra for GCP](#running-on-gcp)

### Running on Gitpod

1. Create a free-forever Cassandra Database with DataStax Astra: [click here to get started](https://astra.datastax.com/register?utm_source=github&utm_medium=referral&utm_campaign=spring-data-starter) 🚀
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

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://dtsx.io/2QjoULs)
   
7. Once your Gitpod workspace has loaded, you'll be asked to paste your service account credentials in the Gitpod terminal at the bottom of the screen:
![image](https://user-images.githubusercontent.com/3254549/90944321-e900c300-e3d2-11ea-9624-dae5f81b6a0a.png)

8. When the app is finished building, click the 'Open Browser' button on the bottom right of the screen:
![image](https://user-images.githubusercontent.com/3254549/90944371-249b8d00-e3d3-11ea-8305-b7d4fad9742c.png)

9. You've successfully build a Spring Data Cassandra application!
![image](https://user-images.githubusercontent.com/3254549/90944387-439a1f00-e3d3-11ea-9df4-e8a5580c62cd.png)

### Running on GCP

1. Navigate to the [Astra for GCP landing page](https://console.cloud.google.com/marketplace/product/endpoints/prod.cloud.datastax.com):
![image](https://user-images.githubusercontent.com/3254549/91092366-c1953a80-e60c-11ea-9228-e7fcf204303f.png)

2. If you haven't done so already, create a GCP [billing account here](https://console.cloud.google.com/billing/linkedaccount). Once you've created a billing account, click 'Purchase':
![image](https://user-images.githubusercontent.com/3254549/91092716-4a13db00-e60d-11ea-8f7c-b82eef3120ce.png)

3. Scroll down the page, and select the free plan:
![image](https://user-images.githubusercontent.com/3254549/91092831-73346b80-e60d-11ea-9abd-e2840312582d.png)

4. Then accept the terms and click 'Subscribe':
![image](https://user-images.githubusercontent.com/3254549/91092903-8810ff00-e60d-11ea-877d-bc11388759e1.png)

5. Navigate back to the [product details page](https://console.cloud.google.com/marketplace/product/endpoints/prod.cloud.datastax.com), then click 'Enable':
![image](https://user-images.githubusercontent.com/3254549/91223854-194ba880-e6d6-11ea-8cf9-3529fc79cbdc.png)

6. Review the terms, then click 'Agree':
![image](https://user-images.githubusercontent.com/3254549/91223956-3b452b00-e6d6-11ea-8206-0a2142df9839.png)

7. Create your first Astra database by clicking 'Create Database':
![image](https://user-images.githubusercontent.com/3254549/91224034-54e67280-e6d6-11ea-961f-73b929717817.png)

8. Set your database name, keyspace name, region, username and password, then click 'Create':
![image](https://user-images.githubusercontent.com/3254549/91224114-77788b80-e6d6-11ea-99f2-c9249a319d6f.png)

9. Once your database has finished initializing, click 'Launch DataStax Console':
![image](https://user-images.githubusercontent.com/3254549/91226614-21a5e280-e6da-11ea-8bfd-bff2d2812bf5.png)

10. Congrats! You've created an Astra database, launch the app using the instruction for [Getting Started path #1](#running-on-gitpod).
