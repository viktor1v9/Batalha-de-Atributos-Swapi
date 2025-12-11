package com.victo.swapi_project.service;

import org.springframework.stereotype.Service;
import com.victo.swapi_project.client.SwapiClient;
import com.victo.swapi_project.dto.BattleResultDTO;
import lombok.RequiredArgsConstructor;
import com.victo.swapi_project.client.response.PersonResponse;

@Service
@RequiredArgsConstructor
public class BattleService {

    private final SwapiClient swapiClient;

    public BattleResultDTO startBattle() {
        Long id1 = getRandomId();
        Long id2 = getRandomId();

        PersonResponse player1 = swapiClient.getPerson(id1);
        PersonResponse player2 = swapiClient.getPerson(id2);

        double mass1 = parseAttribute(player1.mass());
        double mass2 = parseAttribute(player2.mass());

        String winnerName;
        if (mass1 > mass2) {
            winnerName = player1.name();
        } else if (mass1 < mass2) {
            winnerName = player2.name();
        } else {
            winnerName = "Empate";
        }

        return new BattleResultDTO(
            winnerName,
            player1.name(),
            mass1,
            player2.name(),
            mass2,
            "MASS"
        );
    }

    private double parseAttribute(String value) {
        try{
            String cleanValue = value.replace(",", "").trim();
            return Double.parseDouble(cleanValue);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    private Long getRandomId() {
        return (long) (Math.random() * 82) + 1;        
    }
}
