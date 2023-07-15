package com.buddget.user.management;

import com.buddget.entities.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.util.Set;

public record UserUpdateRequest(@NotBlank(message = "This field is required.") String firstName,
                                @NotBlank(message = "This field is required.") String lastName,
                                @Email(message = "Please enter a valid email address.") String email,
                                @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*])[a-zA-Z\\d!@#$%^&*]{8,}$", message = "Your password should be a minimum of 8 characters long and include at least 1 lowercase letter, 1 uppercase letter, 1 number, and 1 special character.") String password,
                                Set<String> roles) {
}




