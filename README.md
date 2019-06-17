# Validator_Chain
A simple and readable way to validate objects and their properties using method chaining.

The Validator class contains some basic data validation methods. 
Each method receives an Object to validate and returns (this), the instance of the Validator class.
Once you've exhausted all validation methods, you can resolve the validation chain by calling the "isValid()" method.
This will return a boolean depending on whether or not any of the validation methods in your chain have failed.
