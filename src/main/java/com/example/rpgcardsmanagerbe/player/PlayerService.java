package com.example.rpgcardsmanagerbe.player;

import com.example.rpgcardsmanagerbe.heroInfo.HeroInfo;
import com.example.rpgcardsmanagerbe.repositories.HeroRepository;
import com.example.rpgcardsmanagerbe.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private HeroRepository heroRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayerById(Long id) {
        return playerRepository.findById(id).orElse(null);
    }

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Long id, Player newPlayer) {
        Player existingPlayer = getPlayerById(id);
        if (existingPlayer != null) {
            existingPlayer.setName(newPlayer.getName());
            existingPlayer.setGameMaster(newPlayer.getGameMaster());
            existingPlayer.setCampaign(newPlayer.getCampaign());
            existingPlayer.setCampaignYear(newPlayer.getCampaignYear());

            return playerRepository.save(existingPlayer);
        }
        return null;
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }

    public Player findByHeroId(Long heroId) {
        return Objects.requireNonNull(heroRepository.findById(heroId).orElse(null)).getPlayer();
    }

    public void updatePlayerByHeroId(Long heroId, Player newPlayer) {
        Player player = findByHeroId(heroId);
//        Player player = Objects.requireNonNull(heroRepository.findById(heroId).orElse(null)).getPlayer();
        player.setName(newPlayer.getName());
        player.setGameMaster(newPlayer.getGameMaster());
        player.setCampaign(newPlayer.getCampaign());
        player.setCampaignYear(newPlayer.getCampaignYear());
        playerRepository.save(player);
    }
}
