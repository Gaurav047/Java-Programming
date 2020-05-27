package gamingConsole.interfaces;

public class Project {

	interface Test {
		void nothing();

		default void nothing1() {

		}
	}

	class Class1 implements Test {

		@Override
		public void nothing() {
			// TODO Auto-generated method stub

		}

	}

}
