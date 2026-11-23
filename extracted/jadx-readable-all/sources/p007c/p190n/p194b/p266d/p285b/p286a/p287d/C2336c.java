package p007c.p190n.p194b.p266d.p285b.p286a.p287d;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2336c implements InterfaceC2638k {

    /* JADX INFO: renamed from: f */
    public Status f10930f;

    /* JADX INFO: renamed from: g */
    public GoogleSignInAccount f10931g;

    public C2336c(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f10931g = googleSignInAccount;
        this.f10930f = status;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k
    /* JADX INFO: renamed from: B */
    public Status mo4909B() {
        return this.f10930f;
    }
}
