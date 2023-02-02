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

@WebServlet("/addstudent")
public class AddStudent extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("mona");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		String id = req.getParameter("id");
		int id1=Integer.parseInt(id);
				
		String name = req.getParameter("name");
		String stream = req.getParameter("stream");

		String fees = req.getParameter("fees");
		double fees1=Integer.parseInt(fees);

		Student s = new Student();
		s.setId(id1);
		s.setName(name);
		s.setStream(stream);
		s.setFees(fees1);

		et.begin();
		em.persist(s);
		et.commit();
		
		PrintWriter pw=resp.getWriter();
		pw.write("Student Detail Added Successsfully...");
		resp.setContentType("text/html");
		RequestDispatcher rd=req.getRequestDispatcher("AddStudent.html");
		rd.include(req, resp);
	}

}
