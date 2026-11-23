package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;

/* JADX INFO: renamed from: c.n.b.d.j.k.l5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C4239l5 extends IOException {
    public C4239l5(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: a */
    public static C4239l5 m9995a() {
        return new C4239l5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: b */
    public static C4239l5 m9996b() {
        return new C4239l5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: c */
    public static C4239l5 m9997c() {
        return new C4239l5("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: d */
    public static C4239l5 m9998d() {
        return new C4239l5("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: e */
    public static C4239l5 m9999e() {
        return new C4239l5("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: f */
    public static C4225k5 m10000f() {
        return new C4225k5("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: g */
    public static C4239l5 m10001g() {
        return new C4239l5("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: h */
    public static C4239l5 m10002h() {
        return new C4239l5("Protocol message had invalid UTF-8.");
    }
}
