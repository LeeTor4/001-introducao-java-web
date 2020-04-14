<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="br.uece.eesdevop.introducaojavaweb.Book" %>
<%@ page import="br.uece.eesdevop.introducaojavaweb.dao.Banco" %>
<%--
  Created by IntelliJ IDEA.
  User: wellingtonpereira
  Date: 06/04/20
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>List books</title>
    </head>
    <body>
        <h1>List of books:</h1>
        <br/>
        <table border="1px">
            <%
                Banco banco = new Banco();
                List<Book> books = banco.getLista();
            
                for (Book book : books) { %>
                    <tr>
                        <td><%=book.getTitle() %></td>
                        <td><%=book.getAuthor() %></td>
                        <td><%=book.getLaunchYear() %></td>
                    </tr>
            <%
                }
            %>
        </table>
        <br/>
        <form action="/introducao-java-web/adiciona-livros.html" >
            <input type="submit" value="Gravar" />
        </form>         
    </body>
</html>
