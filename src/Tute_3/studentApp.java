package Tute_3;



public class studentApp {
	public static void main(String [] args) {
		Student [] arr1=new Student[5];
		arr1[0]=new Student("amal","it","0988757677");
		arr1[1]=new Student("nimal","engi","0988757677");
		arr1[2]=new Student("sunimal","it","076771223");
		arr1[3]=new Student("kamal","tech","0775365688");
		arr1[4]=new Student("ranamal","math","075767755");;
	
		//this is another way same question in 2 times so watch the other one at lab 4
		//it is done by sir
		 for (int i = 0; i < arr1.length; i++)
		System.out.println("Element at " + i + " : "+ arr1[i].name + " "+ arr1[i].degree+" "+arr1[i].mobile);
	}
		
		/*Student s=new Student();
		s.setName("amal");
		s.setDegree("it" );
		s.setMobile("0777786788");
		s.print();*/
	}

