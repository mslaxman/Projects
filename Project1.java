class Employee{
	String Emp_no;
	String Emp_name;
	String join_date;
	char desig_code;
	String dept;
	int basic;
	int hra;
	int it;
	public Employee(String id,String name,String date,char desg,String dept,int basic,int hra,int it){
		Emp_no=id;
		Emp_name=name;
		join_date=date;
		desig_code=desg;
		this.dept=dept;
		this.basic=basic;
		this.hra=hra;
		this.it=it;
		
	}
}
class Project1{
	
	public static void main(String[] as){
		
		Employee[] e=new Employee[7];
		
		//int Emp_no, String Emp_name, String join_date, char desig_code, String dept, int basic, int hra, int it
		
		//Employee table given
		e[0]=new Employee("1001","Ashish","01/04/2009",'e',"R&D",20000,8000,3000);
		e[1]=new Employee("1002","Sushma","23/08/2012",'c',"PM",30000,12000,9000);
		e[2]=new Employee("1003","Rahul","12/11/2008",'k',"Acct",10000,8000,1000);
		e[3]=new Employee("1004","Chahat","29/01/2013",'r',"Front Desk",12000,6000,2000);
		e[4]=new Employee("1005","Ranjan","16/07/2005",'m',"Engg",50000,20000,20000);
		e[5]=new Employee("1006","Suman","1/1/2000",'e',"Manufacturing",23000,9000,4400);
		e[6]=new Employee("1007","Tanmay","12/06/2006",'c',"PM",29000,12000,10000);
		
		String desg="";
		int da=0;
		int flag=0;
		for(Employee i:e){
			if(i.Emp_no.equals(as[0])){
				switch(i.desig_code){
					case 'e':
						desg="Engineer";
						da=20000;
						break;
					case 'c':
						desg="Concusltant";
						da=32000;
						break;
					case 'k':
						desg="Clerk";
						da=12000;
						break;
					case 'r':
						desg="Receptionist";
						da=15000;
						break;
					case 'm':
						desg="Manager";
						da=40000;
						break;
				}
					
				int salary=i.basic + i.hra + da - i.it;
				System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
				System.out.println(i.Emp_no+"\t"+i.Emp_name+"\t\t"+i.dept+"\t\t"+desg+"\t\t"+salary);
				flag++;
				break;
			}
			
		}
		if(flag==0){
			System.out.println("There is no employee with employee id : "+as[0]);
		}	
	}	
}