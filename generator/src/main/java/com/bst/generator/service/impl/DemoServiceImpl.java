package com.bst.generator.service.impl;

import com.bst.generator.base.BaseServiceImpl;
import com.bst.generator.dao.DemoMapper;
import com.bst.generator.dto.DemoDto;
import com.bst.generator.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl extends BaseServiceImpl<DemoDto, DemoMapper> implements DemoService {

}
