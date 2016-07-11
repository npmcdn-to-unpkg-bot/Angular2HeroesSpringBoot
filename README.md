"# Angular2SpringBoot" 

Host Angular 2 Heroes tutorial app in Spring Boot
https://angular.io/docs/ts/latest/tutorial/

Installation:
1. Install JDK 1.8
---
2. Install Maven
---
3. Install Node Version Manager(NVM) from https://github.com/creationix/nvm
---
4. Install NodeJS using nvm: ```nvm install v5.12.0```
from ```src/main/resources/static``` run ```npm install --save-dev http-proxy-middleware connect-history-api-fallback```
---
5. Run Spring boot server: ```mvn spring-boot:run```. Server will be hosted at 8080.
---
6. To test client side changes immediately as you make js/ts changes during development. ```npm start``` from ```src/main/resources/static```. Server will be hosted at 3000. ```/api``` requests will be routed to 8080 by lite-server at 3000.
---
7. Try ```http://localhost:3000/``` and ```http://localhost:3000/api/hello```
---
8.
---
