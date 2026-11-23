package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ik0 implements InterfaceC3464r8<Object> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3425q6 f15256a;

    /* JADX INFO: renamed from: b */
    public final vk0 f15257b;

    /* JADX INFO: renamed from: c */
    public final vc2<dk0> f15258c;

    public ik0(mg0 mg0Var, bg0 bg0Var, vk0 vk0Var, vc2<dk0> vc2Var) {
        this.f15256a = mg0Var.m7697a(bg0Var.m6002h());
        this.f15257b = vk0Var;
        this.f15258c = vc2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.f15256a.mo7660s6(this.f15258c.m8545a(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            C2622l.m5241D3(sb.toString(), e);
        }
    }
}
