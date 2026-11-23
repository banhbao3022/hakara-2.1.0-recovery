package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.us */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3595us implements dv1<Map<String, String>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f20419a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f20420b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Uri f20421c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3670ws f20422d;

    public C3595us(C3670ws c3670ws, List list, String str, Uri uri) {
        this.f20422d = c3670ws;
        this.f20419a = list;
        this.f20420b = str;
        this.f20421c = uri;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        String strValueOf = String.valueOf(this.f20421c);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 33);
        sb.append("Failed to parse gmsg params for: ");
        sb.append(strValueOf);
        C2622l.m5226A3(sb.toString());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo4617b(Map<String, String> map) {
        this.f20422d.m8679f(map, this.f20419a, this.f20420b);
    }
}
