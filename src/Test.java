
import java.util.*;

class Student implements Comparable<Student>{
    int id;
    int rollno;
    String name;
    public Student(int id, int rollno, String name){
    	this.id=id;
        this.rollno=rollno;
        this.name=name;
    }
    public int compareTo(Student s){
        if(this.id<s.id){
            return 1;
        }else if(this.id>s.id){
            return -1;
        }else  return 0;
    }
    public String toString(){
        return "id:"+id+"  rollno:"+rollno+"  name:"+name+"";
    }
}

public class Test {
		 public static void main(String[] args) {
	
			   String str="java*&$%";
		        char[] arr=str.toCharArray();
		        int i=0;
		        int j=arr.length-1;
		        
		        while(i<j){
		            if(Character.isAlphabetic(arr[i])) i++;
		            else if(Character.isAlphabetic(arr[i])) j--;
		            else {
		                char ch = arr[i];
		                arr[i]=arr[j];
		                arr[j]=ch;
		                i++;
		                j--;
		            }
		        }
		        String reverString=new String(str);
		        System.out.println(reverString);
	}
	
}
