var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
var Employee = (function () {
    function Employee(name) {
        this.name = name;
    }
    Employee.prototype.getSurname = function () {
        return this.name;
    };
    return Employee;
}());
var Manager = (function (_super) {
    __extends(Manager, _super);
    function Manager() {
        _super.apply(this, arguments);
    }
    return Manager;
}(Employee));
//# sourceMappingURL=People.js.map