package de.mark225.dynmapspoof.markers;

import org.dynmap.markers.MarkerSet;
import org.dynmap.markers.PolyLineMarker;

public class PolyLineMarkerImpl implements PolyLineMarker {
    @Override
    public int getCornerCount() {
        return 0;
    }

    @Override
    public double getCornerX(int n) {
        return 0;
    }

    @Override
    public double getCornerY(int n) {
        return 0;
    }

    @Override
    public double getCornerZ(int n) {
        return 0;
    }

    @Override
    public void setCornerLocation(int n, double x, double y, double z) {

    }

    @Override
    public void setCornerLocations(double[] x, double[] y, double[] z) {

    }

    @Override
    public void deleteCorner(int n) {

    }

    @Override
    public void setLineStyle(int weight, double opacity, int color) {

    }

    @Override
    public int getLineWeight() {
        return 0;
    }

    @Override
    public double getLineOpacity() {
        return 0;
    }

    @Override
    public int getLineColor() {
        return 0;
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
