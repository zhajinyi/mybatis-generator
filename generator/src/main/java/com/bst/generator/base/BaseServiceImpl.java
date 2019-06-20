package com.bst.generator.base;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<Template extends BaseEntity,Mapper extends BaseMapper<Template>> implements BaseService<Template> {

    @Autowired
    Mapper baseMapper;

    @Override
    public boolean countByPrimaryKey(String id) {
        return baseMapper.countByPrimaryKey(id) > 0;
    }

    @Override
    public int countEntities(Template template) {
        return baseMapper.countByTemplate(template);
    }

    @Override
    public boolean countByTemplate(Template template) {
        return baseMapper.countByTemplate(template) > 0;
    }

    @Override
    public boolean insertEntity(Template template) {
        return baseMapper.insert(template) > 0;
    }

    @Override
    public boolean insertEntitySelective(Template template) {
        return baseMapper.insertSelective(template) > 0;
    }

    @Override
    public boolean deleteEntity(Template template) {
        return baseMapper.delete(template) > 0;
    }

    @Override
    public boolean deleteEntityByPrimaryKey(String id) {
        return baseMapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public boolean deleteEntityByPrimaryKeys(List<String> ids) {
        return baseMapper.deleteByPrimaryKeys(ids) > 0;
    }

    @Override
    public boolean updateEntityByPrimaryKey(Template template) {
        return baseMapper.updateByPrimaryKey(template) > 0;
    }

    @Override
    public boolean updateEntityByPrimaryKeySelective(Template template) {
        return baseMapper.updateByPrimaryKeySelective(template) > 0;
    }

    @Override
    public Template selectEntityByPrimaryKey(String id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Template> selectAllEntities() {
        return baseMapper.selectAll();
    }

    @Override
    public List<Template> selectEntitiesByTemplate(Template template) {
        return baseMapper.selectByTemplate(template);
    }

    @Override
    public String selectIdByTemplate(Template template) {
        return baseMapper.selectIdByTemplate(template);
    }
}
