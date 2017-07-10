public class Percent {

 public static double getPercent(Employee e){
     if (e instanceof Manager){
          return 0.01;
     }else if (e instanceof Director){
          return 0.02;
     }else {
          return 0.03;
     }
   }
 }