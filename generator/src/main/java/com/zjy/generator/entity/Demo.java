package com.zjy.generator.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.zjy.generator.base.BaseEntity;
import com.zjy.generator.dto.DemoDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Demo extends BaseEntity<DemoDto> {
    @TableLogic
    @JsonIgnore
    private int id;
}
