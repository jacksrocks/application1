package com.hk.Service;

import java.util.List;
import com.hk.Entity.Mobiles;

public interface Imobileservice 
{
	public List<Mobiles>showallmobiles();
	
	public String addmobiles(Mobiles mobiles);
	
	public Mobiles findmobileid(int id);

}
