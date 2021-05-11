package anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class Service {
	
	
	@Value("${classurl}")
	private String url;
	
	@Value("${classusername}")
	private String username;
	
	@Value("${classpassword}")
	private String pass;
	
	
	
public void Someservie()
{
	System.out.println("url of the site="+url+", Usernameofperson= " +username+ " ,Passoword= "+pass);
	
	


}
	

}
