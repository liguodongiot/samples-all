package com.lgd.es;

import com.lgd.es.bean.EmployeesDO;
import com.lgd.es.dao.EmployeesRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>Project: samples-all</p>
 * <p>Package: com.lgd.es</p>
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author guodong.li
 * @version 1.0.0
 * @date 2018/5/18 12:54 星期五
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EsApplication.class)
public class EsTest {

    @Autowired
    EmployeesRepository employeesRepository;
    @Test
    public void Test() {
        EmployeesDO employeesDO = new EmployeesDO();
        employeesDO.setEmpNo(11111);
        employeesDO.setFirstName("To333m");
        employeesDO.setLastName("je33ry");
        employeesDO.setGender("M");

        employeesRepository.save(employeesDO);
    }
}