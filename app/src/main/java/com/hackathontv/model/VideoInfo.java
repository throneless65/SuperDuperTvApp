package com.hackathontv.model;

import com.google.gson.annotations.SerializedName;

public class VideoInfo {

    @SerializedName("riptide_id")
    public String riptideId;

    public double duration;

    public String src;
}
