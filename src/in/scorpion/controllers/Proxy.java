package in.scorpion.controllers;

import in.scorpion.service.URLConnectionReader;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Proxy
 * @author Amey Jadiye
 */
public class Proxy extends HttpServlet
{
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Proxy()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        doPost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        String url = request.getParameter("url");
        String buffer = null;
        try {
            URLConnectionReader.setProxyRequred(true, "http-pnproxy", "8080");
            buffer = URLConnectionReader.getBuffer(url);
            PrintWriter writer = response.getWriter();
            writer.print(buffer);
        }
        catch (Exception e) {
            request.setAttribute("ERROR", "true");
            request.getRequestDispatcher("index.jsp").forward(request, response);
//            /e.printStackTrace();
        }

    }

}
