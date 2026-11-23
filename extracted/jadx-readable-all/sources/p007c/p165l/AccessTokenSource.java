package p007c.p165l;

/* JADX INFO: renamed from: c.l.e, reason: use source file name */
/* JADX INFO: compiled from: AccessTokenSource.java */
/* JADX INFO: loaded from: classes.dex */
public enum AccessTokenSource {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true);


    /* JADX INFO: renamed from: p */
    public final boolean f4562p;

    AccessTokenSource(boolean z) {
        this.f4562p = z;
    }
}
