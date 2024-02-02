package com.pryority.springflux;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.pryority.springflux.Greeting.GreetingModel;

@ExtendWith(SpringExtension.class)
// We create a `@SpringBootTest`, starting an actual server on a `RANDOM_PORT`
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingRouterTest {

    // Spring Boot will create a `WebTestClient` for you,
    // already configured and ready to issue requyests againt
    // "localhost:RANDOM_PORT"
    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void testHello() {
        webTestClient
                // Create a GET requets to test an endpoint
                .get().uri("/hello").accept(MediaType.APPLICATION_JSON).exchange()
                // and use the dedicated DSL to test assertions against the response
                .expectStatus().isOk().expectBody(GreetingModel.class).value(greeting -> {
                    Assertions.assertEquals(greeting.getMessage(), "Hello, Spring!");
                });
    }

}
