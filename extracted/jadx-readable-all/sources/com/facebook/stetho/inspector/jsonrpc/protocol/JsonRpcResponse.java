package com.facebook.stetho.inspector.jsonrpc.protocol;

import android.annotation.SuppressLint;
import com.facebook.stetho.json.annotation.JsonProperty;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UsingDefaultJsonDeserializer", "EmptyJsonPropertyUse"})
public class JsonRpcResponse {

    @JsonProperty
    public JSONObject error;

    /* JADX INFO: renamed from: id */
    @JsonProperty(required = true)
    public long f28299id;

    @JsonProperty
    public JSONObject result;
}
