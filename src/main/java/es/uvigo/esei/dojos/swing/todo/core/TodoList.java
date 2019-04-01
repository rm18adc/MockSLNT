package es.uvigo.esei.dojos.swing.todo.core;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jdk.nashorn.internal.parser.TokenType;

public class TodoList implements Iterable<String>{

	private List<String> list = new LinkedList<>();
        private List<String> copylist = new LinkedList<>();
        private String DeletedEntry;
        public boolean DuplicateEntry;

	public void moveUp(int i) {
		if (i > 0) {
			String swap = this.list.get(i-1);
			this.list.set(i-1, this.list.get(i));
			this.list.set(i, swap);
		}
	}
	
	public void moveDown(int i) {
		if (i < this.list.size() - 1) {
			String swap = this.list.get(i+1);
			this.list.set(i+1, this.list.get(i));
			this.list.set(i, swap);
		}
	}
	
	public void add(String item) {
                CheckEntry(item);
                if (DuplicateEntry == false){
                this.list.add(item);
            }
           this.DuplicateEntry = false;    
	}
	            
	public void editAt(int i, String newValue){
		if (i >= 0 && i < this.list.size()) {
			this.list.set(i, newValue);
		}
	}
	
	public void removeAt(int i) {
		if (i >= 0 && i < this.list.size()) {
                        DeletedEntry = list.get(i);
			this.list.remove(i);
		}
	}
        
		
	public int size() {
		return list.size();
	}
	
	public String elementAt(int i) {
		return list.get(i);
	}

//******** Mock Test Programming ***********************************************       
        public void addAll() {
            if(this.DeletedEntry != null){
              this.add(DeletedEntry); 
            }
            else {
               this.list.addAll(this.copylist); 
            }       
            
            
        }   
        public void removeAll() {
            this.DeletedEntry = null;
            List<String> copy = new LinkedList<>(this.list);
                this.copylist = copy;
		this.list.removeAll(list);
	}        
        
        public String CheckEntry(String entry1){
            String result = null;
            for (String entry2 : this.list) {
                if (entry2.equals(entry1)) {
                    result = entry2;
                    this.DuplicateEntry = true;
                    break;
                    
                }
            }
            return result;
        }
        
        public void ConvertToUppercase(int i){
                String newValue;
            	if (i >= 0 && i < this.list.size()) {
                    newValue = list.get(i);
                    this.list.set(i, newValue.toUpperCase());
		}
            
        }

        public void ConvertToLowercase(int i){
                String newValue;
            	if (i >= 0 && i < this.list.size()) {
                    newValue = list.get(i);
                    this.list.set(i, newValue.toLowerCase());
		}
            
        }        
        
        public boolean CheckDuplicateEntry(){
            return DuplicateEntry;
        }
        
//      Mock Testing ***********************************************************        
        
        @Override
        public String toString()
        {
        String retval = "";
        if (size()==0) return "";
        for (String s:list) retval+=s+",";
        return retval.substring(0,retval.length()-1);
        }
	
	@Override
	public Iterator<String> iterator() {
		return list.iterator();
	}

    private void If(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
