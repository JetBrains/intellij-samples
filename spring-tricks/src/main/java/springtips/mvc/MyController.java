package springtips.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping("/myPath")
    public ModelAndView perform() {
        ModelAndView mv = new ModelAndView("myView");
        mv.addObject("anAttributeForJSP", "old school");
        return mv;
    }

    @RequestMapping("/myPath2/{id}")
    public ModelAndView requestMappingWithPathVariable(@PathVariable int id) {
        System.out.println("request ID: " + id);

        ModelAndView mv = new ModelAndView("freemarkerView");
        mv.addObject("myControllerAttribute", "something");
        return mv;
    }
}
