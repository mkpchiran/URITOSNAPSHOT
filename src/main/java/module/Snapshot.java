package module;

/**
 * Created by chiranz on 7/15/16.
*/

public class Snapshot {
    private String srcUrl;
    private String dstUrl;
    private int width;
    private int height;

    public Snapshot() {

    }

    public String getSrcUrl() {
        return srcUrl;
    }

    public void setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
    }

    public String getDstUrl() {
        return dstUrl;
    }

    public void setDstUrl(String dstUrl) {
        this.dstUrl = dstUrl;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Snapshot(String srcUrl, String dstUrl, int width, int height) {

        this.srcUrl = srcUrl;
        this.dstUrl = dstUrl;
        this.width = width;
        this.height = height;
    }


}
