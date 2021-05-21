/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.print.Book;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import model.librarytesting;
/**
 *
 * @author Asus
 */
public class libraryTest {
    
    librarytesting l;
    
    public libraryTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        l=new librarytesting();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testgetbookdetails(){
      String bookdetail="Book Name: Jumanji, Author Name: Katrina";
      assertEquals(bookdetail, l.getbookdetails("Jumanji", "Katrina"));
    }
    
    @Test
    public void testgetNewbook(){
      String book="VhuterVhoy";
      assertEquals(book, l.getNewbook("VhuterVhoy"));
    }
    
    @Test
    public void testgetStudent(){
      assertEquals("Arafat", l.getNewbook("Arafat"));
    }
    
    @Test
    public void testissueDate(){
      String issue="13/4/2021";
      assertEquals(issue, l.issueDate(13, 4, 2021));
    }
    
    @Test
    public void testdeadline(){
      String dead="16/4/2021";
      assertEquals(dead, l.deadline(16, 4, 2021));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
