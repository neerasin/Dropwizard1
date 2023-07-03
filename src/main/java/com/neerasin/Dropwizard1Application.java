package com.neerasin;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

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
        // TODO: application initialization
    }

    @Override
    public void run(final Dropwizard1Configuration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
