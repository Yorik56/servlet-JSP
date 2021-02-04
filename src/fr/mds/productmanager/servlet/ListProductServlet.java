package fr.mds.productmanager.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import fr.mds.productmanager.dao.ProductDao;
import fr.mds.productmanager.model.Product;

@SuppressWarnings({ "serial", "unused" })
@WebServlet(urlPatterns = ("/listProduct"))
public class ListProductServlet extends HttpServlet {

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		PrintWriter out = resp.getWriter();
//		List<Product> products = ProductDao.getAllProducts();
//		out = resp.getWriter();		
//		
//		for(Product p : products) {
//			out.println(p.getId()+" -> "+p.getName()+" -> "+p.getPrice()+"€ ->"+p.getDescription());
//			
//		}
//	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Product> products = ProductDao.getAllProducts();
		req.setAttribute("products", products);
		req.getRequestDispatcher("listProduct.jsp").forward(req, resp);
	}

}
