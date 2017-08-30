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
            out.println("<li><a href=\"/POO_Projeto1/JurosSimples\">JUROS SIMPLES</a></li>");

            out.println("</ul>");
            out.println("</div>");
            out.println("</nav>");
            out.println("<div id=\"grupo\" class=\"container text-center\">");
            out.println("<h1> Juros Composto </h1>");
            out.println("</div>");
            out.println("<div class=\"container-fluid\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-md-1\">");
            out.println("</div>");
            out.println("<div class=\"col-md-4\">");
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
            
            out.println("</div>");
            out.println("<div class=\"col-md-6\">");
            double c,n, i,m;
            DecimalFormat df = new DecimalFormat("###,##0.00");
                
            if(request.getParameter("c") != null){                
            try{
               
                c = Double.parseDouble(request.getParameter("c"));
                i= Double.parseDouble(request.getParameter("i"));
                n= Double.parseDouble(request.getParameter("n"));
                
                out.println("<table class=\"table table-striped\">");
                out.println("<thead>");
                out.println("<tr>");
                out.println("<th>Mês</th>");
                out.println("<th>Juros</th>");
                out.println("<th>Montante mensal</th>");
                out.println("</tr>");
                out.println("</thead>");
            
                int x;
                double j;
                for(x=1;x<=n;x++){
                    m=c*(1+(i/100));
                    j=m-c;
                    out.println("<tbody>");
                    out.println("<tr>");
                    out.printf("<td>"+x+"</td>");
                    out.printf("<td>R$ "+df.format(j)+"</td>");
                    out.printf("<td>R$ "+df.format(m)+"</td>");
                    out.println("</tr>");
                    out.println("</tbody>");
                    c=m;
                }
                
            
            }catch(Exception ex){
                out.println("<h4>Parâmetro inválido</h4>");
            }}
            out.println("</table>");
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

}
