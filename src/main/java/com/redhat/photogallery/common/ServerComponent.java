package com.redhat.photogallery.common;

import io.vertx.reactivex.core.eventbus.EventBus;
import io.vertx.reactivex.ext.web.Router;

public interface ServerComponent {

	void registerRoutes(Router router);

	void injectEventBus(EventBus eventBus);
}
