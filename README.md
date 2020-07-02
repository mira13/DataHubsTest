# DataHubsTest

## Deployment

### requirements 

You need to have following applications available via command line:

>maven

>java 11

>npm 

### to run application 

clone it from the current repository

`git clone https://github.com/mira13/DataHubsTest.git`

Go to the backend folder 

`cd rest-api/`

Run test

`mvn clean test`

Then run application

`mvn spring-boot:run`

Then go to the fronend folder (in separate terminal tab or window)

`cd fronend/`

if you don't have Angular cli, install it with

`npm install -g @angular/cli`

Finally run frontend with

`ng serve --open`

It will run application and open it in browser
