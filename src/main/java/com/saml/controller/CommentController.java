package com.saml.controller;


import com.saml.models.Comment;
import com.saml.models.Recipe;
import com.saml.models.User;
import com.saml.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private RecipeService recipeService;

    @Autowired
    private UserService userService;

    @PostMapping
    public String addComment(@RequestParam("content") String content, @RequestParam("recipeId") Long recipeId, @AuthenticationPrincipal OidcUser principal) {

        User user = userService.findByEmail("alice@example.com");
        if (user == null) {
            user = new User();
            user.setEmail(principal.getEmail());
            user.setUsername(principal.getName());
            userService.saveUser(user);
        }

        Recipe recipe = recipeService.getRecipeById(recipeId);
        if (recipe == null) {
            return "redirect:/recipes";
        }

        Comment comment = new Comment();
        comment.setContent(content);
        comment.setUser(user);
        comment.setRecipe(recipe);
        commentService.saveComment(comment);

        return "redirect:/recipes/" + recipeId;
    }
}
