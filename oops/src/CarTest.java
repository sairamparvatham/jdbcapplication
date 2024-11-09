
public class CarTest {
	public static void main(String[] args) {
		Address ak=new Address("thenali","andrapradhesh","india");
		Address ak1=new Address("vijayawada","andrapradhesh","india");
		Address[] krr= {ak,ak1};
		Address ar=new Address("suryapet","telangana","india");
		Address ar1=new Address("hyderabad","telangana","india");
		Address[] arr= {ar,ar1};
		Driver d=new Driver("akram",5,"male",krr);
		Driver d1=new Driver("arun kumar",6,"male",arr);
		Driver[] drr= {d,d1};
		Car c=new Car("maruthi","nexa","ap 09 2546",drr);
		c.display();
	}
}
