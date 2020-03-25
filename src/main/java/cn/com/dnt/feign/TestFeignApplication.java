package cn.com.dnt.feign;

import cn.com.dnt.feign.config.FeignOkHttpConfig;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestFeignApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TestFeignApplication.class, args);
		final TestFeign target = Feign.builder()
				//.decoder(new GsonDecoder())
				.target(TestFeign.class, "http://localhost:8885/");
		final String test = target.test();
		System.out.println(test);

//		final TestFeign target1 = Feign.builder()
//				.client(new OkHttpClient(FeignOkHttpConfig.okHttpClient()))
//				.target(TestFeign.class, "http://172.24.8.132:9000/");
//		final String result = target.update("222","{\"new_domain_name\": \"333\"}");
//		System.out.println(result);


		final TestFeign target2 = Feign.builder()
				.client(new OkHttpClient())
				.encoder(new GsonEncoder())
				.decoder(new GsonDecoder())
				.target(TestFeign.class, "http://localhost:8885/");
		HostFileSystemInfoVo vo = new HostFileSystemInfoVo();
		vo.setAvail("1");
		vo.setPath("2");
		vo.setTotal("3");
		vo.setUsage("4");
		vo.setUsed("5");
		final HostFileSystemInfoVo vo1 = target2.test1(vo);
		System.out.println(vo1);

	}

}
