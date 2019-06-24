import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        Double price = Double.parseDouble(request.getParameter("price"));
        Double discount_percent = Double.parseDouble(request.getParameter("discount_percent"));

        Double discount_amount = price * discount_percent * 0.01;
        Double discount_price = price - discount_amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Description: " + description+"</br>");
        writer.println("Price: " + price+"</br>");
        writer.println("Discount percent: " + discount_percent+"</br>");
        writer.println("Discount amount: " + discount_amount+"</br>");
        writer.println("Discount price: " + discount_price+"</br>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
