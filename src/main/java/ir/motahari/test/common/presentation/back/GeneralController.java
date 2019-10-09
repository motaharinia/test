/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.motahari.test.common.presentation.back;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrator
 */
@RestController
public class GeneralController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
