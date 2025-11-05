package intterfa;


class driver extends Car
	{

		@Override
		public void start() {
			System.out.println("grrrrrrrrrr");
		}

		@Override
		public void increaseSpeed() {
			System.out.println("100kmp");
		}

		@Override
		public void stop() {
			System.out.println("apply break");
		}
		public static void main(String[] args) {
			brandname();
		}
	}

