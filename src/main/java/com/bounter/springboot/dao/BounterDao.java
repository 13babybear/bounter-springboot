package com.bounter.springboot.dao;


import com.bounter.springboot.model.po.Bounter;

import java.util.List;
import java.util.Map;



public interface BounterDao {
	
	Bounter selectById(long id);
}
