package com.adeytech.adey_security;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @GetMapping("/getWorkerData/{workerId}")
    public  MyModel getWorkerData(@PathVariable String workerId) {

        return new MyModel();
    }

    @PostMapping("/saveWorkerData")
    public  MyModel saveWorkerData(@RequestBody MyModel model) {

        System.out.println("Before: " + model);
        model.setIsProcessComplete(!model.isProcessComplete);
        System.out.println("After :" + model);

        return model;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getData")
    public String getData(){

        return "[\n" +
                "  {\n" +
                "    \"firstName\": \"John\",\n" +
                "    \"lastName\": \"Doe\",\n" +
                "    \"age\": 29,\n" +
                "    \"department\": \"Marketing\",\n" +
                "    \"isProcessComplete\": true\n" +
                "  },\n" +
                "  {\n" +
                "    \"firstName\": \"Jane\",\n" +
                "    \"lastName\": \"Smith\",\n" +
                "    \"age\": 34,\n" +
                "    \"department\": \"Finance\",\n" +
                "    \"isProcessComplete\": false\n" +
                "  },\n" +
                "  {\n" +
                "    \"firstName\": \"Alice\",\n" +
                "    \"lastName\": \"Brown\",\n" +
                "    \"age\": 25,\n" +
                "    \"department\": \"Engineering\",\n" +
                "    \"isProcessComplete\": true\n" +
                "  },\n" +
                "  {\n" +
                "    \"firstName\": \"Bob\",\n" +
                "    \"lastName\": \"Johnson\",\n" +
                "    \"age\": 40,\n" +
                "    \"department\": \"HR\",\n" +
                "    \"isProcessComplete\": false\n" +
                "  },\n" +
                "  {\n" +
                "    \"firstName\": \"Eve\",\n" +
                "    \"lastName\": \"Davis\",\n" +
                "    \"age\": 28,\n" +
                "    \"department\": \"IT\",\n" +
                "    \"isProcessComplete\": true\n" +
                "  },\n" +
                "  {\n" +
                "    \"firstName\": \"Charlie\",\n" +
                "    \"lastName\": \"Wilson\",\n" +
                "    \"age\": 33,\n" +
                "    \"department\": \"Sales\",\n" +
                "    \"isProcessComplete\": false\n" +
                "  },\n" +
                "  {\n" +
                "    \"firstName\": \"Olivia\",\n" +
                "    \"lastName\": \"Martinez\",\n" +
                "    \"age\": 27,\n" +
                "    \"department\": \"Legal\",\n" +
                "    \"isProcessComplete\": true\n" +
                "  },\n" +
                "  {\n" +
                "    \"firstName\": \"David\",\n" +
                "    \"lastName\": \"Miller\",\n" +
                "    \"age\": 45,\n" +
                "    \"department\": \"Operations\",\n" +
                "    \"isProcessComplete\": false\n" +
                "  },\n" +
                "  {\n" +
                "    \"firstName\": \"Sophia\",\n" +
                "    \"lastName\": \"Garcia\",\n" +
                "    \"age\": 36,\n" +
                "    \"department\": \"Marketing\",\n" +
                "    \"isProcessComplete\": true\n" +
                "  },\n" +
                "  {\n" +
                "    \"firstName\": \"William\",\n" +
                "    \"lastName\": \"Lee\",\n" +
                "    \"age\": 50,\n" +
                "    \"department\": \"Finance\",\n" +
                "    \"isProcessComplete\": true\n" +
                "  },\n" +
                "  {\n" +
                "    \"firstName\": \"Lucas\",\n" +
                "    \"lastName\": \"Taylor\",\n" +
                "    \"age\": 38,\n" +
                "    \"department\": \"Engineering\",\n" +
                "    \"isProcessComplete\": false\n" +
                "  },\n" +
                "  {\n" +
                "    \"firstName\": \"Grace\",\n" +
                "    \"lastName\": \"Anderson\",\n" +
                "    \"age\": 22,\n" +
                "    \"department\": \"IT\",\n" +
                "    \"isProcessComplete\": true\n" +
                "  },\n" +
                "  {\n" +
                "    \"firstName\": \"James\",\n" +
                "    \"lastName\": \"Hernandez\",\n" +
                "    \"age\": 32,\n" +
                "    \"department\": \"Sales\",\n" +
                "    \"isProcessComplete\": false\n" +
                "  },\n" +
                "  {\n" +
                "    \"firstName\": \"Lily\",\n" +
                "    \"lastName\": \"Walker\",\n" +
                "    \"age\": 24,\n" +
                "    \"department\": \"HR\",\n" +
                "    \"isProcessComplete\": true\n" +
                "  },\n" +
                "  {\n" +
                "    \"firstName\": \"Mason\",\n" +
                "    \"lastName\": \"Allen\",\n" +
                "    \"age\": 31,\n" +
                "    \"department\": \"Operations\",\n" +
                "    \"isProcesComplete\": false" +
                "}" +
                "]\n";
    }
}
