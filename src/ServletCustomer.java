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
//        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Nguyễn Văn Đạt", "08/08/1995", "Nghệ An", "https://ca.slack-edge.com/T4AQ8L79A-UVAGDF31R-2b2bad99e723-512"));
        customerList.add(new Customer("Liên Vũ", "11/06/1989", "Hà Tĩnh", "https://ca.slack-edge.com/T4AQ8L79A-UTRU44H6G-cc1149a5baf5-512"));
        customerList.add(new Customer("Nguyễn Thị Thúy", "25/12/1996", "Hà Nội", "https://ca.slack-edge.com/T4AQ8L79A-U01046D0Z4P-fc70eae52539-512"));
        customerList.add(new Customer("Nguyễn Tuyền", "08/08/1992", "Hải Phòng", "https://ca.slack-edge.com/T4AQ8L79A-U0102A747FS-f68a80ce0d8b-512"));
//        com.codegym.Customer customer= new com.codegym.Customer("Nguyễn Minh Hải","08/08/2001","Hải Phòng","ddd");
        request.setAttribute("customers", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view.jsp");
        dispatcher.forward(request, response);
    }
}
