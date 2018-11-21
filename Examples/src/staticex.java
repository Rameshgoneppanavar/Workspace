
public class staticex {

		int a=5;
		static int b=5;
		public void normalCounter() {
		a++;
		System.out.println("normalCounter : " + a);
		}
		public void staticCounter() {
		b++;
		System.out.println("staticCounter : " + b);
		}
		public static void main(String[] args) {
			staticex c1 = new staticex();
			staticex c2 = new staticex();
			staticex c3 = new staticex();
			staticex c4 = new staticex();
		c1.normalCounter();
		c2.normalCounter();
		c3.normalCounter();
		c4.normalCounter();
		System.out.println("------------------------");
		c1.staticCounter();
		c2.staticCounter();
		c3.staticCounter();
		c4.staticCounter();
		}
		} 


