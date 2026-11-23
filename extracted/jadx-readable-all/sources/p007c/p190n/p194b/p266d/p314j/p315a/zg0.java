package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zg0 implements InterfaceC3128i5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wh0 f22270a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f22271b;

    public zg0(wh0 wh0Var, ViewGroup viewGroup) {
        this.f22270a = wh0Var;
        this.f22271b = viewGroup;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3128i5
    /* JADX INFO: renamed from: a */
    public final void mo6198a(MotionEvent motionEvent) {
        this.f22270a.onTouch(null, motionEvent);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3128i5
    /* JADX INFO: renamed from: b */
    public final JSONObject mo6199b() {
        return this.f22270a.mo8495n();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3128i5
    public final void zza() {
        wh0 wh0Var = this.f22270a;
        ts1<String> ts1Var = wg0.f21081f;
        Map<String, WeakReference<View>> mapMo8494k = wh0Var.mo8494k();
        if (mapMo8494k == null) {
            return;
        }
        int size = ts1Var.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (mapMo8494k.get(ts1Var.get(i)) != null) {
                this.f22270a.onClick(this.f22271b);
                return;
            }
            i = i2;
        }
    }
}
