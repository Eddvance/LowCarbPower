# 🌱 LowCarbPower

**Part of the [LowCarb](https://github.com/Eddvance/LowCarb) application**

Green energy rate microservice that provides electricity pricing for renewable energy sources.

## 🎯 Role

This service exposes an API endpoint returning green energy rates (€/kWh) consumed by the main LowCarb service for cost calculations.

> ⚠️ Demo service — returns mocked data for demonstration purposes.

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3.x
- Spring WebFlux (Reactive)
- Eureka Client

## 🚀 Running

This service is part of the LowCarb microservices ecosystem. See the main [LowCarb repository](https://github.com/Eddvance/LowCarb) for full setup instructions with Docker Compose.

## 📡 API

```
GET /lowcarbpower/rate
→ Returns green energy rate
```

## 📝 License

MIT License - see [LICENSE](LICENSE) for details.

