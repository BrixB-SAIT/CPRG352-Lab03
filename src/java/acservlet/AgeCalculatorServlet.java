
package acservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //This will display the requesteed JSP as a view
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Capture the parameters from the POST request
        
        String age = request.getParameter("ageC");
        
        //set the attributes for the JSP
        request.setAttribute("ageCalculator", age);
        
        
        if(age == null || age.equals("")) {
            //Create a helpful message to send to the user
            request.setAttribute("message", "You must give your current age.");
            
            //forward the request and response objects to the JSP
            //display the agecalculator again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;//Very important! Stop the code call.
        }
        
        else if (age.matches("[A-Za-z]")) {
             //Create a helpful message to send to the user
                request.setAttribute("message", "You must give your current age.");
            
            //forward the request and response objects to the JSP
            //display the agecalculator again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;//Very important! Stop the code call.
            }
         
        else {
            int ageinput = Integer.parseInt(age);
            int ageCalculate = ageinput + 1;
            request.setAttribute("message", "Your age next birthday will be " + ageCalculate);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }



}
