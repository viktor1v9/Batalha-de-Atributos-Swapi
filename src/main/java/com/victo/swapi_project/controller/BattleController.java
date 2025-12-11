package com.victo.swapi_project.controller;

import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import com.victo.swapi_project.dto.BattleResultDTO;
import com.victo.swapi_project.service.BattleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/v1/battles")
@RequiredArgsConstructor
public class BattleController {

    private final BattleService battleService;

    @GetMapping("/start")
    public ResponseEntity<BattleResultDTO> startBattle() {
        
        BattleResultDTO result = battleService.startBattle();

        return ResponseEntity.ok(result);
    }
}
