package one.digitalinnovation.personapi.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProfessionType {

    JUNIOR("Júnior"),
    FULL("Pleno"),
    SENIOR("Senior");

    private final String description;
}
