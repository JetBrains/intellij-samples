interface Person {
    getSurname();
}

class Employee implements Person {
    getSurname():string {
        return this.name;
    }

    constructor(protected name:string){
    }
}

class Manager extends Employee {

}