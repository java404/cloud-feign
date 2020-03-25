package cn.com.dnt.feign.handing;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Configuration;


import static feign.FeignException.errorStatus;

@Configuration
public class FeignErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {

        if (response.status() >= 400 && response.status() <= 499) {
            throw new StashClientException(response.body().toString());
        }
        if (response.status() >= 500 && response.status() <= 599) {
            throw new StashClientException(response.toString());
        }
        return errorStatus(methodKey, response);
    }
}
