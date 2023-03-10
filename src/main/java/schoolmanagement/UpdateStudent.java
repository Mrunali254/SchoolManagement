package schoolmanagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updatestudent")
public class UpdateStudent extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mona") ;
	     EntityManager em = emf.createEntityManager() ;
	     EntityTransaction et = em.getTransaction() ;
	     
	     String id = req.getParameter("id") ;
	     String name = req.getParameter("name") ;
	     String stream = req.getParameter("stream") ;
	     String fees = req.getParameter("fees") ;
	     
	     Student s = new Student() ;
	     s.setId(Integer.parseInt(id));
	     s.setName(name);
	     s.setStream(stream);
	     s.setFees(Integer.parseInt(fees));
	     
	     et.begin();
	     em.merge(s) ;
	     et.commit();
	     
	     resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter() ;
			pw.write("updated successfully");
			
			RequestDispatcher rd = req.getRequestDispatcher("Student.html") ;
			rd.include(req, resp);
    }
}