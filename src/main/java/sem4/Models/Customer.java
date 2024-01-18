package sem4.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Customer {
    private String name;
    private int age;
    private int phone;
    private Gender gender;
}