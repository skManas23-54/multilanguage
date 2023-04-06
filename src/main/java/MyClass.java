import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyClass {
        public MyClass(){
            System.out.println("gg");
        }
       public Logger log(){
               return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
       }
        }


