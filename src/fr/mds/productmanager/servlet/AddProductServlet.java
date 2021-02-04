package fr.mds.productmanager.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mds.productmanager.dao.ProductDao;
import fr.mds.productmanager.model.Product;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/auth/addProduct")
public class AddProductServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String productName = req.getParameter("name");
			String productDescritption = req.getParameter("description");
			String productPriceStr = req.getParameter("price");
			Float productPriceFloat = Float.parseFloat(productPriceStr);
			
			Product p = new Product(productName, productDescritption, productPriceFloat);
			ProductDao.addProduct(p);
			
			resp.sendRedirect(req.getContextPath() + "/showProduct?id=" + p.getId());
			
	}
}
