/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package me.sabareesh.udacity.jokebackend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import me.sabareesh.udacity.javajokelibrary.JokeShop;

@Api(
    name = "jokeApi",
    version = "v1",
    namespace = @ApiNamespace(
    ownerDomain = "jokebackend.udacity.sabareesh.me",
    ownerName = "jokebackend.udacity.sabareesh.me",
    packagePath=""
  )
)
public class MyEndpoint {
    @ApiMethod(name = "getAJoke")
    public Joke getAJoke() {
        return new Joke(JokeShop.getAJoke());
    }
}
