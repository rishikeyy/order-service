package RestClientBuilder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Component
public class RestClientmy {

    @Value("${service.product.base}")
    private  String productUrl;

    RestClient getRestClientmy(){
        return RestClient.builder().baseUrl(productUrl).build();
    }

}
