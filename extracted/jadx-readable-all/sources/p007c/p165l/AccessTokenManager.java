package p007c.p165l;

/* JADX INFO: renamed from: c.l.c, reason: use source file name */
/* JADX INFO: compiled from: AccessTokenManager.java */
/* JADX INFO: loaded from: classes.dex */
public class AccessTokenManager implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AccessToken.b f4513f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AccessTokenManager2 f4514g;

    public AccessTokenManager(AccessTokenManager2 accessTokenManager2, AccessToken.b bVar) {
        this.f4514g = accessTokenManager2;
        this.f4513f = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4514g.m2260b(this.f4513f);
    }
}
