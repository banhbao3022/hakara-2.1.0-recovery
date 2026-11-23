package p007c.p165l.p182l0;

import android.content.Intent;
import p007c.p165l.p178k0.CallbackManagerImpl;

/* JADX INFO: renamed from: c.l.l0.s, reason: use source file name */
/* JADX INFO: compiled from: LoginManager.java */
/* JADX INFO: loaded from: classes.dex */
public class LoginManager3 implements CallbackManagerImpl.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LoginManager4 f5157a;

    public LoginManager3(LoginManager4 loginManager4) {
        this.f5157a = loginManager4;
    }

    @Override // p007c.p165l.p178k0.CallbackManagerImpl.a
    /* JADX INFO: renamed from: a */
    public boolean mo2427a(int i, Intent intent) {
        this.f5157a.m2594d(i, intent, null);
        return true;
    }
}
