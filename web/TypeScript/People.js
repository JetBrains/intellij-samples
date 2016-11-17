var Employee = (function () {
    function Employee(name) {
        this.name = name;
    }
    Employee.prototype.getSurname = function () {
        return this.name;
    };
    return Employee;
}());
//# sourceMappingURL=People.js.map