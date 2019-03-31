package com.redhat.photogallery.common;

import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.reactivex.core.AbstractVerticle;
import io.vertx.reactivex.core.eventbus.EventBus;
import io.vertx.reactivex.core.http.HttpServer;
import io.vertx.reactivex.ext.web.Router;

public class Server extends AbstractVerticle {

    private static final Logger LOG = LoggerFactory.getLogger(Server.class);
    private final int listenPort;
    private final ServerComponent[] components;

    public Server(int listenPort, ServerComponent... components) {
        this.listenPort = listenPort;
        this.components = components;
    }

    @Override
    public void start() {
        Router router = Router.router(vertx);
        EventBus eventBus = vertx.eventBus();

        // let components register their HTTP routes and connect to the event bus
        for (ServerComponent component : components) {
            component.registerRoutes(router);
            component.injectEventBus(eventBus);
        }

        // start the HTTP server
        vertx.createHttpServer().requestHandler(router).rxListen(listenPort).subscribe(this::listenSuccess,
                this::listenError);
    }

    private void listenSuccess(HttpServer httpServer) {
        LOG.info("Server is listening on port {}", httpServer.actualPort());
    }

    private void listenError(Throwable t) {
        LOG.error("Server failed to listen on port {}", listenPort, t);
        vertx.close();
    }

}