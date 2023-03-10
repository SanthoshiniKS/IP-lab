/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Product;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

/**
 *
 * @author ELCOT
 */
public class Product extends HttpServlet {

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
        HttpSession ht = request.getSession();
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Product</title>");
            out.println("</head>");
            out.println("<body>");
            if (request.getParameter("b1") != null) {
                out.println("<body style='background-color: peachpuff'></body>");
                out.println("<h1 style='color:white;text-align:center;background-color:firebrick'>CHOCLATE</h1>");
                out.println("<img src='choc.jpg' style='float:left' width='300px' height='250px'>");
                out.println("<p style='font-size:large'><br>Choclates are very delicious snack."
                        + "Most of the children in the world like choclates because of their sweetness.<br><br>"
                        + "Chocolate is a food made from roasted and ground cacao seed kernels that is available as a liquid, solid, or paste, either on its own or as a flavoring agent in other foods.<br><br>"
                        + "The antioxidants in dark chocolate have been shown to lower blood pressure, reduce the risk of clotting and increase blood circulation to the heart, thus lowering the risks of stroke, coronary heart disease and death from heart disease.<br><br>"
                        + " Flavonols prevent the immune system from going into overdrive and reduce oxidative stress, which is an imbalance caused by cells fighting against free radicals and a common cause of many diseases."
                        + "</p>");
            }
            if (request.getParameter("b2") != null) {
                out.println("<body style='background-color:violet ;color:darkmagenta'></body>");
                out.println("<h1 style='color:snow;text-align:center;background-color:purple'>PEN</h1>");
                out.println("<img src='pen.jpg' style='float:left' width='300px' height='250px'>");
                out.println("<p style='font-size:x-large'>A pen is a universal tool used for writing on paper. A pen has a plastic body called a barrel, a tip, an ink reservoir or chamber, and a cap. Different colours of ink can be used in a pen to write.<br> A significant phrase related to it is <b>“Pen is mightier than the sword”</b>. <br>"
                        + "\n It is used to write in paper.\n Nowadays, there are various types of pens."
                        + "<br>They can be very useful, and whether you're at school, home, office or college, they're essential for drafting documents, jotting down notes, writing essays or giving examinations. Even though technological advancements continue to change the way we work, pens have remained to be indispensable."
                        + "<br>Pens can symbolize a number of big ideas: freedom, intelligence, creativity, professionalism, determination, diligence, etc. As gifts, pens can symbolize the value you have for your gift recipient's freedom of thought."
                        + "That's why pens are traditionally given as graduation gifts.</p>");
            }
            if (request.getParameter("b3") != null) {
                out.println("<body style='background-color: pink'></body>");
                out.println("<h1 style='background-color:magenta;color:snow;text-align:center'>BOOKS</h1>");
                out.println("<img src='book.jfif' style='float:left' width='300px' height='250px'>");
                out.println("<p style='font-size:large'>A book is a medium for recording information in the form of writing or images,"
                        + " typically composed of many pages (made of papyrus, parchment, vellum, or paper) "
                        + "bound together and protected by a cover.<br> The technical term for this physical arrangement "
                        + "is codex (plural, codices). <br>In the history of hand-held physical supports for extended written"
                        + " compositions or records, the codex replaces its predecessor, the scroll. A single sheet in a codex "
                        + "is a leaf and each side of a leaf is a page.<br>"
                        + "The ability to concentrate and focus for long periods is an essential skill for any student. <br>"
                        + "As a result of constant multitasking, notifications, and social media apps, this skill is becoming increasingly rare.<br><br> A Microsoft study confirms this finding, that people lose focus after only eight seconds. Thankfully, reading allows you to practice focusing on just one thing at a time. Novels, for example, require your full attention to transport you to another world and, in order to get the most out of a non-fiction book, you need to be fully engaged and present.<br> Hence, if you wish to focus more, you can practice by reading books.</p>");
            }
            if (request.getParameter("b4") != null) {
                out.println("<body style='background-color: sandybrown'></body>");
                out.println("<h1 style='text-align:center;color:brown;text-shadow:2px 2px 5px wheat'>MOBILE PHONES</h1>");
                out.println("<img src='mobile.jpg' style='float:left'>");
                out.println("<p style='font-size:large'>A mobile phone is a wireless handheld device that allows users to make and receive calls."
                        + "<br><br> While the earliest generation of mobile phones could only make and receive calls, today’s mobile phones do a lot more, accommodating web browsers, games, cameras, video players and navigational systems.\n"
                        + "<br><br>Also, while mobile phones used to be mainly known as “cell phones” or cellular phones, today’s mobile phones are more commonly called “smartphones” because of all of the extra voice and data services that they offer."
                        + "Life is easier with mobiles. It helps you to communicate with your near and dear ones through calls, video chats, text messages, emails.<br><br> Apart from that, it helps you to book a cab, show the map direction, order groceries and many more things. The main advantage of having a mobile is it helps to keep you connected with the entire world irrespective of your location."
                        + "</p>");
            }
            if (request.getParameter("b5") != null) {
                out.println("<body style='background-color: greenyellow'></body>");
                out.println("<h1 style='text-align:center;color:white;background-color:green'>PENDRIVE</h1>");
                out.println("<img src='pendrive.jpg' style='float:left'>");
                out.println("<p style='font-size:large'>* The pen drive is a small removable storage device.<br><br>*A pen drive is a portable storage device that you can use anywhere and connect to any computer system and portable device.\n"
                        + "<br><br>*A portable storage device means a storage device that you can take anywhere very easily and use this pen drive.\n"
                        + "<br>*Pen drive is also known as USB flash drive. <br><br>*Pen drive is very small in appearance and very light in weight. A pen drive weighs less than 30 grams.</p>");
                out.println("<br><br><h2>USE OF PENDRIVES:</h2><hr>");
                out.println("<p style='font-size:large'>There are various uses of pen drives, which are given below.<br>"
                        + "<br>- Personal data transport<br>- Updating motherboard firmware<br>"
                        + "- Booting operating systems <br>- Operating system installation<br>"
                        + "- Backup<br>"
                        + "- Store Digital Data</p>");
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

}
