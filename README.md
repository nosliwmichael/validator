# Validator
A simple and readable way to validate objects and their properties using the builder syntax.

Different types of validation are grouped into separate classes: BasicValidator, NumericValidator, PatternValidator. 
These are all brought together and used by the ValidatorBuilder class. You start by calling the static `create` method on the builder class: `ValidatorBuilder.create()` This returns a new instance of the ValidatorBuilder class. All validation methods in this class return the same instance of the class. This means you can chain your validation methods like this:
```
Person person = new Person("John", 26, "555-555-5555");
boolean valid = ValidatorBuilder.create()
.isStringLongerThan(person.getName(), 3)
.isGreaterThan(person.age(), 20)
.isPhoneNumber()
.isValid();
```
The purpose of this project is to reduce the amount of if statements you would have to write when validating an object and its properties.
