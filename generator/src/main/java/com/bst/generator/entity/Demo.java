package com.bst.generator.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.bst.generator.base.BaseEntity;
import com.bst.generator.dto.DemoDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Demo extends BaseEntity<DemoDto> {
    @TableLogic
    @JsonIgnore
    private int id;
}
