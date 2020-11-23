##The package includes three services:

**service-discovery** - service which is based on 
the eureka the main purpose is to register an application.<br/> 
**business-api** - The service provides the only one endpoint that 
returns the application version.<br/>
**api-gateway** - The gateway to business_api with the only one endpoint (_/business_)<br/>
## Building

### Production
In order to build the services the command should be used:<br/>
_mvn clean install && docker-compose build_ <br/>
The default environment will be used which is for production and stored in _.env_ file.

### Test
For test server this command should be used
_mvn clean install && docker-compose --env-file .env-int build_ <br/>
The command builds the containers using testing environment which is stored in _.env-int_ file.

## Starting the app
To start the app use this command 
_docker-compose up -d_
The command can be launched with additional argument with environment path:
_docker-compose --file-env .env-int up -d_ <br/>
## Environment
All the necessary environment stored in the "__./.env__" file.
