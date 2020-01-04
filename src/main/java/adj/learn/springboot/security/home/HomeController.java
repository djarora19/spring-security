package adj.learn.springboot.security.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
	@GetMapping("/")
	public String getDefaultMessage()
	{
		return ("<h1>Welcome</h1>");
	}
	
	@GetMapping("/admin")
	public String greetAdmin()
	{
		return ("<h1>Welcome Admin</h1>");
	}
	
	@GetMapping("/users")
	public String greetUsers()
	{
		return ("<h1>Welcome User</h1>");
	}
}