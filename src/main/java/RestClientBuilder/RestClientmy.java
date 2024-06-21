package RestClientBuilder;

import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;

@Service
public class RestClientmy {



    RestClientmy customClient = RestClientmy.builder()
            .requestFactory(new HttpComponentsClientHttpRequestFactory())

            .baseUrl("https://example.com")//products url
            .defaultUriVariables(Map.of("variable", "foo"))
            .defaultHeader("My-Header", "Foo")
            .requestInterceptor(myCustomInterceptor)
            .requestInitializer(myCustomInitializer)
            .build();
}
