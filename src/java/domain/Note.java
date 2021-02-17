/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author 735815
 */
public class Note {
    
    private String title;
    
    private String comments;
    
    
    public Note() {
        
        this.title= "";
        this.comments= "";
               
    }
    
    
    public Note (String title, String comments)  {
        
        this.title= title;
        this.comments= comments;    
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public String getComments() {
        return comments;
    }
    
   
    
}
