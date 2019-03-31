package com.redhat.photogallery.common;

import io.reactivex.functions.Consumer;
import io.vertx.core.VertxOptions;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.core.logging.SLF4JLogDelegateFactory;
import io.vertx.reactivex.core.Vertx;

public class VertxInit {

    private VertxInit() {};

    static {
        System.setProperty("vertx.logger-delegate-factory-class-name", SLF4JLogDelegateFactory.class.getName());
    }

    private static final Logger LOG = LoggerFactory.getLogger(VertxInit.class);

    public static void createClusteredVertx(Consumer<Vertx> onSuccess) {
        Vertx.rxClusteredVertx(new VertxOptions()).subscribe(onSuccess, VertxInit::vertxError);
    }

    private static void vertxError(Throwable t) {
        LOG.error("Failed to initialize Vert.x", t);
    }
}