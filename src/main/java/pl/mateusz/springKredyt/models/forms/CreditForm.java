package pl.mateusz.springKredyt.models.forms;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreditForm {
    private double income;
    private double totalCreadit;
    private int numberOfMonths;
}
