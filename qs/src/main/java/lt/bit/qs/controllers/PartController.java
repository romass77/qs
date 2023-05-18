package lt.bit.qs.controllers;

import lt.bit.qs.dao.PartDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("part")
public class PartController {

    @Autowired
    private PartDAO partDAO;

    @GetMapping("parts_list") 
    public ModelAndView sarasas() {
        ModelAndView mav = new ModelAndView("parts");
        mav.addObject("list", partDAO.findAll());
        return mav;

    }
}
