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

	@WebServlet("/deleteteacher")
	public class DeleteTeacher extends HttpServlet {

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String id = req.getParameter("id");
			
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("mona");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
		
			Teacher t =new Teacher();
			
			int id1=Integer.parseInt(id);
			t.setId(id1);
			t=em.find(Teacher.class, id1);
			if(t!=null)
			{
				
			et.begin();
			em.remove(t);
			et.commit();
			
			PrintWriter pw=resp.getWriter();
			pw.write("Teacher Detail Deleted Successsfully...");
			resp.setContentType("text/html");
			RequestDispatcher rd=req.getRequestDispatcher("DeleteTeacher.html");
			rd.include(req, resp);
			}
			else
			{
				PrintWriter pw=resp.getWriter();
				pw.write("Data not found...");
				resp.setContentType("text/html");
				RequestDispatcher rd=req.getRequestDispatcher("Teacher.html");
				rd.include(req, resp);
			}
		}
	}

