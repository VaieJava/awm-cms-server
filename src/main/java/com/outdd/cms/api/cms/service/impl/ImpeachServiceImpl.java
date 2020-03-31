package com.outdd.cms.api.cms.service.impl;

import com.outdd.awmapicms.pojo.Impeach;
import com.outdd.awmapicms.service.ImpeachService;
import com.outdd.common.service.BaseApiService;
import com.outdd.common.service.impl.BaseApiServiceImpl;
import com.outdd.common.service.impl.BaseRestfulApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ImpeachServiceImpl extends BaseRestfulApiServiceImpl<Impeach> implements ImpeachService {
    @Resource
    JpaRepository<Impeach,Long> jpaRepository;
    @Override
    public JpaRepository getRepository(){
        return jpaRepository;
    }
}
