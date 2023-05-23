package lt.bit.qs.controllers;

import java.text.ParseException;
import java.util.Date;
import java.util.Optional;
import lt.bit.qs.dao.PartDAO;
import java.text.SimpleDateFormat; 
import lt.bit.qs.dao.ReportDAO;
import lt.bit.qs.dao.RevisionDAO;
import lt.bit.qs.dao.SupplierDAO;
import lt.bit.qs.dao.UserDAO;
import lt.bit.qs.data.Part;
import lt.bit.qs.data.Report;
import lt.bit.qs.data.Revision;
import lt.bit.qs.data.Supplier;
import lt.bit.qs.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("report")
public class ReportController {
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    private ReportDAO reportDAO;
    private PartDAO partDAO;
    private UserDAO userDAO;
    private SupplierDAO supplierDAO;
    private RevisionDAO revisionDAO;
    

    @GetMapping("reports_list")
    public ModelAndView sarasas() {
        ModelAndView mav = new ModelAndView("reports");
        mav.addObject("list", reportDAO.findAll());
        return mav;

    }

    @GetMapping("edit")
    public ModelAndView edit(@RequestParam(value = "id", required = false) Integer id) {
        ModelAndView mav;
        if (id == null) {
            mav = new ModelAndView("report");
        } else {
            Optional<Report> oReport = reportDAO.findById(id);
            if (oReport.isPresent()) {
                mav = new ModelAndView("report");
                mav.addObject("value", oReport.get());
            } else {
                mav = sarasas();
            }
        }
        return mav;
    }

    @PostMapping("save")
    @Transactional
    public ModelAndView save(
            @RequestParam(value = "idreport", required = false) Integer idreport,
            @RequestParam("reportnumber") Integer reportnumber,
            @RequestParam("drawing") String drawing,
          @RequestParam("revision") String revision,
            @RequestParam("ponumber") String ponumber,
            @RequestParam("date") String date,
            @RequestParam("quantaty") Integer quantaty,
            @RequestParam("user") Integer user,
            @RequestParam("supplier") Integer supplier
    ) {
        if (idreport == null) {
            Report r = new Report();
            r.setReportnumber(reportnumber);

            Part p = new Part();
            p.setDrawing(drawing);
            
            Revision rev = new Revision();
            rev.setRevision(revision);

            r.setPonumber(ponumber);
            
           try {
                r.setDate(sdf.parse(date));
            } catch (ParseException ex) {
                r.setDate(null);
            }
          
            r.setQuantaty(quantaty);

            User u = new User();
            u.setIduser(user);

            Supplier s = new Supplier();
            s.setIdsupplier(supplier);

            reportDAO.save(r);
            partDAO.save(p);
            revisionDAO.save(rev);
            userDAO.save(u);
            supplierDAO.save(s);
          
        } else {
            Optional<Report> oReport = reportDAO.findById(idreport);
            if (oReport.isPresent()) {
                Report r = oReport.get();
           r.setReportnumber(reportnumber);

            Part p = new Part();
            p.setDrawing(drawing);
            
            Revision rev = new Revision();
            rev.setRevision(revision);

            r.setPonumber(ponumber);
            
           try {
                r.setDate(sdf.parse(date));
            } catch (ParseException ex) {
                r.setDate(null);
            }
          
            r.setQuantaty(quantaty);

            User u = new User();
            u.setIduser(user);

            Supplier s = new Supplier();
            s.setIdsupplier(supplier);

            reportDAO.save(r);
            partDAO.save(p);
            revisionDAO.save(rev);
            userDAO.save(u);
            supplierDAO.save(s);
            }
        }
        return sarasas();
    }

}
