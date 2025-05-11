package com.example.computeengine;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = { org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration.class })
public class ComputeEngineApplication {
    public static void main(String[] args) {
        SpringApplication.run(ComputeEngineApplication.class, args);
    }

    @RestController
    @RequestMapping("/compute")
    public static class ComputeController {

        @PostMapping(value = "/compute", produces = "application/octet-stream")
        public ResponseEntity<Resource> compute(@RequestBody InputData inputData) throws IOException {
            String result = new Computation().convertDelimitedIntegersToHex(inputData.getData());

            // Write the result to a file
            File outputFile = new File("output.txt");
            try (FileWriter writer = new FileWriter(outputFile)) {
                writer.write(result);
            }

            // Create a resource for the file
            InputStreamResource resource = new InputStreamResource(new FileInputStream(outputFile));

            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=output.txt")
                    .contentLength(outputFile.length())
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .body(resource);
        }
    }

    public static class InputData {
        private String data;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
}
