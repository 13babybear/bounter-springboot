package com.bounter.springboot.service.impl;


import com.bounter.springboot.dao.BounterDao;
import com.bounter.springboot.model.po.Bounter;
import com.bounter.springboot.service.BounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BounterServiceImpl implements BounterService {

    @Autowired
    private BounterDao bounterDao;

    @Override
    public Bounter findById(long id) {
        return bounterDao.selectById(id);
    }
}
