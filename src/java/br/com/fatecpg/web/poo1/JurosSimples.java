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
            out.println("<title>Projeto 1 - POO</title>");
            out.println("<meta charset=\"utf-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">");
            out.println("<link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\" type=\"text/css\">");
            out.println("<link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\">");
            out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"estilo.css\">");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">");
            out.println("<style>");
            out.println("body {");
            out.println("font: 400 15px/1.8 Lato, sans-serif;");
            out.println("color: #777;");
            out.println("}");
            out.println("h3{");
            out.println("margin: 10px 0 30px 0;");
            out.println("letter-spacing: 10px;      ");
            out.println("font-size: 20px;");
            out.println("color: #111;");
            out.println("}");
            out.println(".container {");
            out.println("padding: 80px 120px;");
            out.println("}");
            out.println(".person {");
            out.println("border: 10px solid transparent;");
            out.println("margin-bottom: 25px;");
            out.println("opacity: 0.7;");

            out.println("  }");

            out.println("  .modal-header {");
            out.println("      background-color: #333;");
            out.println("      color: #fff;");
            out.println("      text-align: center;");
            out.println("      font-size: 30px;");
            out.println("  }");
            out.println("  .modal-header {");
            out.println("      padding: 40px 50px;");
            out.println("  }");
            out.println("  .nav-tabs li a {");
            out.println("      color: #777;");
            out.println("  }");
            out.println("  ");
            out.println("  .navbar {");
            out.println("      font-family: Montserrat, sans-serif;");
            out.println("      margin-bottom: 0;");
            out.println("      background-color: #2d2d30;");
            out.println("      border: 0;");
            out.println("      font-size: 11px;");
            out.println("      letter-spacing: 4px;");
            out.println("      opacity: 0.9;");
            out.println("  }");
            out.println("  .navbar li a, .navbar .navbar-brand { ");
            out.println("      color: #d5d5d5 ;");
            out.println("  }");
            out.println("  .navbar-nav li a:hover {");
            out.println("      color: #fff !important;");
            out.println("  }");
            out.println("  .navbar-nav li.active a {");
            out.println("      color: #fff !important;");
            out.println("      background-color: #29292c !important;");
            out.println("  }");
            out.println("  .navbar-default .navbar-toggle {");
            out.println("      border-color: transparent;");
            out.println("  }");
            out.println("");
            out.println("  footer {");
            out.println("      background-color: #2d2d30;");
            out.println("      color: #f5f5f5;");
            out.println("padding: 32px;");
            out.println("}");
            out.println("footer a {");
            out.println("color: #f5f5f5;");
            out.println("}");
            out.println("footer a:hover {");
            out.println("color: #777;");
            out.println("text-decoration: none;");
            out.println("}  ");
            out.println(".form-control {");
            out.println("border-radius: 0;");
            out.println("}");
            out.println("textarea {");
            out.println("resize: none;");
            out.println("}");
            out.println("</style>");

            out.println("</head>");
             out.println("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">");

            out.println("<nav class=\"navbar navbar-default navbar-fixed-top\">");
            out.println("<div class=\"container-fluid\">");
            out.println("<div class=\"navbar-header\">");
            out.println("<a class=\"navbar-brand\" href=\"/POO_Projeto1/Home\">P.O.O.</a>");
            out.println("</div>");
            out.println("<ul class=\"nav navbar-nav navbar-right\">");
            out.println("<li><a href=\"/POO_Projeto1/Home\">HOME</a></li>");
            out.println("<li><a href=\"/POO_Projeto1/JurosComposto\">JUROS COMPOSTO</a></li>");

            out.println("</ul>");
            out.println("</div>");
            out.println("</nav>");
            
            
            out.println("<div id=\"grupo\" class=\"container text-center\">");
            out.println("<h1> Juros Simples </h1>");
            out.println("</div>");
            out.println("<div class=\"container-fluid\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-md-6 text-center\">");
            out.println("<form method='get' action='JurosSimples'>");
            out.println("<p> Valor da Aplicação ou Dívida: </p>");
            out.println("<input type='number' name='p' step='any' min='0' />");
            out.println("<p> Juros ( Em porcentagem): </p>");
            out.println("<input type='number' name='i' step='any' min='0' />");
            out.println("<p> Tempo (Meses): </p>");
            out.println("<input type='number' name='n' step='any' min='0' />");
            out.println("<br/>"); 
            out.println("<br/>");
            out.println("<Input type='submit' value='calcular'/>");
            out.println("</form>");
            
            out.println("<br/>");
            out.println("</div>");
            out.println("<div class=\"col-md-6\">");
            
            
            
            double p,i,n,m,j ;
            
            
            
            if(request.getParameter("p")!= null) {
                try {
                    p = Double.parseDouble(request.getParameter("p"));
                    i = Double.parseDouble(request.getParameter("i"));
                    n = Double.parseDouble(request.getParameter("n"));
                    
                    j = (p*i*n)/100;
                    m = j+p;
              
              
              
              
             
                    out.printf("<h4><strong> Valor do juros é: R$"+j+"</strong></h4>");
                    out.printf("<h4><strong> Valor do montante é: R$"+m+"</strong></h4>");
                  
                }
                
                
                
                 
            catch(Exception ex){
                out.println("<h4>Parâmetros Inválidos</h4>");
            }
                     
            }
                               out.println("</div>");
            out.println("</div>");        
            out.println("</div>");                     
            
            
                    
            
            
            
            //<!-- Footer -->
            out.println("<footer class=\"text-center\">");
            out.println("  <p>ADS 4º ciclo noturno</p> ");
            out.println("</footer>");
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
