package p007c.p165l.p183m0.p184b;

import android.os.Bundle;
import p007c.p165l.FacebookCallback;
import p007c.p165l.FacebookException;
import p007c.p165l.p178k0.AppCall;
import p007c.p165l.p183m0.Sharer;

/* JADX INFO: renamed from: c.l.m0.b.q, reason: use source file name */
/* JADX INFO: compiled from: ShareInternalUtility.java */
/* JADX INFO: loaded from: classes.dex */
public final class ShareInternalUtility3 extends ResultProcessor {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FacebookCallback f5235b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareInternalUtility3(FacebookCallback facebookCallback, FacebookCallback facebookCallback2) {
        super(facebookCallback);
        this.f5235b = facebookCallback2;
    }

    @Override // p007c.p165l.p183m0.p184b.ResultProcessor
    /* JADX INFO: renamed from: a */
    public void mo2619a(AppCall appCall, FacebookException facebookException) {
        FacebookCallback facebookCallback = this.f5235b;
        ShareInternalUtility4.m2639g("error", facebookException.getMessage());
        if (facebookCallback != null) {
            facebookCallback.mo2278c(facebookException);
        }
    }

    @Override // p007c.p165l.p183m0.p184b.ResultProcessor
    /* JADX INFO: renamed from: b */
    public void mo2620b(AppCall appCall, Bundle bundle) {
        String string;
        if (bundle != null) {
            String string2 = bundle.containsKey("completionGesture") ? bundle.getString("completionGesture") : bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
            if (string2 == null || "post".equalsIgnoreCase(string2)) {
                if (bundle.containsKey("postId")) {
                    string = bundle.getString("postId");
                } else {
                    string = bundle.containsKey("com.facebook.platform.extra.POST_ID") ? bundle.getString("com.facebook.platform.extra.POST_ID") : bundle.getString("post_id");
                }
                FacebookCallback facebookCallback = this.f5235b;
                ShareInternalUtility4.m2639g("succeeded", null);
                if (facebookCallback != null) {
                    facebookCallback.mo2276a(new Sharer(string));
                    return;
                }
                return;
            }
            if ("cancel".equalsIgnoreCase(string2)) {
                FacebookCallback facebookCallback2 = this.f5235b;
                ShareInternalUtility4.m2639g("cancelled", null);
                if (facebookCallback2 != null) {
                    facebookCallback2.mo2277b();
                    return;
                }
                return;
            }
            FacebookCallback facebookCallback3 = this.f5235b;
            FacebookException facebookException = new FacebookException("UnknownError");
            ShareInternalUtility4.m2639g("error", facebookException.getMessage());
            if (facebookCallback3 != null) {
                facebookCallback3.mo2278c(facebookException);
            }
        }
    }
}
