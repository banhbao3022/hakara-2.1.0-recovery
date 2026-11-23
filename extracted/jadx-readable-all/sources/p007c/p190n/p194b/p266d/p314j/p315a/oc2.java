package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class oc2 extends tc2 {

    /* JADX INFO: renamed from: a */
    public final String f17596a;

    public oc2(String str) {
        this.f17596a = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tc2
    /* JADX INFO: renamed from: a */
    public final void mo7995a(String str) {
        String str2 = this.f17596a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
