package Demo2;

public class SonService {
	SonDao dao=new SonDao();
	public  String Add(String s){
		return "SonSerive +" +dao.Add(s);
	}

	public static void main(String[] args) {
		SonService sonService=new SonService();
		String s = sonService.Add("mibeba");
		System.out.println(s);
	}
}
