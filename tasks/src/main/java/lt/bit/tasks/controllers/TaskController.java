
package lt.bit.tasks.controllers;

import lt.bit.tasks.dao.TaskDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("task")
public class TaskController {
    
    
    @Autowired
    private TaskDAO taskDAO;
    
    
    @GetMapping("task_list")
    public ModelAndView sarasas() {
        ModelAndView mav = new ModelAndView("tasks");
        mav.addObject("list", taskDAO.findAll());
        return mav;
    }
    
}
