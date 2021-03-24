import java.io.Serializable;

	list.stream().filte(emp->emp.getsalry().>1000).foreach(System.out::println())

public class Singelton implements Serializable {
	private static final long SerialVersionUID = 1L;
	private static Singelton singelton = null;

	private Singelton() {
		if (singelton != null) {
			throw new InstantiationError("error object create");

		}
		singelton = this;
		System.out.println("privae constructor");
	}

	private static Singelton getInstance() {
		if (singelton==null) {
			synchronized (Singelton.class) {
				if (singelton==null) {
					singelton=new Singelton();
					
				}
				
			}
			return singelton;
			
		
	}else

	{
		return singelton;
	}

}
