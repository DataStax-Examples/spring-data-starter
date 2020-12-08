<!--- Enter the repository name --->
# Running Spring Data Cassandra REST API
Follow the instructions below to get started.

<!--- 
Modify this section as needed, however always include the Astra setup parts
--->
## Prerequisites
Let's do some initial setup.

### DataStax Astra
<!--- enter a unique UTM_CODE for your sample app below --->
1. Create a [DataStax Astra account](https://astra.datastax.com/register?utm_source=github&utm_medium=referral&utm_campaign=spring-data-starter) if you don't 
already have one:
![image](https://astra-screenshots.s3.amazonaws.com/current/register-basic-auth.png)

2. Create an (always) free-tier Cassandra database (take note of your db password):
![image](https://user-images.githubusercontent.com/69874632/101203026-ef801700-361e-11eb-8321-de2d65259763.png)
![image](https://user-images.githubusercontent.com/69874632/101203076-0292e700-361f-11eb-88ee-1f6356f4d7dc.png)
![image](https://user-images.githubusercontent.com/69874632/101203115-12aac680-361f-11eb-9087-8ff5cb9516d7.png)

3. After your database is provisioned, head to the `Connect` screen and copy your connection 
information (we'll need this later!):
![image](https://user-images.githubusercontent.com/69874632/101202697-797bb000-361e-11eb-8ded-6e9b1d94fcac.png)

### Github
<!-- Enter your GITHUB_URL below -->
1. Click `Use this template` at the top of the [GitHub Repository](https://github.com/DataStax-Examples/spring-data-starter):
![image](https://raw.githubusercontent.com/DataStax-Examples/sample-app-template/master/screenshots/github-use-template.png)

2. Enter a repository name and click 'Create repository from template':
![image](https://raw.githubusercontent.com/DataStax-Examples/sample-app-template/master/screenshots/github-create-repository.png)

3. Clone the repository:
![image](https://raw.githubusercontent.com/DataStax-Examples/sample-app-template/master/screenshots/github-clone.png)

<!--- 
Include locally as a minimum so that folks will
create an Astra DB and use your repository as a template.

Remove paths that you don't need.
--->
## 🚀 Getting Started Paths:
*Make sure you've completed the [prerequisites](#prerequisites) before starting this step*
  - [Running on Gitpod](#running-on-gitpod)

<!--- 
Include Gitpod where possible, it provides a good DX for experimentation 
--->
### Running on Gitpod
<!-- Enter your GITPOD_LINK below -->
1. Click the 'Open in Gitpod' link:
[![Open in IDE](https://gitpod.io/button/open-in-gitpod.svg)](https://dtsx.io/2QjoULs)

2. Once your Gitpod workspace has loaded, you'll be asked to paste your service account credentials in the Gitpod terminal at the bottom of the screen:
![image](https://user-images.githubusercontent.com/3254549/90944321-e900c300-e3d2-11ea-9624-dae5f81b6a0a.png)

3. When the app is finished building, click the 'Open Browser' button on the bottom right of the screen:
![image](https://user-images.githubusercontent.com/3254549/90944371-249b8d00-e3d3-11ea-8305-b7d4fad9742c.png)

4. You've successfully build a Spring Data Cassandra application!
![image](https://user-images.githubusercontent.com/3254549/90944387-439a1f00-e3d3-11ea-9df4-e8a5580c62cd.png)
