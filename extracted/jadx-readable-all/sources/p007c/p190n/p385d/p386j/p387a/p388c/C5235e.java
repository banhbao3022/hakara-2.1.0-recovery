package p007c.p190n.p385d.p386j.p387a.p388c;

import android.os.Bundle;
import java.util.Set;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p327k.p328a.C4444a;
import p007c.p190n.p194b.p266d.p327k.p329b.C4719x5;
import p007c.p190n.p385d.p391l.CrashlyticsAnalyticsListener;

/* JADX INFO: renamed from: c.n.d.j.a.c.e */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5235e implements C4444a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5232b f26343a;

    public C5235e(C5232b c5232b) {
        this.f26343a = c5232b;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4464b6
    /* JADX INFO: renamed from: a */
    public final void mo10409a(String str, String str2, Bundle bundle, long j2) {
        if (this.f26343a.f26330a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            Set<String> set = C5233c.f26334a;
            String strM10212i = C4340s8.m10212i(str2, C4719x5.f24579c, C4719x5.f24577a);
            if (strM10212i != null) {
                str2 = strM10212i;
            }
            bundle2.putString("events", str2);
            ((CrashlyticsAnalyticsListener) this.f26343a.f26331b).m11703a(2, bundle2);
        }
    }
}
