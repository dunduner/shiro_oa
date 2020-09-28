package springboot.oa.dao;

import org.apache.ibatis.annotations.Param;
import springboot.oa.domain.TbEmployee;
import springboot.oa.domain.TbEmployeeExample;

import java.util.HashMap;
import java.util.List;

public interface TbEmployeeMapper {
    long countByExample(TbEmployeeExample example);

    int deleteByExample(TbEmployeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbEmployee record);

    int insertSelective(TbEmployee record);

    List<TbEmployee> selectByExample(TbEmployeeExample example);

    TbEmployee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbEmployee record, @Param("example") TbEmployeeExample example);

    int updateByExample(@Param("record") TbEmployee record, @Param("example") TbEmployeeExample example);

    int updateByPrimaryKeySelective(TbEmployee record);

    int updateByPrimaryKey(TbEmployee record);
    
    List<TbEmployee> selectAllByPage(HashMap<String, Integer> map);
   
    
}