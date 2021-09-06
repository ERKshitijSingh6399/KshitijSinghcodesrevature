export class Person {
    private name: string;
    private age : number;
    constructor(name: string, age :number) {
        this.name = name;
        this.age = age;
    }

    getperson(): string {
        return "Person name is " + this.name + " and age is "+ this.age;
    }

}