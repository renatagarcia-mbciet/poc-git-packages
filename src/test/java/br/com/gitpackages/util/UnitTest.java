package br.com.gitpackages.util;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import feign.Request;
import feign.RequestTemplate;
import feign.Response;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

@ExtendWith(MockitoExtension.class)
public abstract class UnitTest {

  public Response createResponseByCode(HttpStatus statusCode, String body) {
    return Response.builder()
        .status(statusCode.value())
        .body(body, Charset.defaultCharset())
        .request(
            Request.create(
                Request.HttpMethod.POST,
                "" + "",
                Collections.<String, Collection<String>>emptyMap(),
                null,
                null,
                new RequestTemplate()))
        .build();
  }

  @BeforeAll
  static void setup() {
    FixtureFactoryLoader.loadTemplates("br.com.gitpackages.templates");
  }

  public Object getValidObjectFromClass(Class objectClass) {
    return new EasyRandom(new EasyRandomParameters()).nextObject(objectClass);
  }
}
