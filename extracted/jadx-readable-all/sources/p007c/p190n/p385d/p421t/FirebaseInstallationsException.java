package p007c.p190n.p385d.p421t;

import p007c.p190n.p385d.C5227h;

/* JADX INFO: renamed from: c.n.d.t.h, reason: use source file name */
/* JADX INFO: compiled from: FirebaseInstallationsException.java */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsException extends C5227h {

    /* JADX INFO: renamed from: c.n.d.t.h$a */
    /* JADX INFO: compiled from: FirebaseInstallationsException.java */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(a aVar) {
    }

    public FirebaseInstallationsException(String str, a aVar) {
        super(str);
    }

    public FirebaseInstallationsException(String str, a aVar, Throwable th) {
        super(str, th);
    }
}
