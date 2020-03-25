package cn.com.dnt.feign.token;

import feign.Request;
import feign.RequestTemplate;
import feign.Target;

public class DynamicAuthTokenTarget<T> implements Target<T> {

    @Override
    public Class<T> type() {
        return null;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Request apply(RequestTemplate input) {
        return null;
    }
}
