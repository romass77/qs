
package lt.bit.qs.controllers;


import lt.bit.qs.dao.ReportDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("report")
public class ReportController {
    
       @Autowired
    private ReportDAO reportDAO;

    @GetMapping("reports_list") 
    public ModelAndView sarasas() {
        ModelAndView mav = new ModelAndView("reports");
        mav.addObject("list", reportDAO.findAll());
        return mav;

    }
    
}
