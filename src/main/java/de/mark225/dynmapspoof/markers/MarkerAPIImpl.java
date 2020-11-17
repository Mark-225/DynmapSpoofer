package de.mark225.dynmapspoof.markers;

import org.dynmap.markers.MarkerAPI;
import org.dynmap.markers.MarkerIcon;
import org.dynmap.markers.MarkerSet;
import org.dynmap.markers.PlayerSet;

import java.io.InputStream;
import java.util.Set;

public class MarkerAPIImpl implements MarkerAPI {

    @Override
    public Set<MarkerSet> getMarkerSets() {
        return null;
    }

    @Override
    public MarkerSet getMarkerSet(String id) {
        return null;
    }

    @Override
    public MarkerSet createMarkerSet(String id, String lbl, Set<MarkerIcon> iconlimit, boolean persistent) {
        return null;
    }

    @Override
    public Set<MarkerIcon> getMarkerIcons() {
        return null;
    }

    @Override
    public MarkerIcon getMarkerIcon(String id) {
        return null;
    }

    @Override
    public MarkerIcon createMarkerIcon(String id, String label, InputStream marker_png) {
        return null;
    }

    @Override
    public Set<PlayerSet> getPlayerSets() {
        return null;
    }

    @Override
    public PlayerSet getPlayerSet(String id) {
        return null;
    }

    @Override
    public PlayerSet createPlayerSet(String id, boolean symmetric, Set<String> players, boolean persistent) {
        return null;
    }
}
