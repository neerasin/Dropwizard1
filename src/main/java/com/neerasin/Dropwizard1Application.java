package com.neerasin;

import com.neerasin.api.CalculatorService;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

public class Dropwizard1Application extends Application<Dropwizard1Configuration> {

    public static void main(final String[] args) throws Exception {
        new Dropwizard1Application().run(args);
    }

    @Override
    public String getName() {
        return "Dropwizard1";
    }

    @Override
    public void initialize(final Bootstrap<Dropwizard1Configuration> bootstrap) {
        bootstrap.addBundle(new SwaggerBundle<Dropwizard1Configuration>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(Dropwizard1Configuration configuration) {
                return configuration.swaggerBundleConfiguration;
            }
        });
    }

    @Override
    public void run(final Dropwizard1Configuration configuration,
                    final Environment environment) {
        // TODO: implement application

        CalculatorService calculatorService = new CalculatorService();
        environment.jersey().register(calculatorService);

    }

}
