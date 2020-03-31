package com.outdd.cms.api.cms.service.impl;

import com.outdd.awmapicms.pojo.Enshrine;
import com.outdd.awmapicms.service.EnshrineService;
import com.outdd.cms.dao.DynamicCircleDao;
import com.outdd.cms.dao.EnshrineDao;
import com.outdd.common.service.BaseApiService;
import com.outdd.common.service.impl.BaseApiServiceImpl;
import com.outdd.common.service.impl.BaseRestfulApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class EnshrineServiceImpl extends BaseRestfulApiServiceImpl<Enshrine> implements EnshrineService {
    @Resource
    JpaRepository<Enshrine,Long> jpaRepository;
    @Override
    public JpaRepository getRepository(){
        return jpaRepository;
    }
}
