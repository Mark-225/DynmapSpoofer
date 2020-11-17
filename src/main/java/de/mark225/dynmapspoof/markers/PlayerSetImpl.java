package de.mark225.dynmapspoof.markers;

import org.dynmap.markers.PlayerSet;

import java.util.Set;

public class PlayerSetImpl implements PlayerSet {
    @Override
    public String getSetID() {
        return null;
    }

    @Override
    public Set<String> getPlayers() {
        return null;
    }

    @Override
    public void setPlayers(Set<String> players) {

    }

    @Override
    public void addPlayer(String player) {

    }

    @Override
    public void removePlayer(String player) {

    }

    @Override
    public boolean isPlayerInSet(String player) {
        return false;
    }

    @Override
    public void deleteSet() {

    }

    @Override
    public boolean isSymmetricSet() {
        return false;
    }

    @Override
    public void setSymmetricSet(boolean symmetric) {

    }

    @Override
    public boolean isPersistentSet() {
        return false;
    }
}
