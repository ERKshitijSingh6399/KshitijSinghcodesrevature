"use strict";
exports.__esModule = true;
exports.Person = void 0;
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    Person.prototype.getperson = function () {
        return "Person name is " + this.name + " and age is " + this.age;
    };
    return Person;
}());
exports.Person = Person;
