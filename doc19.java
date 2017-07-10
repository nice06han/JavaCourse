public class Example {
 public static void main(String[] args){
 Set<String> set = new TreeSet<>();
 set.add("one");
 set.add("two");
 set.add("three");
 set.add("three"); // not added, we can only add not repeated values

 for (String number:set){ 
	System.out.println("Number: " + number);
 }

}

}