import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyServlet1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html");
      PrintWriter out= response.getWriter();
      String uname = request.getParameter("nm");
      String pass = request.getParameter("pwd");
      System.out.println(uname+" "+pass);
      if(uname.equals("abc") && pass.equals("123"))
      {
          HttpSession s=request.getSession();
          s.setAttribute("name",uname);
          RequestDispatcher rd;
          rd = request.getRequestDispatcher("Loginpage.html");
          
         rd.forward(request,response);
          
         // out.println("<script type=\"text/javascript\">");
          
          //out.println("location='Loginpage.html'");
          
         // out.println("</script>");
      }
      else     
        {
            RequestDispatcher rd=request.getRequestDispatcher("newhtml.html");
            rd.forward(request,response);
        }
      
      
      
    }
    }

