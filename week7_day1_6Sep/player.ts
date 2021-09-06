import { Person } from "./person";
import { Team } from "./team";
export class Player extends Person {
    private sportsname: string;
    private sportstype : string;
    private  t = new Team();
    constructor(sportsname: string, sportstype :string, name: string, age: number, teamname: string, teammatches :number) {
        super(name,age);
        this.sportsname = sportsname;
        this.sportstype = sportstype;
        
        this.t.setteams(teamname,teammatches);
    }

    getplayer(): string {
        return this.getperson()+"\nPlayer Sports is " + this.sportsname + " and sportstype is "+ this.sportstype +"\n"+this.t.getteam();
    }

}