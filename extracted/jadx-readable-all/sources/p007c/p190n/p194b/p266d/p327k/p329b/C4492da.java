package p007c.p190n.p194b.p266d.p327k.p329b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: c.n.b.d.k.b.da */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4492da {

    /* JADX INFO: renamed from: a */
    public final C4707w4 f23838a;

    public C4492da(C4707w4 c4707w4) {
        this.f23838a = c4707w4;
    }

    /* JADX INFO: renamed from: a */
    public final void m10507a(String str, Bundle bundle) {
        String string;
        this.f23838a.mo10686n().mo10381b();
        if (this.f23838a.m10828d()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f23838a.m10834k().f23886B.m10640b(string);
        this.f23838a.m10834k().f23887C.m10611b(this.f23838a.f24541o.mo5623c());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10508b() {
        return m10509c() && this.f23838a.f24541o.mo5623c() - this.f23838a.m10834k().f23887C.m10610a() > this.f23838a.f24534h.m10416i(null, C4647r.f24305E0);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10509c() {
        return this.f23838a.m10834k().f23887C.m10610a() > 0;
    }
}
