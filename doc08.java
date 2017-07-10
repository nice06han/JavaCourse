public class Manager extends Employee {
 private String depto;
 
 @Override
 public String getDetails() {
	return super.getDetails () +" Dept: " + depto;
}