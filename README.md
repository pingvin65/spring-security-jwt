# spring-security-jwt
```
curl --location --request GET 'http://localhost:8080/'
```
return
```
home
```

```
$ curl --location --request POST 'http://localhost:8080/authenticate' \
 --header 'Content-Type: application/json' \
 --data-raw '{"username":"user","password":"password"}'
 ```
 return evry time difrent jwt
 ```
{"jwt":"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNTk2ODEwMjM3LCJpYXQiOjE1OTY3NzQyMzd9.D28wvSZ38nZtAgMBD4dNclLfwaQzBeCKC8zPN5ZCE_A"}
```

```
curl --location --request GET 'http://localhost:8080/hello' \
> --header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNTk2ODEwMjM3LCJpYXQiOjE1OTY3NzQyMzd9.D28wvSZ38nZtAgMBD4dNclLfwaQzBeCKC8zPN5ZCE_A'
```
return
```
Hello World!
```
or
```
curl --location --request GET 'http://localhost:8080/hello?name=Jon' \
> --header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNTk2ODEwMjM3LCJpYXQiOjE1OTY3NzQyMzd9.D28wvSZ38nZtAgMBD4dNclLfwaQzBeCKC8zPN5ZCE_A'
```
return
```
Hello Jon!
```
