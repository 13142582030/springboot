package wxw.ssm2_1126.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import wxw.ssm2_1126.pojo.New;

@Mapper
public interface NewMapper {
    int deleteByPrimaryKey(String name);

    int insert(New record);

    int insertSelective(New record);

    New selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(New record);

    int updateByPrimaryKey(New record);
}
