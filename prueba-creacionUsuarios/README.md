#Evaluacion Java Creacion de usuarios.

Se realiza evaluacion de creacion de usuarios ocupando API RESTful Todos los endpoints deben aceptar y retornar solamente JSON, inclusive al para los mensajes de
error. se ocupo ademas maven para el proceso Build



se ocupo h2 como banco de memoria.
URL de la consola h2: http://localhost:8080/h2-ui/

se ocupo postman para realizar las pruebas.

POST: localhost:8080/usuario/create URL para crear un usuario

Json de entrada:
{
    "name": "fabian",
    "email": "fabian@bci.cl",
    "password": "Acm34054@@",
    "phones": [
        {
            "number": "456765",
            "cityCode": "1",
            "contryCode": "444"
        }
    ]
}
Segundo usuario.
{
    "name": "alejandro",
    "email": "alejandro@bci.cl",
    "password": "Acm34054@@",
    "phones": [
        {
            "number": "456765",
            "cityCode": "1",
            "contryCode": "444"
        }
    ]
}
Json de respuesta al momento de la creacion de este archivo:
{
    "active": false,
    "id": "3c0158bf-1fd5-431d-99c3-f3116eed5b47",
    "name": "fabian",
    "email": "fabian@bci.cl",
    "password": "Acm34054@@",
    "phone": [
    {
        "number": "456765",
        "cityCode": "1",
        "contryCode": "444"
    }
],
    "create": "19-07-2023 17:28:55",
    "modified": "19-07-2023 17:28:55",
    "last-Login": "19-07-2023 17:28:55",
    "token": "5ef5b541-8c75-43c7-9fea-48b4754d215c",
    "isActive": false
}

GET: localhost:8080/usuario/{email} URL para consultar al usuario

{
    "id": "e6e2d4b8-dc3e-4035-896c-b84ea71ed6db",
    "name": "alejandro",
    "email": "alejandro@bci.cl",
    "password": "Acm34054@@",
    "phones": [
    {
        "idPhone": 1,
        "number": "456765",
        "cityCode": "1",
        "contryCode": "444"
    }
],
    "create": "19-07-2023 17:28:45",
    "token": "db6541cb-99e8-4a8a-90f7-37cd839fdb58",
    "active": false,
    "modified": "19-07-2023 17:28:45",
    "lastLogin": "19-07-2023 17:28:45"
}