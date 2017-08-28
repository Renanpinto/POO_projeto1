/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.web.poo1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Renan
 */
@WebServlet(name = "JurosSimples", urlPatterns = {"/JurosSimples"})
public class JurosSimples extends HttpServlet {

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
            out.println("<title>Servlet Juros Simples</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Juros Simples </h1>");
            out.println("<form method='get' action='JurosSimples'>");
            out.println("<p> Valor da Aplicação ou Dívida: </p>");
            out.println("<input type='number' name='p' step='any' min='0' />");
            out.println("<p> Juros ( Em porcentagem): </p>");
            out.println("<input type='number' name='i' step='any' min='0' />");
            out.println("<p> Tempo (Meses): </p>");
            out.println("<input type='number' name='n' step='any' min='0' />");
            out.println("<br>"); out.println("<br>");
            out.println("<Input type='submit' value='calcular'/>");
            out.println("</form>");
            
            
            double p,i,n,m,j ;
            
            
            
            if(request.getParameter("p")!= null) {
                try {
                    p = Double.parseDouble(request.getParameter("p"));
                    i = Double.parseDouble(request.getParameter("i"));
                    n = Double.parseDouble(request.getParameter("n"));
                    
                    j = (p*i*n)/100;
                    m = j+p;
                    
                    out.printf("<h4> valor do juros é: R$"+j+"</h4>");
                    out.printf("<h4> valor do montante é: R$"+m+"</h4>");
                    
                }
                
                
                
                 
            catch(Exception ex){
                out.println("<h4>Parâmetros Inválidos</h4>");
            }
                                   
            }
                            
            
            
                    
            
            
            
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

    private static class DecimalFormat {

        public DecimalFormat() {
        }

        private DecimalFormat(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String format(double j) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void applyPattern(String r$_000) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
