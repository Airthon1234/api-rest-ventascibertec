package pe.edu.cibertec.apirestventascibertec.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.cibertec.apirestventascibertec.model.response.ResponseFile;
import pe.edu.cibertec.apirestventascibertec.service.FileService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/file")
public class FileController {

    private FileService fileService;

    @PostMapping("/upload")
    public ResponseEntity<ResponseFile> subirArchivos(@RequestParam("files")List<MultipartFile> files) throws Exception{
        fileService.guardarArchivo(files);
        return ResponseEntity.status(HttpStatus.OK)
                .body(
                        ResponseFile.builder().message("Los archivos fueron cargados correctamente").build()
                );
    }
}
