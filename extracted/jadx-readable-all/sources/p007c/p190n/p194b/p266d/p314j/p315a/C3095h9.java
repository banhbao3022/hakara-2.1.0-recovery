package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.h9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3095h9 implements InterfaceC3464r8<Object> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3058g9 f14790a;

    public C3095h9(InterfaceC3058g9 interfaceC3058g9) {
        this.f14790a = interfaceC3058g9;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f14790a.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.f14790a.mo5823b();
                    return;
                }
                return;
            }
        }
        C3475rj c3475rj = null;
        try {
            int i = Integer.parseInt(map.get("amount"));
            String str2 = map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                c3475rj = new C3475rj(str2, i);
            }
        } catch (NumberFormatException e) {
            C2622l.m5241D3("Unable to parse reward amount.", e);
        }
        this.f14790a.mo5824v(c3475rj);
    }
}
