package p007c.p165l.p166h0;

/* JADX INFO: renamed from: c.l.h0.z, reason: use source file name */
/* JADX INFO: compiled from: UserDataStore.java */
/* JADX INFO: loaded from: classes.dex */
public final class UserDataStore2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f4863f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f4864g;

    public UserDataStore2(String str, String str2) {
        this.f4863f = str;
        this.f4864g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!UserDataStore.f4591c.get()) {
            UserDataStore.m2279a();
        }
        UserDataStore.f4590b.edit().putString(this.f4863f, this.f4864g).apply();
    }
}
