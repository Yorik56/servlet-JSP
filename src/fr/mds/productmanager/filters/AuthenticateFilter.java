package fr.mds.productmanager.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebFilter(urlPatterns = ("/auth/*"))
public class AuthenticateFilter extends HttpFilter{

	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {

		
		if (req.getSession().getAttribute("username") == null) {
			
			System.out.println("fail");
			res.sendRedirect(req.getContextPath() + "/login.html");
		}else {
			System.out.println("success");
			chain.doFilter(req, res);
		}
	}

}
