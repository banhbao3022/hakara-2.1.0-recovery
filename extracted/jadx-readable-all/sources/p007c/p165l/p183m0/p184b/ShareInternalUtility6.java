package p007c.p165l.p183m0.p184b;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookException;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p183m0.p185c.SharePhoto;

/* JADX INFO: renamed from: c.l.m0.b.t, reason: use source file name */
/* JADX INFO: compiled from: ShareInternalUtility.java */
/* JADX INFO: loaded from: classes.dex */
public final class ShareInternalUtility6 implements OpenGraphJSONUtility {
    @Override // p007c.p165l.p183m0.p184b.OpenGraphJSONUtility
    /* JADX INFO: renamed from: a */
    public JSONObject mo2618a(SharePhoto sharePhoto) {
        Uri uri = sharePhoto.f5311h;
        if (!Utility.m2428A(uri)) {
            throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", uri.toString());
            return jSONObject;
        } catch (JSONException e) {
            throw new FacebookException("Unable to attach images", e);
        }
    }
}
