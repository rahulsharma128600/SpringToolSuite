package study.mvc;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyWebController {
	
	public MyWebController()
	{
		System.out.println("Controller is created");
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String f1()
	{
		System.out.println("Mapping function f1() is called");
		return "hello";
	}
	
	@GetMapping(value="/welcome")
	public String f2(@RequestParam("uname") String name ) //"uname" of request parameter will get stored in "name"
	{
		System.out.println("Mapping function f2() is called");
		System.out.println("Server got "+name);
		return "hi";
	}
	
    @GetMapping(value="/input")
 	public String f3()
	{
		return "input";
	}
    
    @PostMapping(value="/showTable")  //URL
    public String f4(Model model, @RequestParam int num) //as we are giving the same name "num" here as that of form name "num" so no need to keep it in (""),unlike above f2() 
    {
    	ArrayList<String> al = TableGen.getTable(num);
    	model.addAttribute("list", al);  //Model--> it is added to the request and forwarded with return "table"
    	
    	return "table";  //view map
    }
    
    @GetMapping(value="/showChars")
    public String f5(Model model, @RequestParam String line)
    {
    	ArrayList<String> al = new ArrayList<>();
    	for(int i=0; i<line.length(); i++)
    	{
    		al.add(""+line.charAt(i));
    	}
    	model.addAttribute("list", al);
    	return "table";
    }
    
    @GetMapping(value="/showchars")
    public ModelAndView f6(ModelAndView mv, @RequestParam String line)
    {
    	ArrayList<String> al = new ArrayList<>();
    	for(int i=0; i<line.length(); i++)
    	{
    		al.add(""+line.charAt(i));
    	}
    	mv.addObject("list", al);
    	mv.setViewName("table");
    	
    	return mv;  //returning to spring container
    }
}
