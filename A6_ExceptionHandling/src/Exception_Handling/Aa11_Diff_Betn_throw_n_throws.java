/*
 
 Difference Between throw and throws keyword:
 
        throw keyword              |         throws keyword
-----------------------------------|--------------------------------------------       
 1. It is used for creating        |   1.  It is use to declare
    customized Exception           |       the Exception
       OR                          |           OR
    throw keyword is used to       |       throws keyword is used               
    create an Exception object     |       to declare the Exception              
    manually i.e. normally         |       i.e. it indicates the caller                        
    method creates an Exception    |       method that given Exception                                   
    object as Exception occurs     |       can occur so we have to                               
    in that method, but when       |       handle it either using                            
    we use throw, programmer       |       try catch block or again
    is responsible to create       |       declare it by using
    an Exception object.           |       throws keyword.
                                   |
 2. throw keyword is mainly used   |    2. throws keyword is mainly
    for runtime Exceptions or      |       used for compile time
    unchecked Exceptions.          |       Exceptions or checked
                                   |       Exceptions.    
                                   |       
 3. In case of throw keyword       |    3. In case of throws keyword
    we can throw or create         |       we can declare multiple 
    only single Exception          |       Exceptions 
    or single Exception object.    |       e.g: 
                                   |       void readFile() 
                                   |       throws FileNotFoundException, 
                                   |       NullPointerException // etc
                                   |       {
                                   |       
                                   |       }
       OR                          |            OR
    Used for single Exception      |       Used for multiple Exceptions
                                   | 
 4. throw keyword is used          |    4. throws keywords is used along
    inside method                  |       with method next to method name
       OR                          |            OR
    throw keyword is used          |       throws keyword is used with                   
    with the method.               |       method signature. 
                                   | 
 5. throw keyword is followed      |     5. throws kewyword is followed by
    by new instance i.e. object    |        class                                     
    e.g:                           |        e.g:
    throw new className();         |        void methodName() throws className
                                   |         {
                                   |         
                                   |         }
                                   |         
 6. We cannot write any statement  |     6. throws keyword does not have any
    after throw keyword and        |        such rule.
    thus it can be used to break   |
    the statement.                 |                 
                                   |       
                                          
 */

package Exception_Handling;

public class Aa11_Diff_Betn_throw_n_throws {

}
