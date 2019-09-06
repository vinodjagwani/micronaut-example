package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/") // <1>
public class HelloController {

    @Get("/micronaut")
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        return "This is micronaut app";
    }
}
