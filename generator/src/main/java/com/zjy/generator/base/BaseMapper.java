package com.zjy.generator.base;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
/**
 * dao模板   基础类
 *
 * @author zhajinyi
 * @email zhajinyi@163.com
 * @date 2019年06月17日 上午10:27:52
 */
@Mapper
public interface BaseMapper<Template extends BaseEntity> {

    int countByPrimaryKey(String id);

    int countByTemplate(@Param(value = "template") Template template);

    int insert(Template template);

    int insertSelective(Template template);

    int delete(Template template);

    int deleteByPrimaryKey(String id);

    int deleteByPrimaryKeys(List<String> ids);

    int updateByPrimaryKey(Template template);

    int updateByPrimaryKeySelective(Template template);

    String selectIdByTemplate(Template template);

    Template selectByPrimaryKey(String id);

    List<Template> selectAll();

    List<Template> selectByTemplate(@Param(value = "template") Template template);

}
