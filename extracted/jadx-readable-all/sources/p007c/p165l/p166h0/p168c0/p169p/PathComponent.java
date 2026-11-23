package p007c.p165l.p166h0.p168c0.p169p;

import com.cgfay.media.CainMediaMetadataRetriever;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.l.h0.c0.p.c, reason: use source file name */
/* JADX INFO: compiled from: PathComponent.java */
/* JADX INFO: loaded from: classes.dex */
public final class PathComponent {

    /* JADX INFO: renamed from: a */
    public final String f4681a;

    /* JADX INFO: renamed from: b */
    public final int f4682b;

    /* JADX INFO: renamed from: c */
    public final int f4683c;

    /* JADX INFO: renamed from: d */
    public final String f4684d;

    /* JADX INFO: renamed from: e */
    public final String f4685e;

    /* JADX INFO: renamed from: f */
    public final String f4686f;

    /* JADX INFO: renamed from: g */
    public final String f4687g;

    /* JADX INFO: renamed from: h */
    public final int f4688h;

    public PathComponent(JSONObject jSONObject) throws JSONException {
        this.f4681a = jSONObject.getString("class_name");
        this.f4682b = jSONObject.optInt("index", -1);
        this.f4683c = jSONObject.optInt("id");
        this.f4684d = jSONObject.optString("text");
        this.f4685e = jSONObject.optString("tag");
        this.f4686f = jSONObject.optString(CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION);
        this.f4687g = jSONObject.optString("hint");
        this.f4688h = jSONObject.optInt("match_bitmask");
    }
}
