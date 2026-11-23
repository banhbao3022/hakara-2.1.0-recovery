package p007c.p165l.p183m0.p184b;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.FacebookException;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;
import p007c.p165l.p183m0.p185c.ShareContent;
import p007c.p165l.p183m0.p185c.ShareLinkContent;
import p007c.p165l.p183m0.p185c.ShareOpenGraphContent;
import p007c.p165l.p183m0.p185c.SharePhotoContent;
import p007c.p165l.p183m0.p185c.ShareVideoContent;

/* JADX INFO: renamed from: c.l.m0.b.e, reason: use source file name */
/* JADX INFO: compiled from: LegacyNativeDialogParameters.java */
/* JADX INFO: loaded from: classes.dex */
public class LegacyNativeDialogParameters {
    /* JADX INFO: renamed from: a */
    public static Bundle m2608a(UUID uuid, ShareContent shareContent, boolean z) {
        Validate.m2477f(shareContent, "shareContent");
        Validate.m2477f(uuid, "callId");
        if (shareContent instanceof ShareLinkContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            Bundle bundleM2609b = m2609b(shareLinkContent, z);
            Utility.m2434G(bundleM2609b, "com.facebook.platform.extra.TITLE", shareLinkContent.f5270m);
            Utility.m2434G(bundleM2609b, "com.facebook.platform.extra.DESCRIPTION", shareLinkContent.f5269l);
            Utility.m2435H(bundleM2609b, "com.facebook.platform.extra.IMAGE", shareLinkContent.f5271n);
            return bundleM2609b;
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            List<String> listM2636d = ShareInternalUtility4.m2636d(sharePhotoContent, uuid);
            Bundle bundleM2609b2 = m2609b(sharePhotoContent, z);
            bundleM2609b2.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList<>(listM2636d));
            return bundleM2609b2;
        }
        if (shareContent instanceof ShareVideoContent) {
            return null;
        }
        if (!(shareContent instanceof ShareOpenGraphContent)) {
            return null;
        }
        ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
        try {
            JSONObject jSONObjectM2645m = ShareInternalUtility4.m2645m(uuid, shareOpenGraphContent);
            Bundle bundleM2609b3 = m2609b(shareOpenGraphContent, z);
            Utility.m2434G(bundleM2609b3, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", shareOpenGraphContent.f5307m);
            Utility.m2434G(bundleM2609b3, "com.facebook.platform.extra.ACTION_TYPE", shareOpenGraphContent.f5306l.m2649c());
            Utility.m2434G(bundleM2609b3, "com.facebook.platform.extra.ACTION", jSONObjectM2645m.toString());
            return bundleM2609b3;
        } catch (JSONException e) {
            StringBuilder sbM1556G = outline.m1556G("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
            sbM1556G.append(e.getMessage());
            throw new FacebookException(sbM1556G.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m2609b(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        Utility.m2435H(bundle, "com.facebook.platform.extra.LINK", shareContent.f5255f);
        Utility.m2434G(bundle, "com.facebook.platform.extra.PLACE", shareContent.f5257h);
        Utility.m2434G(bundle, "com.facebook.platform.extra.REF", shareContent.f5259j);
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        List<String> list = shareContent.f5256g;
        if (!Utility.m2467z(list)) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList<>(list));
        }
        return bundle;
    }
}
