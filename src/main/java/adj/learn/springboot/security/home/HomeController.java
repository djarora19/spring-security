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
}