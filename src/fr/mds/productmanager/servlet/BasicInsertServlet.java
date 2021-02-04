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

@SuppressWarnings({ "serial", "unused" })
@WebServlet(urlPatterns = "/auth/basicInsert")
public class BasicInsertServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {//		out.println("Product Id: " + id);
		Product  product = new Product("Ps5","Best nextgen", 1000.0f);
//		product.setName("poire");
//		product.setDescription("local fruit");
//		product.setPrice((float)12000);
//		product.setId((long)1);		
		ProductDao.addProduct(product);
		resp.getWriter().println("product added with id: " + product.getId());
	}
	
}
