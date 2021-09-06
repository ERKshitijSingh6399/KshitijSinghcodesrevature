export class Team {
    private teamname: string;
    private teammatches : number;
    setteams(teamname: string, teammatches :number) {
        this.teamname = teamname;
        this.teammatches = teammatches;
    }

    getteam(): string {
        return "Team name is " + this.teamname + " and matchesplayed are "+ this.teammatches;
    }

}