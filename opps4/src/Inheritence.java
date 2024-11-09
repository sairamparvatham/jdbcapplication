
public interface Inheritence {
	interface A{
		
	}
	interface x extends A{
		void m1();
	}
	interface y extends x{
		void m1();
	}
	interface z extends x,y{
		
	}
	class Employee{}
	class XYZ extends Employee implements x,y{
		@Override
		public void m1() {
			
		}
	}
}
