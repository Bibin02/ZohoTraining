import java.util.*;

public class DAO{

	private static Map <String, String> users;
	private static List <Order> list;
	
	public static boolean loadData(){
		users = FileHandler.loadUsers();
		list = FileHandler.loadOrders();
		return (users != null && list != null);
		
	}

	public User login(String id, String pass){
		DAO dao = new DAO();
		String[] credentials = dao.getUserCredentials(id, pass);
		if (credentials == null){
			return null;
		}
		else if (id.equals(credentials[0]) && pass.equals(credentials[1])){
			return new User(id);
		}
		return null;
	}

	private String[] getUserCredentials(String id, String pass) {
		String[] cred = new String[2];
		
		// Fetching Password.
		cred[0] = id;
		cred[1] = users.get(id);
		if (cred[1] == null){
			return null;
		}
		return cred;
	}

	public boolean createUser(String id, String pass, String loc) {
		users.put(id, pass);
		return FileHandler.uploadUserRecord(users);
	}
	
	public List<Order> getList(){
		return list;
	}
	
}
