"use strict";
exports.__esModule = true;
exports.Team = void 0;
var Team = /** @class */ (function () {
    function Team() {
    }
    Team.prototype.setteams = function (teamname, teammatches) {
        this.teamname = teamname;
        this.teammatches = teammatches;
    };
    Team.prototype.getteam = function () {
        return "Team name is " + this.teamname + " and matchesplayed are " + this.teammatches;
    };
    return Team;
}());
exports.Team = Team;
