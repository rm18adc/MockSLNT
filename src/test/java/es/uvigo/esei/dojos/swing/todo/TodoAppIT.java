/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.dojos.swing.todo;

import es.uvigo.esei.dojos.swing.todo.core.TodoList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sures
 */
public class TodoAppIT {
    
    public TodoAppIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class TodoApp.
     */
    
//**************Mock test testcases *******************************************
     
    @Test
    public void addentry(){
        TodoList list = new TodoList();
        String ExpEntry;
        ExpEntry = "Suresh";
        list.add(ExpEntry);
        ExpEntry = "Sravya";
        list.add(ExpEntry);
        int i = list.size();
        i = i - 1;
        String Actual = list.elementAt(i);
        assertEquals(ExpEntry, Actual);
        System.out.println("test passed");
        
    }
    
    @Test
    public void checkentry(){
       TodoList list = new TodoList(); 
       String Entry;
       Entry = "Suresh"; 
       list.add(Entry);
       Entry = "Sravya"; 
       list.add(Entry);
       String Actual = list.CheckEntry(Entry);
       assertEquals(Entry, Actual);
       System.out.println("Entry found");
          
    }
    @Test
    public void PreventDuplicateEntry(){
       TodoList list = new TodoList(); 
       String Entry;
       Entry = "Suresh"; 
       list.add(Entry);
       Entry = "Suresh"; 
       list.add(Entry);
       boolean exist = list.CheckDuplicateEntry();
       assertTrue(exist); //exist = true
       System.out.println("Duplicate is not possible");
          
    }    
    
//************Mock Test Testcases*******************************************
    
    
    
}
