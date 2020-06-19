import com.codegym.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletCustomer", urlPatterns = "/home")
public class ServletCustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer>customerList=new ArrayList<>();
        customerList.add(new Customer("Nguyễn Văn Đạt","08/08/1995","Nghệ An","aaa"));
        customerList.add(new Customer("Nguyễn Tuyền","11/06/1992","Hà Tĩnh","bbb"));
        customerList.add(new Customer("Nguyễn Thị Thúy","25/12/1996","Hà Nội","ccc"));
        customerList.add(new Customer("Nguyễn Minh Hải","08/08/2001","Hải Phòng","ddd"));
//        com.codegym.Customer customer= new com.codegym.Customer("Nguyễn Minh Hải","08/08/2001","Hải Phòng","ddd");
        request.setAttribute("customers",customerList);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/view.jsp");
        dispatcher.forward(request, response);
    }
}
