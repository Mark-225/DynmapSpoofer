package de.mark225.dynmapspoof.markers;

import org.dynmap.markers.*;

import java.util.Set;

public class MarkerSetImpl implements MarkerSet {
    @Override
    public Set<Marker> getMarkers() {
        return null;
    }

    @Override
    public Set<AreaMarker> getAreaMarkers() {
        return null;
    }

    @Override
    public Set<PolyLineMarker> getPolyLineMarkers() {
        return null;
    }

    @Override
    public Set<CircleMarker> getCircleMarkers() {
        return null;
    }

    @Override
    public Marker createMarker(String id, String label, String world, double x, double y, double z, MarkerIcon icon, boolean is_persistent) {
        return null;
    }

    @Override
    public Marker createMarker(String id, String label, boolean markup, String world, double x, double y, double z, MarkerIcon icon, boolean is_persistent) {
        return null;
    }

    @Override
    public Marker findMarker(String id) {
        return null;
    }

    @Override
    public Marker findMarkerByLabel(String lbl) {
        return null;
    }

    @Override
    public AreaMarker createAreaMarker(String id, String lbl, boolean markup, String world, double[] x, double[] z, boolean persistent) {
        return null;
    }

    @Override
    public AreaMarker findAreaMarker(String id) {
        return null;
    }

    @Override
    public AreaMarker findAreaMarkerByLabel(String lbl) {
        return null;
    }

    @Override
    public PolyLineMarker createPolyLineMarker(String id, String lbl, boolean markup, String world, double[] x, double[] y, double[] z, boolean persistent) {
        return null;
    }

    @Override
    public PolyLineMarker findPolyLineMarker(String id) {
        return null;
    }

    @Override
    public PolyLineMarker findPolyLineMarkerByLabel(String lbl) {
        return null;
    }

    @Override
    public CircleMarker createCircleMarker(String id, String lbl, boolean markup, String world, double x, double y, double z, double xr, double zr, boolean persistent) {
        return null;
    }

    @Override
    public CircleMarker findCircleMarker(String id) {
        return null;
    }

    @Override
    public CircleMarker findCircleMarkerByLabel(String lbl) {
        return null;
    }

    @Override
    public String getMarkerSetID() {
        return null;
    }

    @Override
    public String getMarkerSetLabel() {
        return null;
    }

    @Override
    public void setMarkerSetLabel(String lbl) {

    }

    @Override
    public boolean isMarkerSetPersistent() {
        return false;
    }

    @Override
    public Set<MarkerIcon> getAllowedMarkerIcons() {
        return null;
    }

    @Override
    public void addAllowedMarkerIcon(MarkerIcon icon) {

    }

    @Override
    public void removeAllowedMarkerIcon(MarkerIcon icon) {

    }

    @Override
    public boolean isAllowedMarkerIcon(MarkerIcon icon) {
        return false;
    }

    @Override
    public Set<MarkerIcon> getMarkerIconsInUse() {
        return null;
    }

    @Override
    public void deleteMarkerSet() {

    }

    @Override
    public void setHideByDefault(boolean hide) {

    }

    @Override
    public boolean getHideByDefault() {
        return false;
    }

    @Override
    public void setLayerPriority(int prio) {

    }

    @Override
    public int getLayerPriority() {
        return 0;
    }

    @Override
    public int getMinZoom() {
        return 0;
    }

    @Override
    public void setMinZoom(int minzoom) {

    }

    @Override
    public int getMaxZoom() {
        return 0;
    }

    @Override
    public void setMaxZoom(int maxzoom) {

    }

    @Override
    public void setLabelShow(Boolean show) {

    }

    @Override
    public Boolean getLabelShow() {
        return null;
    }

    @Override
    public void setDefaultMarkerIcon(MarkerIcon defmark) {

    }

    @Override
    public MarkerIcon getDefaultMarkerIcon() {
        return null;
    }
}
