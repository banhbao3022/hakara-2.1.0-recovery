package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class r82 extends IOException {
    public r82(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: a */
    public static r82 m8260a() {
        return new r82("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: b */
    public static r82 m8261b() {
        return new r82("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: c */
    public static r82 m8262c() {
        return new r82("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: d */
    public static r82 m8263d() {
        return new r82("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: e */
    public static r82 m8264e() {
        return new r82("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: f */
    public static q82 m8265f() {
        return new q82("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: g */
    public static r82 m8266g() {
        return new r82("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: h */
    public static r82 m8267h() {
        return new r82("Protocol message had invalid UTF-8.");
    }
}
