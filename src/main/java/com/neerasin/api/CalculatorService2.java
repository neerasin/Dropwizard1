package com.neerasin.api;

import com.codahale.metrics.annotation.Timed;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@OpenAPIDefinition(
        tags = {@Tag(name = "AirlinesRatingApp2")})
@Path("/CalculatorService2")
@Produces(MediaType.APPLICATION_JSON)
public class CalculatorService2 {

    @GET
    @Timed
    @Path("add")
    public Integer add(@NotNull @QueryParam("first") int first, @NotNull @QueryParam("second") int second) {
        return first+second;
    }
}
