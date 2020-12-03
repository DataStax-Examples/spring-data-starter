<!--- STARTEXCLUDE --->

# Spring Data Cassandra REST API
*10 minutes, Beginner*

This application uses Spring Data Cassandra and DataStax Astra to build a REST API for a backend service that interacts with products and orders.

<!--- ENDEXCLUDE --->

![image](https://monosnap.com/image/PQXQsYcisYTHwSzkOTBwkRQoD3HkGn)

## Start the application (no installation required)

### ✅ A - Get your Astra Instance

<!--- STARTEXCLUDE --->
- Create a free-forever Cassandra Database with DataStax Astra: [click here to get started](https://astra.datastax.com/register?utm_source=devplay&utm_medium=github&utm_campaign=spring-data-starter) 🚀

![Astra](https://github.com/datastaxdevs/shared-assets/blob/master/astra/login-1000.png?raw=true)
<!--- ENDEXCLUDE --->

- On the home page. Locate the button **`Add Database`**

![Astra](https://user-images.githubusercontent.com/69874632/101092439-86d96180-356e-11eb-9a93-1e275ff5cd62.png)

- Pick **free plan** and a **region** close to you, click configure.

<img width="1399" alt="Screen Shot 2020-12-03 at 2 13 02 PM" src="https://user-images.githubusercontent.com/69874632/101094736-b50c7080-3571-11eb-9b08-725c2b81ead0.png">

- Define a **database name**, **keyspace name** and **credentials**

<img width="1435" alt="Screen Shot 2020-12-03 at 1 33 16 PM" src="https://user-images.githubusercontent.com/69874632/101093499-b5a40780-356f-11eb-938e-4ba11fa7e1d3.png">

- Database will be ready when the status will change from *`Pending`* to **`Active`** 💥💥💥 

<img width="1438" alt="Screen Shot 2020-12-03 at 1 35 43 PM" src="https://user-images.githubusercontent.com/69874632/101093580-dc623e00-356f-11eb-8035-9d1835e49deb.png">
.

### ✅ B - Copy your credentials

- Locate the combo `Organization: <Your email>` on the top navigation. In the drop down menu, click your current organization.

![Group 4](https://user-images.githubusercontent.com/69874632/101093685-09165580-3570-11eb-9e8d-1579d7692ebd.png)

- Scroll down to the bottom of the page and locate `Service Account` in `Security Settings` and select `Copy Credentials` as shown below. 

<img width="1439" alt="Screen Shot 2020-12-03 at 1 44 56 PM" src="https://user-images.githubusercontent.com/69874632/101093823-47137980-3570-11eb-9da7-04643adba7d3.png">


### ✅ C - Running on Gitpod

- With your credentials in the clipboard, click  `Open in Gitpod` button below:

[![Open in IDE](https://gitpod.io/button/open-in-gitpod.svg)](https://dtsx.io/2QjoULs)

- Once your Gitpod workspace has loaded, you'll be asked to paste your service account credentials in the Gitpod terminal at the bottom of the screen:

![image](https://user-images.githubusercontent.com/3254549/90944321-e900c300-e3d2-11ea-9624-dae5f81b6a0a.png)

- When the app is finished building, click the 'Open Browser' button on the bottom right of the screen:
![image](https://user-images.githubusercontent.com/3254549/90944371-249b8d00-e3d3-11ea-8305-b7d4fad9742c.png)

- You've successfully build a Spring Data Cassandra application!
![image](https://user-images.githubusercontent.com/3254549/90944387-439a1f00-e3d3-11ea-9df4-e8a5580c62cd.png)


