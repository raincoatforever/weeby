package org.weeby.Routes;

import com.jetdrone.vertx.yoke.Middleware;
import com.jetdrone.vertx.yoke.middleware.YokeRequest;
import com.jetdrone.vertx.yoke.middleware.YokeResponse;
import org.vertx.java.core.Handler;
import org.vertx.java.core.json.JsonObject;

/**
 *
 */
public class VersionRoute extends Middleware {


    public VersionRoute() {

    }

    @Override
    public void handle(YokeRequest yokeRequest, Handler<Object> objectHandler) {
        YokeResponse response = yokeRequest.response();
        response.setStatusCode( 200 );
        response.end( new JsonObject(  ).putString( "version","0.0.1" ) );
    }
}
