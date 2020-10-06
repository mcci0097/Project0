Assignment for automation testing position

This is your automation testing technical challenge. The UI under test can be any website that you choose with a search function, but pay attention so that the locators don't change often. The API under test is a public API and is documented here https://accountsapi.azurewebsites.net/api/swagger/ui#/. 
Create an automation project using Serenity BDD to validate a search and an endpoint response.

1. Specifications UI: Create the project utilizing Serenity's Page Object design pattern (Page-Steps-Test) and automate 3 searches in any site that uses a search function (ex Wikipedia, Emag...) with only one Test class. Any searched words can be used, but extra points will be awarded for using SerenityParameterizedRunner and utilizing the search words from a CSV. At the end of the each flow, an assertion must be made.

2. Specification BE: Utilize the above project to also test an endpoint of your choosing from https://accountsapi.azurewebsites.net/api/swagger/ui#/. Recommended frameworks: RestAssured or Jackson, but feel free to experiment with other frameworks. An assertion must be used on the response of the endpoint.
When you're satisfied with the outcome, push your project to the associated GIT origin.
