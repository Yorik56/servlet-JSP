<a href="/ProductManager/listProduct">List product</a>
<a href="/ProductManager/auth/addProduct.jsp">Add product</a>


<% if (request.getSession().getAttribute("username") == null) { %>
<a href="/ProductManager/login.html">Login</a>
<% } else { %>
<a href="/ProductManager/logout">Logout</a>
<% } %>