package pl.edu.wszib.http2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping(value = "/images")
public class UploadController {

  private byte[] uploaded;

  @PostMapping(value = "/upload")
  public String upload(@RequestParam("file")MultipartFile multipartFile) throws IOException {
    uploaded = multipartFile.getBytes();
    return multipartFile.getOriginalFilename();
  }

  @GetMapping(produces = "image/png")
  public byte[] uploaded() {
    return uploaded;
  }

}
