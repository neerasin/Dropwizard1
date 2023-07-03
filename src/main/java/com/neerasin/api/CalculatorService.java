package com.neerasin.api;

import com.codahale.metrics.annotation.Timed;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.models.annotations.OpenAPI30;
import io.swagger.v3.oas.models.annotations.OpenAPI31;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@OpenAPIDefinition(
        tags = {@Tag(name = "AirlinesRatingApp")})
@Path("/CalculatorService")
@Produces(MediaType.APPLICATION_JSON)
public class CalculatorService {

    @GET
    @Timed
    @Path("add")
    public Integer add(@NotNull @QueryParam("first") int first, @NotNull @QueryParam("second") int second) {
        return first+second;
    }
}
