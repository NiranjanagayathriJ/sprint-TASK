package interfaceAbstract;

public interface ProductsAvailable extends Amount{
	public void name();
	public default void cart(int items) {
		System.out.println("Total number of items in cart:"+items);
	}
}
