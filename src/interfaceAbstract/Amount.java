package interfaceAbstract;

public interface Amount {
	public static void amount(int items,int amount) {
		amount=items*500;
		System.out.println("Total amount:"+amount);
	}
}
