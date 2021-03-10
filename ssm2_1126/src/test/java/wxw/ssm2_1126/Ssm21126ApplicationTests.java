package wxw.ssm2_1126;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wxw.ssm2_1126.dao.NewMapper;
import wxw.ssm2_1126.pojo.New;
import wxw.ssm2_1126.service.MyService;

import javax.sql.DataSource;

@SpringBootTest
class Ssm21126ApplicationTests {

    @Autowired
    MyService service;   //自定义的 service层组件，方法被aop增强

    @Autowired
    NewMapper newMapper;   //class类型是  com.sun.proxy.代理类

    @Autowired
    DataSource dataSource;  //自定义的 Druid数据源

    @Test
    void contextLoads() {
        service.dddd();
        System.out.println(newMapper.getClass());
        System.out.println(dataSource.getClass());

        New xx=newMapper.selectByPrimaryKey("wxw");

    }

}
