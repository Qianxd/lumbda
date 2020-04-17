public class App {

	public static void main(String [] args) {
		IMarkUp mu = (message) -> System.out.println(message);

		mu.markUp("lambda!");
	}
}

// 函数式接口
interface IMarkUp {
	void markUp(String msg);
}