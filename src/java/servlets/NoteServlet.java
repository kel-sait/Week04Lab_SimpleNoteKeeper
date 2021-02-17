package servlets;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
        
import domain.Note;

/**
 *
 * @author 735815
 */
public class NoteServlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
try {
    
    if(request.getParameter("edit").equals("")){
          getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(request, response);
}

}          
catch (Exception e) {
                
                String path = getServletContext().getRealPath("/WEB-INF/note.txt");
                
                
                    
// to read files
BufferedReader br = new BufferedReader(new FileReader(new File(path)));

String title = br.readLine();
String comments = br.readLine();


br.close();
Note note = new Note (title, comments);


   
   getServletContext().setAttribute("note", note);
   getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);

            // return will stop the code call
              // return;     
            // in most cases, you should not be running code after a JSP is called.
         
    }
           }


            
            

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


String path = getServletContext().getRealPath("/WEB-INF/note.txt");

// to write to a file
PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 

 // grab the parameters from the incoming form fields
        String titlehere = request.getParameter("titlehere");
        String commentshere = request.getParameter("commentshere");


pw.write(titlehere);
pw.write(commentshere);
pw.close();

Note note = new Note (titlehere, commentshere);

getServletContext().setAttribute("note", note);
    getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
