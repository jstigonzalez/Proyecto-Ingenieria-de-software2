package co.edu.poli.Pasaporte.Repositorio;

public interface Crud<T> {

	
    public void create_T(T obj); 
    
    

    public T read_T(String id);    
    
   
    
    public void update_T(T obj);   
    
    
    
    public void delete_T(String id); 

}