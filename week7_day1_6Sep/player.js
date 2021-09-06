"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.Player = void 0;
var person_1 = require("./person");
var team_1 = require("./team");
var Player = /** @class */ (function (_super) {
    __extends(Player, _super);
    function Player(sportsname, sportstype, name, age, teamname, teammatches) {
        var _this = _super.call(this, name, age) || this;
        _this.t = new team_1.Team();
        _this.sportsname = sportsname;
        _this.sportstype = sportstype;
        _this.t.setteams(teamname, teammatches);
        return _this;
    }
    Player.prototype.getplayer = function () {
        return this.getperson() + "\nPlayer Sports is " + this.sportsname + " and sportstype is " + this.sportstype + "\n" + this.t.getteam();
    };
    return Player;
}(person_1.Person));
exports.Player = Player;
