## API HEADERS

### Create Order

url: http://localhost:9090/order/create

#### response:

```json
{
  "orderId": "7bbcbde7-ab9d-4781-b499-44387defe836",
  "orderName": "Order4",
  "orderDesc": "This is a description of the order 4",
  "squareFeet": 359343,
  "orderStatus": "DESIGN_PENDING",
  "isUrgent": false,
  "customerId": "83b292c6-a9e0-45e3-b0fe-4654ef7ed59d",
  "userId": "SYSTEM",
  "createdAt": "2024-02-10T02:20:07.947457",
  "lastModifiedAt": "2024-02-10T02:20:07.947472"
}
```

### Update Order Status
http://localhost:9090/order/updateStatus

#### request

```json
{
  "userId":"6d7ed38e-8fe8-4ef1-be9f-b4d2e741aab4",
  "orderId":"7bbcbde7-ab9d-4781-b499-44387defe836",
  "status":2 
}
```
#### response

```json
{
  "orderId": "7bbcbde7-ab9d-4781-b499-44387defe836",
  "orderName": "Order4",
  "orderDesc": "This is a description of the order 4",
  "squareFeet": 359343,
  "orderStatus": "PRINT_PENDING",
  "isUrgent": false,
  "customerId": "83b292c6-a9e0-45e3-b0fe-4654ef7ed59d",
  "userId": "6d7ed38e-8fe8-4ef1-be9f-b4d2e741aab4",
  "createdAt": "2024-02-10T02:20:07.947457",
  "lastModifiedAt": "2024-02-10T02:37:17.857496"
}
```