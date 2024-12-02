package controller;

import model.dto.DniDTO;
import service.DniService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dni")
public class DniController {

    private final DniService dniService;

    public DniController(DniService dniService) {
        this.dniService = dniService;
    }

    @PostMapping("/calculate")
    public ResponseEntity<DniDTO> calculateLetter(@RequestBody DniDTO dniDTO) {
        try {
            DniDTO result = dniService.calculateDniLetter(dniDTO.getDniNumber());
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
