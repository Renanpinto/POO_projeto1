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
@WebServlet(name = "Home", urlPatterns = {"/Home"})
public class Home extends HttpServlet {

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
            out.println("<html lang=\"en\">");
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
            out.println("h3, h4 {");
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

            out.println("  .modal-header, h4 {");
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
            out.println("<a class=\"navbar-brand\" href=\"#myPage\">P.O.O.</a>");
            out.println("</div>");
            out.println("<ul class=\"nav navbar-nav navbar-right\">");
            out.println("<li><a href=\"#grupo\">GRUPO</a></li>");
            out.println("<li><a href=\"#servlets\">JUROS</a></li>");

            out.println("</ul>");
            out.println("</div>");
            out.println("</nav>");

//<!-- Container Sobre o Grupo -->
            out.println("<div id=\"grupo\" class=\"container text-center\">");
            out.println("<h3>SOBRE O GRUPO</h3>");
            out.println("<p><em>4º ADS NOTURNO</em></p>");
            out.println("<br>");

            out.println("<div class=\"row\">");
            out.println("  <div class=\"col-sm-4\">");
            out.println("    <p class=\"text-center\"><strong>Allan Almeida</strong></p><br>");
            out.println("    <img src=\"allan1.JPG\" class=\"img-circle person\" alt=\"allan\" width=\"255\" height=\"255\">");
            out.println("    <div id=\"demo\">");
            out.println("    <p><strong>RA: </strong>1290481613002</p>");
            out.println("     <p><i class=\"fa fa-linkedin\"></i> /allan-almeida-771238149 </p>");
            out.println("      <p><i class=\"fa fa-github\"></i> bllackz </p>");
            out.println("    </div>");
            out.println("  </div>");
            out.println("  <div class=\"col-sm-4\">");
            out.println("    <p class=\"text-center\"><strong>Marjorie Ribeiro</strong></p><br>");
            out.println("    <img src=\"marjorie.JPG\" class=\"img-circle person\" alt=\"marjorie\" width=\"255\" height=\"255\">");
            out.println("    <div id=\"demo2\">");
            out.println("    <p><strong>RA: </strong>1290481613029</p>");
            out.println("     <p><i class=\"fa fa-linkedin\"></i> /marjorie-maria-ribeiro-macedo-127342100 </p>");
            out.println("      <p><i class=\"fa fa-github\"></i> Marjorie31 </p>");
            out.println("    </div>");
            out.println("  </div>");
            out.println("  <div class=\"col-sm-4\">");
            out.println("    <p class=\"text-center\"><strong>Renan Pinto</strong></p><br>");
            out.println("    <img src=\"renan.JPG\" class=\"img-circle person\" alt=\"Renan\" width=\"255\" height=\"255\">");

            out.println("    <div id=\"demo3\">");
            out.println("      <p><strong>RA: </strong>1290481613036</p>");
            out.println("      <p><i class=\"fa fa-linkedin\"></i> /renan-pinto</p>");
            out.println("      <p><i class=\"fa fa-github\"></i> Renanpinto </p>");
            out.println("    </div>");
            out.println("  </div>");
           

            out.println("  </div>");
            out.println("</div>");
            out.println("</div>");
//<!-- Container Juros -->
            out.println("<div class=\"modal-header\" id=\"servlets\">");
            out.println("<h3 class=\"text-center\" style=\"color:#d5d5d5\">JUROS</h3>");
            out.println("</div>");
            out.println("<div class=\"container\">");

            out.println("<ul class=\"nav nav-tabs\">");
            out.println("<li class=\"active\"><a data-toggle=\"tab\" href=\"#home\">Juros Simples</a></li>");
            out.println("<li><a data-toggle=\"tab\" href=\"#menu1\">Juros composto</a></li>");
            out.println("</ul>");

            out.println("<div class=\"tab-content\" id=\"servlets\">");
            out.println("<div id=\"home\" class=\"tab-pane fade in active\">");
            out.println("<h2><a href=\"JurosSimples\">Juros Simples</a></h2>");
            out.println("<p>O regime de juros será simples quando o percentual de juros incidir apenas sobre o valor principal. Sobre os juros gerados a cada período não incidirão novos juros.</p>");
            out.println("<p>Valor Principal ou simplesmente principal é o valor inicial emprestado ou aplicado, antes de somarmos os juros. Transformando em fórmula temos:");
            out.println("<br/>");
            out.println("<p class=\"text-center\"><strong><span><u>J = P . i . n</u></strong></span></p>");
            out.println("<p>Onde:</p>");
            out.println("<p>J = juros</p>");
            out.println("<p>P = principal (capital)</p>");
            out.println("<p>i = taxa de juros</p>");
            out.println("<p>n = número de períodos</p>");
            out.println("<p>Ao somarmos os juros ao valor principal temos o montante.</p>");
            out.println("<p>Montante = Principal + Juros</p>");
            out.println("<p>Montante = Principal + ( Principal x Taxa de juros x Número de períodos )</p>");
            out.println("<br/> ");
            out.println("<p class=\"text-center\"><strong><u><span>M = P . ( 1 + ( i . n ) )</u></strong></span></p>");
            out.println("</div>");
            out.println("<div id=\"menu1\" class=\"tab-pane fade\">");

            out.println("<h2><a href=\"JurosComposto\">Juros Composto</a></h2>");
            out.println("<p>O regime de juros compostos é o mais comum no sistema financeiro e portanto, o mais útil para cálculos de problemas do dia a dia. Os juros gerados a cada período são incorporados ao principal para o cálculo dos juros do período seguinte.</p>");
            out.println("<p>Chamamos de capitalização o momento em que os juros são incorporados ao principal.</p>");
            out.println("<p>Após três meses de capitalização, temos:</p>");
            out.println("<p> 1º mês: M =P.(1 + i)</p>");
            out.println("<p>2º mês: o principal é igual ao montante do mês anterior: M = P x (1 + i) x (1 + i) </p>");
            out.println("<p>3º mês: o principal é igual ao montante do mês anterior: M = P x (1 + i) x (1 + i) x (1 + i)</p>");
            out.println("<p>Simplificando, obtemos a fórmula:</p>");
            out.println("<p class=\"text-center\"><span><strong><u> M = P . (1 +  i)n</u></strong></span></p>");
            out.println("<p>Importante: a taxa i tem que ser expressa na mesma medida de tempo de n, ou seja, taxa de juros ao mês para n meses.</p>");
            out.println("<p>Para calcularmos apenas os juros basta diminuir o principal do montante ao final do período:</p>");
            out.println("<p class=\"text-center\"><span><strong><u>J = M - P</u></strong></span></p>");
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
