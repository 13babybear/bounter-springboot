package com.bounter.springboot.dao;


import com.bounter.springboot.model.po.Bounter;



public interface BounterDao {
	
	Bounter selectById(long id);
}
