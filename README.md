# Springflux

RESTful web service with Spring WebFlux

## Workflow of RESTful API Development

### 1. Create a WebFlux Handler

- **Step 1**: Create a "Plain Old Java Object" (POJO), for example for a *Greeting*. Let's create the Greeting model inside of `/model/Greeting`.

```bash
./src/main/java/com/pryority/springflux
├── SpringfluxApplication.java
└── model
    └── Greeting
        └── Greeting.java
```

- **Step 2**: Next, we will add a handler for the new Greeting model that will handle an incoming request and create a response, in this case a greeting such as `"Hello, Spring!"`.

```bash
./src/main/java/com/pryority/springflux
├── SpringfluxApplication.java
└── model
    └── Greeting
        ├── Greeting.java
        └── GreetingHandler.java
```

2. Create a Router

