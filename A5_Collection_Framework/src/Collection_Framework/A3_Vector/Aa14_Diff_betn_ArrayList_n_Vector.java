package Collection_Framework.A3_Vector;
/*


          ArrayList                    |            Vector
---------------------------------------|---------------------------------------------------------
1) ArrayList was introduced in JDK 1.2 |1) Vector was introduced in JDK 1.0
   version                             |   version
                                       |
2) ArrayList is not legacy class       |2) Vector is legacy class
                                       |
3) ArrayList are non-synchronized      |3) Vector are synchronized collection                                                                              
   collection                          |
4) ArrayList is not thread-safe        |4) Vector is thread-safe
                                       |
5) In case of ArrayList, application   |5) In case of Vector, application 
   speed is fast                       |   speed is slow        
                                       |
6) ArrayList does not guarantee for    |6) Vector provides the guarantee for
   data consistency                    |   data-consistency
                                       |
7) In case of ArrayList                |7) In case of Vector
   newcapacity = (old-capacity*3)/2+1; |   newcapacity = (oldcapacity * 2);  
                                       |
8) ArrayList does not provide any      |8) Vector class provides a method
   method to find its capacity         |   i.e "intcapacity()" to find the                                                                                                                                       
                                       |   the capacity of Vector


*/