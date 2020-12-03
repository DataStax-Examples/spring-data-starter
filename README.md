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

![Astra](https://github.com/datastaxdevs/shared-assets/blob/master/astra/dashboard-add-database.png?raw=true)

- Pick **free plan** and a **region** close to you, click configure.

![Astra](https://github.com/datastaxdevs/shared-assets/blob/master/astra/choose-a-plan-1000-annotated.png?raw=true)

- Define a **database name**, **keyspace name** and **credentials**

![Astra](https://github.com/datastaxdevs/shared-assets/blob/master/astra/create-and-configure-annotated-1000.png?raw=true)

- Database will be ready when the status will change from *`Pending`* to **`Active`** 💥💥💥 

![my-pic](https://github.com/datastaxdevs/shared-assets/blob/master/astra/dashboard-withdb-1000.png?raw=true)
.

### ✅ B - Copy your credentials

- Locate the combo `Organization: <Your email>` on the top navigation. On the right side of your organization, click the elipsis (...) then click your `<Your email>`.

![my-pic](https://github.com/datastaxdevs/shared-assets/blob/master/astra/organization-combo-annotated.png?raw=true)

- Scroll down to the bottom of the page and locate `Service Account` in `Security Settings`

![my-pic](https://github.com/datastaxdevs/shared-assets/blob/master/astra/organization-home-annotated.png?raw=true)

- In the Security Setting tables, select `Copy Credentials` as shown below

![my-pic](https://github.com/datastaxdevs/shared-assets/blob/master/astra/organization-copycredentials-annotated.png?raw=true)

### ✅ C - Running on Gitpod

- Your credentials in the clipboard, click  `Open in Gitpod` button below:

[![Open in IDE](https://gitpod.io/button/open-in-gitpod.svg)](https://dtsx.io/2QjoULs)

- Once your Gitpod workspace has loaded, you'll be asked to paste your service account credentials in the Gitpod terminal at the bottom of the screen:

![image](https://user-images.githubusercontent.com/3254549/90944321-e900c300-e3d2-11ea-9624-dae5f81b6a0a.png)

- When the app is finished building, click the 'Open Browser' button on the bottom right of the screen:
![image](https://user-images.githubusercontent.com/3254549/90944371-249b8d00-e3d3-11ea-8305-b7d4fad9742c.png)

- You've successfully build a Spring Data Cassandra application!
![image](https://user-images.githubusercontent.com/3254549/90944387-439a1f00-e3d3-11ea-9df4-e8a5580c62cd.png)
