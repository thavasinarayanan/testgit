
public class Test {
  public static void main(String args[]){
	  Integer a=10,b=11;
	  if(a==b){
		  System.out.println("so a=b");
	  }else{
		  System.out.println("value is false");
	  }
	  
	  if(a++==b&&a==--b){
		  System.out.println("i think");
	  }else{
		  System.out.println(b);
	  }
	  
	  System.out.println("test2 completed");
	  String s="";
	  if(s!=null && s.length()>0)
	  {
		  System.err.println("its not empty");
	  }
	  else{
		  System.err.println("its empty");
	  }
  }
}
