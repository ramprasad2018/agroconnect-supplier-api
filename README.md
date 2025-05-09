# 🚜 AgroConnect – Supplier Subsystem REST API

This is the **Supplier Subsystem** backend service of the **AgroConnect** platform, built using **Spring Boot**, **Redis OM**, **RabbitMQ**, and **PostgreSQL**. It manages all domain-specific operations and communicates with other subsystems via events and APIs.

---

## 📦 Tech Stack

- **Spring Boot 3.x**
- **Spring Data JPA + PostgreSQL**
- **Redis OM** (for search + caching)
- **RabbitMQ** (asynchronous messaging)
- **OpenAPI/Swagger**
- **Maven**

---

## 🗂️ Project Structure

```
supplier-api/
├── src/
│   ├── main/
│   │   ├── java/com/agroconnect/supplier/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── service/impl/
│   │   │   ├── repository/
│   │   │   ├── model/
│   │   │   ├── dto/
│   │   │   ├── mapper/
│   │   │   ├── config/
│   │   │   ├── messaging/
│   │   │   ├── cache/
│   │   │   ├── event/
│   │   │   ├── exception/
│   │   │   └── SupplierSubsystemApiApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── rabbitmq-config.json
│   └── test/java/com/agroconnect/supplier/
│       ├── integration/
│       ├── controller/
│       └── service/
└── pom.xml
```

---

## ⚙️ How to Run

### 📌 Prerequisites

- Java 17+
- Maven
- PostgreSQL
- Redis Stack
- RabbitMQ

### 🛠️ Commands

```bash
# Clone the repo
git clone https://github.com/your-org/agroconnect-supplier-api.git
cd agroconnect-supplier-api

# Build
mvn clean install

# Run
mvn spring-boot:run
```

---

## 🚀 Features

- Fully modular, scalable design
- Caching & search with Redis OM
- Event-based messaging with RabbitMQ
- API documentation with Swagger UI

---

## 🔗 API Documentation

Visit:
```
http://localhost:8080/swagger-ui/index.html
```

---

## 🤝 Contributing

1. Fork and clone this repo
2. Create a new feature branch
3. Submit a PR

---

## 📜 License

MIT License – © 2025 AgroConnect Dev Team