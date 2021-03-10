package wxw.ssm2_1126.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wxw.ssm2_1126.dao.NewMapper;
import wxw.ssm2_1126.pojo.New;

@Service
public class MyService {


    @Autowired
    NewMapper newMapper;

    @Transactional
    public void  dddd(){
        System.out.println(newMapper.getClass());
        //不管做多少条sql语句，都有事务管理
        System.out.println("=============");
        New xxx=newMapper.selectByPrimaryKey("wxw");
        System.out.println(""+xxx.getName());
    }
}
