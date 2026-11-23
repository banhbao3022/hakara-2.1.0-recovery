package p007c.p165l.p183m0.p184b;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookException;
import p007c.p165l.p175i0.C1095a;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p183m0.p185c.ShareContent;
import p007c.p165l.p183m0.p185c.ShareHashtag;
import p007c.p165l.p183m0.p185c.ShareOpenGraphContent;

/* JADX INFO: renamed from: c.l.m0.b.x, reason: use source file name */
/* JADX INFO: compiled from: WebDialogParameters.java */
/* JADX INFO: loaded from: classes.dex */
public class WebDialogParameters2 {
    /* JADX INFO: renamed from: a */
    public static Bundle m2646a(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle bundleM2647b = m2647b(shareOpenGraphContent);
        Utility.m2434G(bundleM2647b, "action_type", shareOpenGraphContent.f5306l.m2649c());
        try {
            JSONObject jSONObjectM2644l = ShareInternalUtility4.m2644l(C1095a.m2382I(shareOpenGraphContent.f5306l, new ShareInternalUtility6()), false);
            if (jSONObjectM2644l != null) {
                Utility.m2434G(bundleM2647b, "action_properties", jSONObjectM2644l.toString());
            }
            return bundleM2647b;
        } catch (JSONException e) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m2647b(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag shareHashtag = shareContent.f5260k;
        if (shareHashtag != null) {
            Utility.m2434G(bundle, "hashtag", shareHashtag.f5267f);
        }
        return bundle;
    }
}
