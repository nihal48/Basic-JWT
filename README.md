problem with JWT being STATELESS 
first login with nick-> use that json as bearer token and acess /hello endpoint
then login with jhon-> insted of using jhon json token use nick(previous) one and hit /hello 
problem🩹 still you can access with hello endpoint as jhon but using nick's token
