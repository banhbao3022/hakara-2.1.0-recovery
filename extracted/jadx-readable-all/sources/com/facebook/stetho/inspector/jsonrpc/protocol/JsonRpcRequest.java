package com.facebook.stetho.inspector.jsonrpc.protocol;

import android.annotation.SuppressLint;
import com.facebook.stetho.json.annotation.JsonProperty;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UsingDefaultJsonDeserializer", "EmptyJsonPropertyUse"})
public class JsonRpcRequest {

    /* JADX INFO: renamed from: id */
    @JsonProperty
    public Long f28298id;

    @JsonProperty(required = true)
    public String method;

    @JsonProperty
    public JSONObject params;

    public JsonRpcRequest() {
    }

    public JsonRpcRequest(Long l, String str, JSONObject jSONObject) {
        this.f28298id = l;
        this.method = str;
        this.params = jSONObject;
    }
}
