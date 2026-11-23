package p007c.p165l.p182l0;

import android.content.Intent;
import p007c.p165l.FacebookCallback;
import p007c.p165l.p178k0.CallbackManagerImpl;

/* JADX INFO: renamed from: c.l.l0.q, reason: use source file name */
/* JADX INFO: compiled from: LoginManager.java */
/* JADX INFO: loaded from: classes.dex */
public class LoginManager implements CallbackManagerImpl.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FacebookCallback f5155a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LoginManager4 f5156b;

    public LoginManager(LoginManager4 loginManager4, FacebookCallback facebookCallback) {
        this.f5156b = loginManager4;
        this.f5155a = facebookCallback;
    }

    @Override // p007c.p165l.p178k0.CallbackManagerImpl.a
    /* JADX INFO: renamed from: a */
    public boolean mo2427a(int i, Intent intent) {
        this.f5156b.m2594d(i, intent, this.f5155a);
        return true;
    }
}
