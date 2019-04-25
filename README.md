# spring-boot-crud-mysql-pool
simple example with spring boot curd with mysql + connection pooling

Run from command line

mvn spring-boot:run


Passing environment 

mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=uat"



POST : http://localhost:8080/user
Content-Type: application/json

{
    "name": "some name",
    "email": "some@email.com"
}


GET: http://localhost:8080/users


GET: http://localhost:8080/user/1

PUT: http://localhost:8080/user/1
{
    "name": "some name",
    "email": "some@email.com"
}


DELETE: http://localhost:8080/user/1

