package com.outdd.cms.api.cms.service.impl;

import com.outdd.awmapicms.pojo.DynamicCircle;
import com.outdd.awmapicms.service.DynamicCircleService;
import com.outdd.cms.dao.DynamicCircleDao;
import com.outdd.common.service.BaseApiService;
import com.outdd.common.service.BaseRestfulApiService;
import com.outdd.common.service.impl.BaseApiServiceImpl;
import com.outdd.common.service.impl.BaseRestfulApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DynamicCircleServiceImpl extends BaseRestfulApiServiceImpl<DynamicCircle>
        implements DynamicCircleService {
    @Resource
    JpaRepository<DynamicCircle,Long> jpaRepository;
    @Override
    public JpaRepository getRepository(){
        return jpaRepository;
    }

}
