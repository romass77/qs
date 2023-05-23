
package lt.bit.qs.controllers;

import lt.bit.qs.dao.ReportDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("form")
public class InputController {
    
    
     @Autowired
    private ReportDAO reportDAO;
    
     @GetMapping("form")
    public String index() {
        return "form";
    }
}
