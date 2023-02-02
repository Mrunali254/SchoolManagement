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

	@WebServlet("/addteacher")
	public class AddTeacher  extends HttpServlet {
				
			@Override
			protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				String id=req.getParameter("id");
				String name=req.getParameter("name");
				String subject=req.getParameter("subject");
				String salary=req.getParameter("salary");

				
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("mona");
				EntityManager em=emf.createEntityManager();
				EntityTransaction et=em.getTransaction();
			
				
				Teacher t=new Teacher();
				
				t.setId(Integer.parseInt(id));
				t.setName(name);
				t.setSubject(subject);
				t.setSalary(Integer.parseInt(salary));

				et.begin();
				em.persist(t);
				et.commit();
				
				PrintWriter pw=resp.getWriter();
				pw.write("Teacher Detail Added Successsfully...");
				resp.setContentType("text/html");
				RequestDispatcher rd=req.getRequestDispatcher("AddTeacher.html");
				rd.include(req, resp);
		}
		}


