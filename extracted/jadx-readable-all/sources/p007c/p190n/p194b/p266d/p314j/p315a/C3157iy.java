package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.a.iy */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3157iy implements InterfaceC3712xx {

    /* JADX INFO: renamed from: a */
    public final br0 f15416a;

    public C3157iy(br0 br0Var) {
        this.f15416a = br0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3712xx
    /* JADX INFO: renamed from: a */
    public final void mo6122a(Map<String, String> map) {
        String str = map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f15416a.m6073b(str.equals("true"));
    }
}
