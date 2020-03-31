package com.outdd.cms.api.cms.service.impl;

import com.outdd.awmapicms.pojo.Praise;
import com.outdd.awmapicms.service.PraiseService;
import com.outdd.common.service.BaseApiService;
import com.outdd.common.service.impl.BaseApiServiceImpl;
import com.outdd.common.service.impl.BaseRestfulApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PraiseServiceImpl extends BaseRestfulApiServiceImpl<Praise> implements PraiseService  {
    @Resource
    JpaRepository<Praise,Long> jpaRepository;
    @Override
    public JpaRepository getRepository(){
        return jpaRepository;
    }
}
