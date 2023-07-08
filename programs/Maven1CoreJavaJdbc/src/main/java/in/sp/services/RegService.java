package in.sp.services;

import in.sp.dao.RegDao;

public class RegService 
{
	public boolean registerService(String name, String email, String password, String city)
	{
		RegDao rd = new RegDao();
		boolean status = rd.registerDao(name, email, password, city);
		return status;
	}
}
