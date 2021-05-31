package ArithmeticCServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author brixa
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//This will display the requesteed JSP as a view
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
         //Capture the parameters from the POST request
        String firstinput = request.getParameter("firstAC");
        String secondinput = request.getParameter("secondAC");
        
        String button = request.getParameter("button");

        //set the attributes for the JSP
        request.setAttribute("firstNumber", firstinput);
        request.setAttribute("secondNumber", secondinput);

        
         if (firstinput == null || firstinput.equals("") || secondinput == null || secondinput.equals("")) {
            
            //Create a helpful message to send to the user
            request.setAttribute("message", "Invalid");
            //forward the request and response objects to the JSP
            //display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;//Very important! Stop the code call.
        }
         
         else if (firstinput.matches("[A-Za-z]{1,10}") || secondinput.matches("[A-Za-z]{1,10}")) {
             //Create a helpful message to send to the user
                request.setAttribute("message", "Invalid");
            
            //forward the request and response objects to the JSP
            //display the agecalculator again
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;//Very important! Stop the code call.
            }
         
         else if ("button1".equals(button)) {
             //Store the inputs into variables input1 and input2
             int input1 = Integer.parseInt(firstinput);
             int input2 = Integer.parseInt(secondinput);
             
             int calculation = input1 + input2;
             
             request.setAttribute("message", calculation);
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return;
         }
         else if ("button2".equals(button)) {
              //Store the inputs into variables input1 and input2
             int input1 = Integer.parseInt(firstinput);
             int input2 = Integer.parseInt(secondinput);
             
             int calculation = input1 - input2;
             
             request.setAttribute("message", calculation);
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return;
         }
         else if ("button3".equals(button)) {
              //Store the inputs into variables input1 and input2
             int input1 = Integer.parseInt(firstinput);
             int input2 = Integer.parseInt(secondinput);
             
             int calculation = input1 * input2;
             
             request.setAttribute("message", calculation);
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return;
         }
         else if ("button4".equals(button)) {
              //Store the inputs into variables input1 and input2
             int input1 = Integer.parseInt(firstinput);
             int input2 = Integer.parseInt(secondinput);
             
             int calculation = input1 % input2;
             
             request.setAttribute("message",calculation);
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return;
         }
         
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
    }

}
