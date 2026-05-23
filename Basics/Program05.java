class Program05{
	public static void mohan(){
		System.out.println("I'm Mohan");
		System.out.println("I'm Singing Song");
		System.out.println("Chalo ek baar phir se ajnabi ban jaye ham dono...");
		System.out.println("=====Thank You! Song Ends!!=====");
	}
	public static void main(String[] args){
		System.out.println("I'm Main of Program1");
		sohan("Ye Sham Mastani...");
		mohan();
		sohan("Pardesi pardesi Jana nai...");
		mohan();
	}
	public static void sohan(String song){
		System.out.println("I'm Sohan");
		System.out.println("I'm Singing Song");
		System.out.println(song);
		System.out.println("=====Thank You! Song Ends!!=====");
	}
}
