package proiect.client.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import proiect.business.control.ReportService;
import proiect.persistence.entity.Report;
import proiect.persistence.entity.Skill;

import java.util.List;

@RestController
@RequestMapping("report")
public class ReportResource {
    @Autowired
    ReportService rs = new ReportService();

    @RequestMapping(path = "/findAll", method = RequestMethod.GET)
    public List<Report> findall() {
        return rs.getReportData();
    }
}
