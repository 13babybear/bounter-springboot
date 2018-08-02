package com.bounter.springboot.service;


import com.bounter.springboot.model.po.Bounter;

public interface BounterService{

    Bounter findById(long id);
}
