class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
}
public class GenericJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
  
        // instance of String type
        Test<String> sObj = new Test<String>("Generic Class In Java");
        System.out.println(sObj.getObject());
	}

}
