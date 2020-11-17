package de.mark225.dynmapspoof.markers;

import org.dynmap.markers.Marker;
import org.dynmap.markers.MarkerIcon;
import org.dynmap.markers.MarkerSet;

public class MarkerImpl implements Marker {
    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public double getZ() {
        return 0;
    }

    @Override
    public void setLocation(String worldid, double x, double y, double z) {

    }

    @Override
    public MarkerIcon getMarkerIcon() {
        return null;
    }

    @Override
    public boolean setMarkerIcon(MarkerIcon icon) {
        return false;
    }

    @Override
    public void setDescription(String desc) {

    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getMarkerID() {
        return null;
    }

    @Override
    public MarkerSet getMarkerSet() {
        return null;
    }

    @Override
    public void setMarkerSet(MarkerSet newset) {

    }

    @Override
    public void deleteMarker() {

    }

    @Override
    public String getWorld() {
        return null;
    }

    @Override
    public String getNormalizedWorld() {
        return null;
    }

    @Override
    public boolean isPersistentMarker() {
        return false;
    }

    @Override
    public String getLabel() {
        return null;
    }

    @Override
    public void setLabel(String lbl) {

    }

    @Override
    public void setLabel(String lbl, boolean markup) {

    }

    @Override
    public boolean isLabelMarkup() {
        return false;
    }

    @Override
    public int getMinZoom() {
        return 0;
    }

    @Override
    public void setMinZoom(int zoom) {

    }

    @Override
    public int getMaxZoom() {
        return 0;
    }

    @Override
    public void setMaxZoom(int zoom) {

    }
}
