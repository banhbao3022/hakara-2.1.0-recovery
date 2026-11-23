package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.n.b.d.j.a.lc */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3246lc implements InterfaceC3172jc {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3172jc f16314a = new C3246lc();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3172jc
    /* JADX INFO: renamed from: u */
    public final Object mo6859u(JSONObject jSONObject) {
        Charset charset = C3357oc.f17592a;
        return new ByteArrayInputStream(jSONObject.toString().getBytes(C3357oc.f17592a));
    }
}
