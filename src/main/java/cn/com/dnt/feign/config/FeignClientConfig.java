package cn.com.dnt.feign.config;

import org.apache.commons.codec.binary.Base64;

import java.nio.charset.Charset;

public class FeignClientConfig {
    public static final String pds = "http://172.24.8.132:9000";

    public static String format(String auth) {
        final byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("ISO-8859-1")));
        final String authHeader = "Basic " + new String(encodedAuth);
        return authHeader;
    }
}
