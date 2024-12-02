package service;

import model.dto.DniDTO;
import util.DniLetterCalculator;
import org.springframework.stereotype.Service;

@Service
public class DniService {

    private final DniLetterCalculator dniLetterCalculator;

    public DniService(DniLetterCalculator dniLetterCalculator) {
        this.dniLetterCalculator = dniLetterCalculator;
    }

    public DniDTO calculateDniLetter(String dniNumber) throws IllegalArgumentException {
        if (!dniNumber.matches("\\d{1,8}")) {
            throw new IllegalArgumentException("The entered data is incorrect");
        }

        int dniNum = Integer.parseInt(dniNumber);
        if (dniNum < 0 || dniNum > 99999999) {
            throw new IllegalArgumentException("The entered number is out of range");
        }

        String dniLetter = dniLetterCalculator.calculateDniLetter(dniNum);
        DniDTO dniDTO = new DniDTO();
        dniDTO.setDniNumber(dniNumber);
        dniDTO.setDniLetter(dniLetter);

        return dniDTO;
    }
}
