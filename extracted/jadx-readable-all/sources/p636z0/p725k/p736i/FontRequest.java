package p636z0.p725k.p736i;

import android.util.Base64;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.k.i.e, reason: use source file name */
/* JADX INFO: compiled from: FontRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class FontRequest {

    /* JADX INFO: renamed from: a */
    public final String f37902a;

    /* JADX INFO: renamed from: b */
    public final String f37903b;

    /* JADX INFO: renamed from: c */
    public final String f37904c;

    /* JADX INFO: renamed from: d */
    public final List<List<byte[]>> f37905d;

    /* JADX INFO: renamed from: e */
    public final int f37906e;

    /* JADX INFO: renamed from: f */
    public final String f37907f;

    public FontRequest(String str, String str2, String str3, List<List<byte[]>> list) {
        Objects.requireNonNull(str);
        this.f37902a = str;
        Objects.requireNonNull(str2);
        this.f37903b = str2;
        Objects.requireNonNull(str3);
        this.f37904c = str3;
        Objects.requireNonNull(list);
        this.f37905d = list;
        this.f37906e = 0;
        this.f37907f = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbM1556G = outline.m1556G("FontRequest {mProviderAuthority: ");
        sbM1556G.append(this.f37902a);
        sbM1556G.append(", mProviderPackage: ");
        sbM1556G.append(this.f37903b);
        sbM1556G.append(", mQuery: ");
        sbM1556G.append(this.f37904c);
        sbM1556G.append(", mCertificates:");
        sb.append(sbM1556G.toString());
        for (int i = 0; i < this.f37905d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f37905d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f37906e);
        return sb.toString();
    }

    public FontRequest(String str, String str2, String str3, int i) {
        Objects.requireNonNull(str);
        this.f37902a = str;
        Objects.requireNonNull(str2);
        this.f37903b = str2;
        Objects.requireNonNull(str3);
        this.f37904c = str3;
        this.f37905d = null;
        C8162a.m16060e(i != 0);
        this.f37906e = i;
        this.f37907f = str + "-" + str2 + "-" + str3;
    }
}
