package designPatterns;

public class SingletonDesignPattern {
	// Classical Java implementation of singleton
	// design pattern
	class Singleton
	{
		private Singleton TAXI;

		private Singleton() {}

		public Singleton getInstance ()
		{
			if (TAXI==null)
				TAXI = new Singleton();
			return TAXI;
		}
	}
}