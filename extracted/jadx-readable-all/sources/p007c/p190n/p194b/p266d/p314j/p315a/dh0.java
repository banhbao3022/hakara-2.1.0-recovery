package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dh0 implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final vk0 f13266f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2782b f13267g;

    /* JADX INFO: renamed from: h */
    public InterfaceC3019f7 f13268h;

    /* JADX INFO: renamed from: i */
    public InterfaceC3464r8<Object> f13269i;

    /* JADX INFO: renamed from: j */
    public String f13270j;

    /* JADX INFO: renamed from: k */
    public Long f13271k;

    /* JADX INFO: renamed from: l */
    public WeakReference<View> f13272l;

    public dh0(vk0 vk0Var, InterfaceC2782b interfaceC2782b) {
        this.f13266f = vk0Var;
        this.f13267g = interfaceC2782b;
    }

    /* JADX INFO: renamed from: a */
    public final void m6358a() {
        View view;
        this.f13270j = null;
        this.f13271k = null;
        WeakReference<View> weakReference = this.f13272l;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f13272l = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference<View> weakReference = this.f13272l;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f13270j != null && this.f13271k != null) {
            HashMap map = new HashMap();
            map.put("id", this.f13270j);
            map.put("time_interval", String.valueOf(this.f13267g.mo5623c() - this.f13271k.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f13266f.m8564d("sendMessageToNativeJs", map);
        }
        m6358a();
    }
}
