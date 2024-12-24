package com.hk.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.Entity.Mobiles;
import com.hk.Repository.ImobilesRepository;

@Service
public class Imobileserviceimpl implements Imobileservice
{
	@Autowired
	private ImobilesRepository mobilerepo;

	@Override
	public List<Mobiles> showallmobiles()
	{
		List<Mobiles>list=mobilerepo.findAll();
		return list;
	}
	
	@Override
	public String addmobiles(Mobiles mobiles)
	{
		int id=mobilerepo.save(mobiles).getMobile_id();
		return "mobile details are saved with id::"+id;
	}

	@Override
	public Mobiles findmobileid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
