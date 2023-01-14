  class Ml {
	void method1()
	{
		System.out.println("Method1");
	}
  }
    class Multi extends Ml{
		void method2()
		{
			System.out.println("Method2");
		}
   }
    	class Multilevel extends Multi
	{
		void method3()
		{
			System.out.println("Method3");
		}
	
	}
    public class MultiLevelInheritance{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multilevel l1= new Multilevel();
		l1.method1();
		l1.method2();
		l1.method3();
		
	}

}

