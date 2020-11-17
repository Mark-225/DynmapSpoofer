package de.mark225.dynmapspoof.markers;

import org.dynmap.markers.MarkerIcon;

import java.io.InputStream;

public class MarkerIconImpl implements MarkerIcon {
    @Override
    public String getMarkerIconID() {
        return null;
    }

    @Override
    public String getMarkerIconLabel() {
        return null;
    }

    @Override
    public void setMarkerIconLabel(String lbl) {

    }

    @Override
    public void setMarkerIconImage(InputStream in) {

    }

    @Override
    public void deleteIcon() {

    }

    @Override
    public boolean isBuiltIn() {
        return false;
    }

    @Override
    public MarkerSize getMarkerIconSize() {
        return null;
    }
}
