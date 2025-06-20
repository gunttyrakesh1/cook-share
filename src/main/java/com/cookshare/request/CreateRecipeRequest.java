package com.cookshare.request;

import com.cookshare.model.Recipe;
import com.cookshare.model.User;
import lombok.Data;

@Data
public class CreateRecipeRequest {
    private Recipe recipe;
    private User user;
}
