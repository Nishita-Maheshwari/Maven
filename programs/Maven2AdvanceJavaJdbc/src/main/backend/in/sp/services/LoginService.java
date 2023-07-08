package in.sp.services;

import in.sp.dao.LoginDao;

public class LoginService
{
	public boolean loginService(String email, String password)
	{
		LoginDao ld = new LoginDao();
		boolean status = ld.loginDao(email, password);
		return status;
	}
}
