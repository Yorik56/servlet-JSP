package fr.mds.productmanager.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mds.productmanager.dao.ProductDao;
import fr.mds.productmanager.model.Product;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = ("/showProduct"))
public class ShowProductServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();		
		String idStr = req.getParameter("id");
		
		if(idStr == null) {
			out.println("missing id parameter");
			return;			
		}
		
		Long idLong = null;
		
		try {
			idLong = Long.parseLong(idStr);			
		} catch(NumberFormatException  e) {
			out.println("Parameter 'id' is not a long");
			return;
		}
		
		System.out.println("New parameter is :" + idLong );
		Product product = ProductDao.findProduct(idLong);
		req.setAttribute("product", product);
		req.getRequestDispatcher("showProduct.jsp").forward(req, resp);
//		out.println("Product: " + product.getId());
	}
}
