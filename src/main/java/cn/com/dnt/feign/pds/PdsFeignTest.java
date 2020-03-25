package cn.com.dnt.feign.pds;

import cn.com.dnt.feign.config.FeignClientConfig;
import cn.com.dnt.feign.config.FeignOkHttpConfig;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PdsFeignTest.class)
public class PdsFeignTest {

    @Test
    public void testPdsLogin() {
        String auth = "admin:c3284d0f94606de1fd2af172aba15bf3";
		final PdsFeign target = Feign.builder()
				.requestInterceptor(new ForwardedForInterceptor(auth))
				.target(PdsFeign.class, FeignClientConfig.pds);
		final String test = target.login("true");
		System.out.println(test);
    }

    @Test
	public void testDomainList() {
		String auth = "ZjRjZDE0ODAtNWY4NS0xMWVhLTk4ZWItNTI1NDAwNzYxOTlk:.";
		final PdsFeign target = Feign.builder()
				.requestInterceptor(new ForwardedForInterceptor(auth))
				.target(PdsFeign.class, FeignClientConfig.pds);
		final String hosts = target.domains();
		System.out.println(hosts);

	}

	@Test
	public void testDomainAdd() {
		String auth = "ZjRjZDE0ODAtNWY4NS0xMWVhLTk4ZWItNTI1NDAwNzYxOTlk:.";
		final PdsFeign target = Feign.builder()
				.requestInterceptor(new ForwardedForInterceptor(auth))
				.target(PdsFeign.class, FeignClientConfig.pds);
		final Domain wang = new Domain("wang", null);
		final String result = target.add("{\"domain_name\": \"333\"}");
		System.out.println(result);
	}

	@Test
	public void testDomainDel() {
		String auth = "ZjRjZDE0ODAtNWY4NS0xMWVhLTk4ZWItNTI1NDAwNzYxOTlk:.";
		final PdsFeign target = Feign.builder()
				.requestInterceptor(new ForwardedForInterceptor(auth))
				.target(PdsFeign.class, FeignClientConfig.pds);
		final String result = target.del("111");
		System.out.println(result);
	}

	@Test
	public void testDomainUpdate() {
		String auth = "ZjRjZDE0ODAtNWY4NS0xMWVhLTk4ZWItNTI1NDAwNzYxOTlk:.";
		final PdsFeign target = Feign.builder()
				.client(new OkHttpClient(FeignOkHttpConfig.okHttpClient()))
				.requestInterceptor(new ForwardedForInterceptor(auth))
				.target(PdsFeign.class, FeignClientConfig.pds);
		final String result = target.update("333","{\"new_domain_name\": \"555\", \"domain_info\": \"555\"}");
		System.out.println(result);
	}

	@Test
	public void testClusterUpdate() {
		String auth = "ZjRjZDE0ODAtNWY4NS0xMWVhLTk4ZWItNTI1NDAwNzYxOTlk:.";
		final PdsFeign target = Feign.builder()
				.client(new OkHttpClient(FeignOkHttpConfig.okHttpClient()))
				.requestInterceptor(new ForwardedForInterceptor(auth))
				.target(PdsFeign.class, FeignClientConfig.pds);
		final String result = target.updateCluster("{\"cluster_name\":\"cluster01\"}");
		System.out.println(result);
	}
}
