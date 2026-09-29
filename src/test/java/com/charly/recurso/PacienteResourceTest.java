package com.charly.recurso;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class PacienteResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/pacientes")
          .then()
             .statusCode(200)
             .body(is("Hello from RESTEasy Reactive"));
    }

}