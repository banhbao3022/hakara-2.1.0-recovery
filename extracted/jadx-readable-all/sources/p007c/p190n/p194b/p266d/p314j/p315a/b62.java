package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class b62 extends ThreadLocal<Mac> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c62 f12533a;

    public b62(c62 c62Var) {
        this.f12533a = c62Var;
    }

    @Override // java.lang.ThreadLocal
    public final Mac initialValue() {
        try {
            Mac macM8079a = p52.f17857d.m8079a(this.f12533a.f12946b);
            macM8079a.init(this.f12533a.f12947c);
            return macM8079a;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
