package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.a.cy */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2935cy implements InterfaceC3712xx {

    /* JADX INFO: renamed from: a */
    public final br0 f13150a;

    public C2935cy(br0 br0Var) {
        this.f13150a = br0Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3712xx
    /* JADX INFO: renamed from: a */
    public final void mo6122a(Map<String, String> map) {
        byte b;
        String str = map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str.equals("flick")) {
            b = 1;
        } else {
            b = -1;
        }
        if (b == 0) {
            this.f13150a.m6076e(yq0.SHAKE, true);
        } else if (b != 1) {
            this.f13150a.m6076e(yq0.NONE, true);
        } else {
            this.f13150a.m6076e(yq0.FLICK, true);
        }
    }
}
