package com.zjy.generator.base;

import java.util.List;
/**
 * service模板   基础类
 *
 * @author zhajinyi
 * @email zhajinyi@163.com
 * @date 2019年06月17日 上午10:27:52
 */
public interface BaseService<Template> {

    //通用型:判断记录是否存在
    boolean countByPrimaryKey(String id);

    //通用型:判断记录是否存在
    boolean countByTemplate(Template  template);

    //通用型:获取数量
    int countEntities(Template  template);

    //通用型：插入实体
    boolean insertEntity(Template  template);

    //通用型：根据模板插入实体
    boolean insertEntitySelective(Template  template);

    //通用型：根据实体删除对象
    boolean deleteEntity(Template  template);

    //通用型：通过主键删除对象
    boolean deleteEntityByPrimaryKey(String id);

    //通用型：通过传输多个主键来实现批量删除
    boolean deleteEntityByPrimaryKeys(List<String> ids);

    //通用型：根据主键来更新
    boolean updateEntityByPrimaryKey(Template  template);

    //通用型：通过主键查询，根据模板来更新对象
    boolean updateEntityByPrimaryKeySelective(Template  template);

    //通用型：根据主键查询记录
    Template selectEntityByPrimaryKey(String id);

    //通用型：查询所有的实体;
    List<Template> selectAllEntities ();

    //通用型：通过模板查询实体;
    List<Template> selectEntitiesByTemplate(Template  template);

    //通用型：通过模板查询Id;
    String selectIdByTemplate(Template  template);
}
