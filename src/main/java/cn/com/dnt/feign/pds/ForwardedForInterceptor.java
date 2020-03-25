package cn.com.dnt.feign.pds;

import cn.com.dnt.feign.config.FeignClientConfig;
import feign.RequestInterceptor;
import feign.RequestTemplate;

public class ForwardedForInterceptor implements RequestInterceptor {
    private String authHeader;
    public ForwardedForInterceptor(String auth){
        this.authHeader = FeignClientConfig.format(auth);
    }
    @Override
    public void apply(RequestTemplate template) {
        template.header("Authorization", authHeader);
    }
}
