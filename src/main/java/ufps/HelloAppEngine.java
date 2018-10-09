package ufps;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


public class HelloAppEngine extends HttpServlet {


	public void listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	    response.setCharacterEncoding("UTF-8");
        ArrayList<reconocimientoDTO> list;
        reconocimientoDAO dao = new reconocimientoDAO();
        PrintWriter out = response.getWriter();
        try {
            list = dao.listar();
            Gson g = new Gson();
            String rel = g.toJson(list);
            out.write(rel);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	@Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
            System.out.println("hsudahdijiasd");
		if(request.getParameter("listar")!=null){
                    listar(request, response);
		}
	  
      

  }
}