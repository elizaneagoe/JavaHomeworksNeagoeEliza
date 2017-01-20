/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebooksstore;

/**
 *
 * @author Lizuca
 */
public interface BookManagement {
    public void add (Book book);
    public void delete (String isbn);
    public void list();
}
