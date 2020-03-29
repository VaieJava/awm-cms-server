package com.outdd.cms;


import com.outdd.cms.api.cms.service.impl.TestPojoServiceImpl;
import com.outdd.cms.pojo2.TestPojo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = AwmCmsServerApplication.class)
public class TestMain {

    @Autowired
    TestPojoServiceImpl testPojoService;
    @Test
    public void amain() {
        TestPojo testPojo = new TestPojo();
        testPojo.name = "niMa";
        testPojoService.save(testPojo);
    }
}
