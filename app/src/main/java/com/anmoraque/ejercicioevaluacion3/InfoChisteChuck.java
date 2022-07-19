package com.anmoraque.ejercicioevaluacion3;

public class InfoChisteChuck {


    /**
    *"icon_url" : "https://assets.chucknorris.host/img/avatar/chuck-norris.png",
    *       "id" : "lUYizQy1RnOLnZxP6I5z1g",
    *        "url" : "",
    *         "value" : "Chuck Norris' Christmas tree is actually a 20 foot Tesla coil. It is also necessary to power his electric beard trimmer."
    */

    private String icon_url;
    private String id;
    private String url;
    private String value;

    public InfoChisteChuck(String icon_url, String id, String url, String value) {
        this.icon_url = icon_url;
        this.id = id;
        this.url = url;
        this.value = value;
    }

    public InfoChisteChuck() {

    }


    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "InfoChisteChuck{" +
                "icon_url='" + icon_url + '\'' +
                ", id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
