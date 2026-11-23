package p007c.p165l;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.l.i, reason: use source file name */
/* JADX INFO: compiled from: FacebookDialogException.java */
/* JADX INFO: loaded from: classes.dex */
public class FacebookDialogException extends FacebookException {

    /* JADX INFO: renamed from: f */
    public int f4865f;

    /* JADX INFO: renamed from: g */
    public String f4866g;

    public FacebookDialogException(String str, int i, String str2) {
        super(str);
        this.f4865f = i;
        this.f4866g = str2;
    }

    @Override // p007c.p165l.FacebookException, java.lang.Throwable
    public final String toString() {
        StringBuilder sbM1561L = outline.m1561L("{FacebookDialogException: ", "errorCode: ");
        sbM1561L.append(this.f4865f);
        sbM1561L.append(", message: ");
        sbM1561L.append(getMessage());
        sbM1561L.append(", url: ");
        return outline.m1550A(sbM1561L, this.f4866g, "}");
    }
}
