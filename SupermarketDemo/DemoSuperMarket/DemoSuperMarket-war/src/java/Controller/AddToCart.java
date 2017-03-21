/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.CartItem;
import entity.Products;
import entity.ProductsFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dang Hoang
 */
@WebServlet(name = "AddToCart", urlPatterns = {"/AddToCart"})
public class AddToCart extends HttpServlet {
    @EJB
    private ProductsFacadeLocal productsFacade;

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
        PrintWriter out = response.getWriter();
        
        // Khoi tao session de luu tru hang;
        HttpSession session = request.getSession();
        int productId = Integer.parseInt(request.getParameter("proID"));
        
        HashMap itemArray = new HashMap();
        Products product = (Products)productsFacade.find(productId);
        if(product != null){
            CartItem cartItem = new CartItem(product.getProductID(),product.getProductNameVn(),product.getProductImage(),product.getProductPrice());
            itemArray.put(String.valueOf(productId), cartItem);
        }
        if(session.getAttribute("cart") !=null){
            HashMap<String,CartItem> sessionMap = (HashMap<String,CartItem>)session.getAttribute("cart");
            if(sessionMap.containsKey(String.valueOf(productId))){
                int quantity = sessionMap.get(String.valueOf(productId)).getQuantity();
                sessionMap.get(String.valueOf(productId)).setQuantity(++quantity);
            }else{
                sessionMap.putAll(itemArray);
            }
            session.setAttribute("cart",sessionMap);
        }else{
            session.setAttribute("cart", itemArray);
        }
        request.setAttribute("list",productsFacade.findAll());
        request.getRequestDispatcher("home.jsp").forward(request, response);
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
