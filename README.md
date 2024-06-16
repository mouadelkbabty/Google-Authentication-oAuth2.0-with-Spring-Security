
# Recipe Sharing Platform

A web application that allows users to share their recipes, explore recipes from others, comment on them, and even rate them. This platform is built using Spring Boot, Thymeleaf, and Spring Security with Google OAuth2 authentication.

## Features

- **User Authentication**: Login and registration with Spring Security and Google OAuth2.
- **Recipe Management**: Users can add, view, update, and delete their recipes.
- **Recipe Exploration**: Browse and search for recipes by categories, ingredients, or popularity.
- **Comments**: Users can comment on recipes.
- **Responsive UI**: Built with Thymeleaf for a user-friendly and responsive interface.

## Technologies Used

- Spring Boot
- Spring Security
- Spring Data JPA
- Thymeleaf
- H2 Database 
- OAuth2 with Google

## Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.6.0 or later

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/recipe-sharing-platform.git
    cd recipe-sharing-platform
    ```

2. Configure the application properties in `src/main/resources/application.properties`:
    ```properties
    # Database Configuration
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=password
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

    # H2 Console
    spring.h2.console.enabled=true

    # Spring Security Configuration
    spring.security.oauth2.client.registration.google.client-id=your-google-client-id
    spring.security.oauth2.client.registration.google.client-secret=your-google-client-secret
    spring.security.oauth2.client.registration.google.scope=profile, email
    spring.security.oauth2.client.registration.google.redirect-uri={baseUrl}/login/oauth2/code/{registrationId}
    spring.security.oauth2.client.provider.google.authorization-uri=https://accounts.google.com/o/oauth2/auth
    spring.security.oauth2.client.provider.google.token-uri=https://oauth2.googleapis.com/token
    spring.security.oauth2.client.provider.google.user-info-uri=https://www.googleapis.com/oauth2/v3/userinfo
    spring.security.oauth2.client.provider.google.user-name-attribute=sub
    ```

3. Build and run the application:
    ```sh
    mvn spring-boot:run
    ```

4. Open your browser and navigate to `http://localhost:8080`.

## Usage

### User Authentication

- Access the login page at `/login`.
- You can log in with Google OAuth2.

### Recipe Management

- After logging in, you can add new recipes by navigating to `/recipes/new`.
- View all recipes at `/recipes`.
- Edit a recipe by navigating to `/recipes/edit/{id}`.
- Delete a recipe by navigating to `/recipes/delete/{id}`.

### Comments

- View recipe details and comments at `/recipes/{id}`.
- Add a comment using the form at the bottom of the recipe details page.

## Project Structure

```
src
└── main
    ├── java
    │   └── com
    │       └── recipeplatform
    │           ├── controller
    │           │   ├── CommentController.java
    │           │   ├── RecipeController.java
    │           ├── model
    │           │   ├── AppUser.java
    │           │   ├── Comment.java
    │           │   ├── Recipe.java
    │           ├── repository
    │           │   ├── CommentRepository.java
    │           │   ├── RecipeRepository.java
    │           │   ├── UserRepository.java
    │           ├── security
    │           │   ├── SecurityConfig.java
    │           │   ├── UserDetailsServiceImpl.java
    │           ├── service
    │           │   ├── CommentService.java
    │           │   ├── RecipeService.java
    │           │   ├── UserService.java
    ├── resources
    │   ├── templates
    │   │   ├── index.html
    │   │   ├── login.html
    │   │   ├── recipe-form.html
    │   │   ├── recipe-details.html
    │   ├── application.properties
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

Distributed under the MIT License. See `LICENSE` for more information.

## Contact

El kbabty Mouad -  - mouadelkbabty@gmail.com


