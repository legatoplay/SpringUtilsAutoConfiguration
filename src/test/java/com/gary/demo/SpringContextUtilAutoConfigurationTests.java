package com.gary.demo;

import com.gary.demo.util.SpringContextUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApp.class)
public class SpringContextUtilAutoConfigurationTests {

    @MockBean
    IHelloService helloService;

    @Test
    public void contextLoads() {
        IHelloService service = SpringContextUtil.getBeanByClass(IHelloService.class);
        Assert.assertNotNull(service);
        System.out.println(service);
    }

}
