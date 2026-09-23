# Service Discovery and API Gateway

Spring Boot microservices example containing:
- Eureka Server: port 9000
- API Gateway: port 8080
- User Service: port 8083
- Room Service: port 8082
- Booking Service: port 8081

Features:
1. Services register with Eureka.
2. API Gateway discovers services through Eureka.
3. Gateway routes requests using service names.
4. Basic JWT-style Bearer authentication is implemented at the Gateway.
5. /actuator/health is public.

## Run order
1. Start Eureka Server.
2. Start User Service, Room Service and Booking Service.
3. Start API Gateway.
4. Open http://localhost:9000

## Example routes
GET http://localhost:8080/users/...
GET http://localhost:8080/rooms/...
GET http://localhost:8080/bookings/...

For protected routes, send:
Authorization: Bearer demo-token
