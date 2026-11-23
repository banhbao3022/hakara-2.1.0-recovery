package p509g1.p510j0.p515h;

import java.io.IOException;
import java.net.ProtocolException;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.Protocol;

/* JADX INFO: renamed from: g1.j0.h.j, reason: use source file name */
/* JADX INFO: compiled from: StatusLine.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StatusLine {

    /* JADX INFO: renamed from: a */
    public static final a f30300a = new a(null);

    /* JADX INFO: renamed from: b */
    public final Protocol f30301b;

    /* JADX INFO: renamed from: c */
    public final int f30302c;

    /* JADX INFO: renamed from: d */
    public final String f30303d;

    /* JADX INFO: renamed from: g1.j0.h.j$a */
    /* JADX INFO: compiled from: StatusLine.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final StatusLine m13498a(String str) throws IOException {
            Protocol protocol;
            String strSubstring;
            Intrinsics2.m13090f(str, "statusLine");
            int i = 9;
            if (StringsJVM.m12997n(str, "HTTP/1.", false, 2)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(outline.m1599u("Unexpected status line: ", str));
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException(outline.m1599u("Unexpected status line: ", str));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!StringsJVM.m12997n(str, "ICY ", false, 2)) {
                    throw new ProtocolException(outline.m1599u("Unexpected status line: ", str));
                }
                protocol = Protocol.HTTP_1_0;
                i = 4;
            }
            int i2 = i + 3;
            if (str.length() < i2) {
                throw new ProtocolException(outline.m1599u("Unexpected status line: ", str));
            }
            try {
                String strSubstring2 = str.substring(i, i2);
                Intrinsics2.m13086b(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int i3 = Integer.parseInt(strSubstring2);
                if (str.length() <= i2) {
                    strSubstring = "";
                } else {
                    if (str.charAt(i2) != ' ') {
                        throw new ProtocolException(outline.m1599u("Unexpected status line: ", str));
                    }
                    strSubstring = str.substring(i + 4);
                    Intrinsics2.m13086b(strSubstring, "(this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, i3, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(outline.m1599u("Unexpected status line: ", str));
            }
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public StatusLine(Protocol protocol, int i, String str) {
        Intrinsics2.m13090f(protocol, "protocol");
        Intrinsics2.m13090f(str, "message");
        this.f30301b = protocol;
        this.f30302c = i;
        this.f30303d = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f30301b == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f30302c);
        sb.append(' ');
        sb.append(this.f30303d);
        String string = sb.toString();
        Intrinsics2.m13086b(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
