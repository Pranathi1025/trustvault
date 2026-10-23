package TrustVault;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return """
            <html>
            <head>
                <title>TrustVault</title>
            </head>
            <body style="font-family: Arial; text-align: center;
                         margin-top: 100px;">
                <h1>Welcome to TrustVault</h1>
                <p>Secure Document Sharing Platform</p>
                <p>Spring Boot application is running successfully!</p>
            </body>
            </html>
            """;
    }
}