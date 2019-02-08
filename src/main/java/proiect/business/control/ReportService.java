package proiect.business.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proiect.persistence.entity.Report;
import proiect.persistence.entity.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportService {

    @Autowired
    UserService us = new UserService();

    public List<Report> getReportData(){
        List<User> users = new ArrayList<>();

        users = us.getUsers();

        List<Report> rl = new ArrayList<>();
        for (User u : users){
            Report report = new Report(u.getId(),u.getUsername(),u.getSkills(),u.getSalary());
            rl.add(report);
        }
        return rl;
    }
}
