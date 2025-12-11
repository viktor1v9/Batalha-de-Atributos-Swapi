package com.victo.swapi_project.dto;

public record BattleResultDTO(
    String winner,
    String player1,
    double value1,
    String player2,
    double value2,
    String attributeUsed
) {}
