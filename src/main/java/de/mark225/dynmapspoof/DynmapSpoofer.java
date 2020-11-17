package de.mark225.dynmapspoof;

import org.bukkit.plugin.java.JavaPlugin;
import org.dynmap.DynmapCommonAPI;
import org.dynmap.markers.MarkerAPI;

public class DynmapSpoofer extends JavaPlugin implements DynmapCommonAPI {
    @Override
    public MarkerAPI getMarkerAPI() {
        return null;
    }

    @Override
    public boolean markerAPIInitialized() {
        return false;
    }

    @Override
    public boolean sendBroadcastToWeb(String sender, String msg) {
        return false;
    }

    @Override
    public int triggerRenderOfVolume(String wid, int minx, int miny, int minz, int maxx, int maxy, int maxz) {
        return 0;
    }

    @Override
    public int triggerRenderOfBlock(String wid, int x, int y, int z) {
        return 0;
    }

    @Override
    public void setPauseFullRadiusRenders(boolean dopause) {

    }

    @Override
    public boolean getPauseFullRadiusRenders() {
        return false;
    }

    @Override
    public void setPauseUpdateRenders(boolean dopause) {

    }

    @Override
    public boolean getPauseUpdateRenders() {
        return false;
    }

    @Override
    public void setPlayerVisiblity(String player, boolean is_visible) {

    }

    @Override
    public boolean getPlayerVisbility(String player) {
        return false;
    }

    @Override
    public void assertPlayerInvisibility(String player, boolean is_invisible, String plugin_id) {

    }

    @Override
    public void assertPlayerVisibility(String player, boolean is_visible, String plugin_id) {

    }

    @Override
    public void postPlayerMessageToWeb(String playerid, String playerdisplay, String message) {

    }

    @Override
    public void postPlayerJoinQuitToWeb(String playerid, String playerdisplay, boolean isjoin) {

    }

    @Override
    public String getDynmapCoreVersion() {
        return "2.5";
    }

    @Override
    public boolean setDisableChatToWebProcessing(boolean disable) {
        return false;
    }

    @Override
    public boolean testIfPlayerVisibleToPlayer(String player, String player_to_see) {
        return true;
    }

    @Override
    public boolean testIfPlayerInfoProtected() {
        return false;
    }

    @Override
    public void processSignChange(int blkid, String world, int x, int y, int z, String[] lines, String playerid) {

    }
}
