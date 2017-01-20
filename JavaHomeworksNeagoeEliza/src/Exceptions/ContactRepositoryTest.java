/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Lizuca
 */
public class ContactRepositoryTest {
    public static void main(String[] args) {
 ContactRepository repo = new ContactRepository("x:\\file.csv");
 repo.saveContact("Adrian", "123");
}

}
