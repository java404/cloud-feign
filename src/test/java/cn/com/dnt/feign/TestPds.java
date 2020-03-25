package cn.com.dnt.feign;

import feign.Feign;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestPds.class)
public class TestPds {

    @Ignore
    @Test
    public void test() {
        final TestFeign target = Feign.builder()
                //.decoder(new GsonDecoder())
                .target(TestFeign.class, "http://localhost:8885");
        final String test = target.test();
        System.out.println(test);
    }

}
