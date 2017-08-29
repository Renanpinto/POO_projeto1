/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.web.poo1;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Renan
 */
@WebServlet(name = "JurosComposto", urlPatterns = {"/JurosComposto"})
public class JurosComposto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JurosComposto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><a href=\"Home\">Voltar</a></h1>");  
            out.println("<h3>Cálculo de Juros Composto</h3>");            
            out.println("<form method='get' action='JurosComposto'>");
            out.println("<p>Valor da aplicação (capital) :</p>");
            out.println("<input type='text' name='c'/>");              
            out.println("<p>Juros (em porcentagem):</p>");
            out.println("<input type='text' name='i'/>");             
            out.println("<p>Tempo (em meses):</p>");
            out.println("<input type='text' name='n'/>"); 
            out.println("<br>");out.println("<br>");
            out.println("<input type='submit' value='calcular'/>");
            out.println("<br>");out.println("<br>");
            out.println("</form>");
            
            double c,n, i,m;
            DecimalFormat df = new DecimalFormat("###,##0.00");
                
            if(request.getParameter("c") != null){                
            try{
               
                c = Double.parseDouble(request.getParameter("c"));
                i= Double.parseDouble(request.getParameter("i"));
                n= Double.parseDouble(request.getParameter("n"));
                
                out.println("<table border='1'>");
                out.println("<tr>");
                out.println("<th>Mês</th>");
                out.println("<th>Montante mensal</th>");
                out.println("</tr>");
            
                int x;
                for(x=1;x<=n;x++){
                    m=c*(1+(i/100));
                    out.printf("<tr><td>"+x+"</td><td>R$ "+df.format(m)+"</td></tr>");
            
                    c=m;
            };
            
            }catch(Exception ex){
                out.println("<h4>Parâmetro inválido</h4>");
            }}
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
