##The package includes three services:<br/> 
**service-discovery** - service which is based on 
the eureka the main purpose is to register an application.<br/> 
**business-api** - The service provides the only one endpoint that 
returns the application version.<br/>
**api-gateway** - The gateway to business_api with the only one endpoint (_/business_)<br/>
## Build
In order to build and start the services the command should be used:<br/>
_mvn clean install && docker-compose up -d_ <br/>
Command for stopping the services is:<br/>
_docker-compose down_ <br/>
## Environment
All the necessary environment stored in the "__./.env__" file.
