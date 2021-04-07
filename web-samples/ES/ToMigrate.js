var sum = require('lodash/sum');

function Student(name) {
    this.name = name;
}
Student.prototype.sumGrades = function (grades) {
    return this.name + ' says the sum is ' + sum(grades);
};

let theThingToDo = function () {
    return "This Thing";
};

let jane = new Student("Jane");
console.log(jane.sumGrades([74, 85, 50]));

