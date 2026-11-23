package p007c.p190n.p194b.p266d.p327k.p329b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: renamed from: c.n.b.d.k.b.h6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4536h6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4500e6 f23971f;

    public RunnableC4536h6(C4500e6 c4500e6) {
        this.f23971f = c4500e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4492da c4492da = this.f23971f.f23862n;
        c4492da.f23838a.mo10686n().mo10381b();
        if (c4492da.m10509c()) {
            if (c4492da.m10508b()) {
                c4492da.f23838a.m10834k().f23886B.m10640b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                c4492da.f23838a.m10836s().m10517H("auto", "_cmpx", bundle);
            } else {
                String strM10639a = c4492da.f23838a.m10834k().f23886B.m10639a();
                if (TextUtils.isEmpty(strM10639a)) {
                    c4492da.f23838a.mo10684l().f24419g.m10811a("Cache still valid but referrer not found");
                } else {
                    long jM10610a = ((c4492da.f23838a.m10834k().f23887C.m10610a() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strM10639a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jM10610a);
                    c4492da.f23838a.m10836s().m10517H((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                c4492da.f23838a.m10834k().f23886B.m10640b(null);
            }
            c4492da.f23838a.m10834k().f23887C.m10611b(0L);
        }
    }
}
