package kodlama.io.rentACar.business.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCorporateCustomerRequest {

    @NotNull
    private int id;
    @NotNull
    private String mail;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String taxNumber;
    @NotNull
    private String companyName;
    @NotNull
    private String contactName;
}
