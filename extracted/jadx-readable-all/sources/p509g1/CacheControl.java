package p509g1;

import java.util.concurrent.TimeUnit;
import p477d1.p481d0.Strings5;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;

/* JADX INFO: renamed from: g1.d, reason: use source file name */
/* JADX INFO: compiled from: CacheControl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CacheControl {

    /* JADX INFO: renamed from: a */
    public static final b f29961a = new b(null);

    /* JADX INFO: renamed from: b */
    public final boolean f29962b;

    /* JADX INFO: renamed from: c */
    public final boolean f29963c;

    /* JADX INFO: renamed from: d */
    public final int f29964d;

    /* JADX INFO: renamed from: e */
    public final int f29965e;

    /* JADX INFO: renamed from: f */
    public final boolean f29966f;

    /* JADX INFO: renamed from: g */
    public final boolean f29967g;

    /* JADX INFO: renamed from: h */
    public final boolean f29968h;

    /* JADX INFO: renamed from: i */
    public final int f29969i;

    /* JADX INFO: renamed from: j */
    public final int f29970j;

    /* JADX INFO: renamed from: k */
    public final boolean f29971k;

    /* JADX INFO: renamed from: l */
    public final boolean f29972l;

    /* JADX INFO: renamed from: m */
    public final boolean f29973m;

    /* JADX INFO: renamed from: n */
    public String f29974n;

    /* JADX INFO: renamed from: g1.d$a */
    /* JADX INFO: compiled from: CacheControl.kt */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public boolean f29975a;

        /* JADX INFO: renamed from: b */
        public int f29976b = -1;

        /* JADX INFO: renamed from: c */
        public int f29977c = -1;

        /* JADX INFO: renamed from: d */
        public int f29978d = -1;

        /* JADX INFO: renamed from: e */
        public boolean f29979e;

        /* JADX INFO: renamed from: a */
        public final CacheControl m13322a() {
            return new CacheControl(this.f29975a, false, this.f29976b, -1, false, false, false, this.f29977c, this.f29978d, this.f29979e, false, false, null, null);
        }
    }

    /* JADX INFO: renamed from: g1.d$b */
    /* JADX INFO: compiled from: CacheControl.kt */
    public static final class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public final int m13323a(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (Strings5.m13005o(str2, str.charAt(i), false, 2)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        /* JADX WARN: Code duplicated, block: B:101:0x017d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:15:0x004a  */
        /* JADX WARN: Code duplicated, block: B:17:0x0067  */
        /* JADX WARN: Code duplicated, block: B:37:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:47:0x0106  */
        /* JADX WARN: Code duplicated, block: B:48:0x010d  */
        /* JADX WARN: Code duplicated, block: B:50:0x0116  */
        /* JADX WARN: Code duplicated, block: B:51:0x011b  */
        /* JADX WARN: Code duplicated, block: B:53:0x0123  */
        /* JADX WARN: Code duplicated, block: B:54:0x0126  */
        /* JADX WARN: Code duplicated, block: B:56:0x012e  */
        /* JADX WARN: Code duplicated, block: B:57:0x0131  */
        /* JADX WARN: Code duplicated, block: B:59:0x0139  */
        /* JADX WARN: Code duplicated, block: B:60:0x013d  */
        /* JADX WARN: Code duplicated, block: B:62:0x0145  */
        /* JADX WARN: Code duplicated, block: B:63:0x014e  */
        /* JADX WARN: Code duplicated, block: B:65:0x0156  */
        /* JADX WARN: Code duplicated, block: B:66:0x015c  */
        /* JADX WARN: Code duplicated, block: B:68:0x0165  */
        /* JADX WARN: Code duplicated, block: B:69:0x0168  */
        /* JADX WARN: Code duplicated, block: B:71:0x0170  */
        /* JADX WARN: Code duplicated, block: B:72:0x0173  */
        /* JADX WARN: Code duplicated, block: B:74:0x017b  */
        /* JADX INFO: renamed from: b */
        public final CacheControl m13324b(Headers2 headers2) {
            int i;
            int i2;
            int iM13323a;
            String string;
            int i3;
            int iM13323a2;
            String string2;
            Headers2 headers3 = headers2;
            Intrinsics2.m13090f(headers3, "headers");
            int size = headers2.size();
            boolean z = true;
            int i4 = 0;
            boolean z2 = true;
            String str = null;
            boolean z3 = false;
            boolean z4 = false;
            int iM13385y = -1;
            int iM13385y2 = -1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int iM13385y3 = -1;
            int iM13385y4 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            while (i4 < size) {
                String strM13650f = headers3.m13650f(i4);
                String strM13653m = headers3.m13653m(i4);
                if (StringsJVM.m12989f(strM13650f, "Cache-Control", z)) {
                    if (str == null) {
                        str = strM13653m;
                    }
                    i2 = 0;
                    while (i2 < strM13653m.length()) {
                        iM13323a = m13323a(strM13653m, "=,;", i2);
                        String strSubstring = strM13653m.substring(i2, iM13323a);
                        Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        string = Strings5.m13004G(strSubstring).toString();
                        if (iM13323a != strM13653m.length()) {
                            i3 = size;
                            if (strM13653m.charAt(iM13323a) == ',' && strM13653m.charAt(iM13323a) != ';') {
                                int length = iM13323a + 1;
                                byte[] bArr = Util9.f30070a;
                                Intrinsics2.m13090f(strM13653m, "$this$indexOfNonWhitespace");
                                int length2 = strM13653m.length();
                                while (true) {
                                    if (length >= length2) {
                                        length = strM13653m.length();
                                        break;
                                    }
                                    char cCharAt = strM13653m.charAt(length);
                                    int i5 = length2;
                                    if (cCharAt != ' ' && cCharAt != '\t') {
                                        break;
                                    }
                                    length++;
                                    length2 = i5;
                                }
                                if (length >= strM13653m.length() || strM13653m.charAt(length) != '\"') {
                                    iM13323a2 = m13323a(strM13653m, ",;", length);
                                    String strSubstring2 = strM13653m.substring(length, iM13323a2);
                                    Intrinsics2.m13086b(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    string2 = Strings5.m13004G(strSubstring2).toString();
                                } else {
                                    int i6 = length + 1;
                                    int iM13011u = Strings5.m13011u(strM13653m, '\"', i6, false, 4);
                                    string2 = strM13653m.substring(i6, iM13011u);
                                    Intrinsics2.m13086b(string2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    iM13323a2 = iM13011u + 1;
                                }
                            }
                            z = true;
                            if (StringsJVM.m12989f("no-cache", string, true)) {
                                z3 = true;
                            } else if (StringsJVM.m12989f("no-store", string, true)) {
                                z4 = true;
                            } else if (StringsJVM.m12989f("max-age", string, true)) {
                                iM13385y = Util9.m13385y(string2, -1);
                            } else if (StringsJVM.m12989f("s-maxage", string, true)) {
                                iM13385y2 = Util9.m13385y(string2, -1);
                            } else if (StringsJVM.m12989f("private", string, true)) {
                                z5 = true;
                            } else if (StringsJVM.m12989f("public", string, true)) {
                                z6 = true;
                            } else if (StringsJVM.m12989f("must-revalidate", string, true)) {
                                z7 = true;
                            } else if (StringsJVM.m12989f("max-stale", string, true)) {
                                iM13385y3 = Util9.m13385y(string2, Integer.MAX_VALUE);
                            } else if (StringsJVM.m12989f("min-fresh", string, true)) {
                                iM13385y4 = Util9.m13385y(string2, -1);
                            } else if (StringsJVM.m12989f("only-if-cached", string, true)) {
                                z8 = true;
                            } else if (StringsJVM.m12989f("no-transform", string, true)) {
                                z9 = true;
                            } else if (StringsJVM.m12989f("immutable", string, true)) {
                                z10 = true;
                            }
                            i2 = iM13323a2;
                            size = i3;
                            str = str;
                        } else {
                            i3 = size;
                        }
                        iM13323a2 = iM13323a + 1;
                        string2 = null;
                        z = true;
                        if (StringsJVM.m12989f("no-cache", string, true)) {
                            z3 = true;
                        } else if (StringsJVM.m12989f("no-store", string, true)) {
                            z4 = true;
                        } else if (StringsJVM.m12989f("max-age", string, true)) {
                            iM13385y = Util9.m13385y(string2, -1);
                        } else if (StringsJVM.m12989f("s-maxage", string, true)) {
                            iM13385y2 = Util9.m13385y(string2, -1);
                        } else if (StringsJVM.m12989f("private", string, true)) {
                            z5 = true;
                        } else if (StringsJVM.m12989f("public", string, true)) {
                            z6 = true;
                        } else if (StringsJVM.m12989f("must-revalidate", string, true)) {
                            z7 = true;
                        } else if (StringsJVM.m12989f("max-stale", string, true)) {
                            iM13385y3 = Util9.m13385y(string2, Integer.MAX_VALUE);
                        } else if (StringsJVM.m12989f("min-fresh", string, true)) {
                            iM13385y4 = Util9.m13385y(string2, -1);
                        } else if (StringsJVM.m12989f("only-if-cached", string, true)) {
                            z8 = true;
                        } else if (StringsJVM.m12989f("no-transform", string, true)) {
                            z9 = true;
                        } else if (StringsJVM.m12989f("immutable", string, true)) {
                            z10 = true;
                        }
                        i2 = iM13323a2;
                        size = i3;
                        str = str;
                    }
                    i = size;
                    i4++;
                    headers3 = headers2;
                    size = i;
                } else {
                    if (!StringsJVM.m12989f(strM13650f, "Pragma", z)) {
                        i = size;
                    }
                    i4++;
                    headers3 = headers2;
                    size = i;
                }
                z2 = false;
                i2 = 0;
                while (i2 < strM13653m.length()) {
                    iM13323a = m13323a(strM13653m, "=,;", i2);
                    String strSubstring3 = strM13653m.substring(i2, iM13323a);
                    Intrinsics2.m13086b(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    string = Strings5.m13004G(strSubstring3).toString();
                    if (iM13323a != strM13653m.length()) {
                        i3 = size;
                        if (strM13653m.charAt(iM13323a) == ',') {
                        }
                        z = true;
                        if (StringsJVM.m12989f("no-cache", string, true)) {
                            z3 = true;
                        } else if (StringsJVM.m12989f("no-store", string, true)) {
                            z4 = true;
                        } else if (StringsJVM.m12989f("max-age", string, true)) {
                            iM13385y = Util9.m13385y(string2, -1);
                        } else if (StringsJVM.m12989f("s-maxage", string, true)) {
                            iM13385y2 = Util9.m13385y(string2, -1);
                        } else if (StringsJVM.m12989f("private", string, true)) {
                            z5 = true;
                        } else if (StringsJVM.m12989f("public", string, true)) {
                            z6 = true;
                        } else if (StringsJVM.m12989f("must-revalidate", string, true)) {
                            z7 = true;
                        } else if (StringsJVM.m12989f("max-stale", string, true)) {
                            iM13385y3 = Util9.m13385y(string2, Integer.MAX_VALUE);
                        } else if (StringsJVM.m12989f("min-fresh", string, true)) {
                            iM13385y4 = Util9.m13385y(string2, -1);
                        } else if (StringsJVM.m12989f("only-if-cached", string, true)) {
                            z8 = true;
                        } else if (StringsJVM.m12989f("no-transform", string, true)) {
                            z9 = true;
                        } else if (StringsJVM.m12989f("immutable", string, true)) {
                            z10 = true;
                        }
                        i2 = iM13323a2;
                        size = i3;
                        str = str;
                    } else {
                        i3 = size;
                    }
                    iM13323a2 = iM13323a + 1;
                    string2 = null;
                    z = true;
                    if (StringsJVM.m12989f("no-cache", string, true)) {
                        z3 = true;
                    } else if (StringsJVM.m12989f("no-store", string, true)) {
                        z4 = true;
                    } else if (StringsJVM.m12989f("max-age", string, true)) {
                        iM13385y = Util9.m13385y(string2, -1);
                    } else if (StringsJVM.m12989f("s-maxage", string, true)) {
                        iM13385y2 = Util9.m13385y(string2, -1);
                    } else if (StringsJVM.m12989f("private", string, true)) {
                        z5 = true;
                    } else if (StringsJVM.m12989f("public", string, true)) {
                        z6 = true;
                    } else if (StringsJVM.m12989f("must-revalidate", string, true)) {
                        z7 = true;
                    } else if (StringsJVM.m12989f("max-stale", string, true)) {
                        iM13385y3 = Util9.m13385y(string2, Integer.MAX_VALUE);
                    } else if (StringsJVM.m12989f("min-fresh", string, true)) {
                        iM13385y4 = Util9.m13385y(string2, -1);
                    } else if (StringsJVM.m12989f("only-if-cached", string, true)) {
                        z8 = true;
                    } else if (StringsJVM.m12989f("no-transform", string, true)) {
                        z9 = true;
                    } else if (StringsJVM.m12989f("immutable", string, true)) {
                        z10 = true;
                    }
                    i2 = iM13323a2;
                    size = i3;
                    str = str;
                }
                i = size;
                i4++;
                headers3 = headers2;
                size = i;
            }
            return new CacheControl(z3, z4, iM13385y, iM13385y2, z5, z6, z7, iM13385y3, iM13385y4, z8, z9, z10, !z2 ? null : str, null);
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        a aVar = new a();
        aVar.f29975a = true;
        aVar.m13322a();
        a aVar2 = new a();
        aVar2.f29979e = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics2.m13090f(timeUnit, "timeUnit");
        long j2 = Integer.MAX_VALUE;
        long seconds = timeUnit.toSeconds(j2);
        aVar2.f29977c = seconds <= j2 ? (int) seconds : Integer.MAX_VALUE;
        aVar2.m13322a();
    }

    public CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f29962b = z;
        this.f29963c = z2;
        this.f29964d = i;
        this.f29965e = i2;
        this.f29966f = z3;
        this.f29967g = z4;
        this.f29968h = z5;
        this.f29969i = i3;
        this.f29970j = i4;
        this.f29971k = z6;
        this.f29972l = z7;
        this.f29973m = z8;
        this.f29974n = str;
    }

    public String toString() {
        String str = this.f29974n;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f29962b) {
            sb.append("no-cache, ");
        }
        if (this.f29963c) {
            sb.append("no-store, ");
        }
        if (this.f29964d != -1) {
            sb.append("max-age=");
            sb.append(this.f29964d);
            sb.append(", ");
        }
        if (this.f29965e != -1) {
            sb.append("s-maxage=");
            sb.append(this.f29965e);
            sb.append(", ");
        }
        if (this.f29966f) {
            sb.append("private, ");
        }
        if (this.f29967g) {
            sb.append("public, ");
        }
        if (this.f29968h) {
            sb.append("must-revalidate, ");
        }
        if (this.f29969i != -1) {
            sb.append("max-stale=");
            sb.append(this.f29969i);
            sb.append(", ");
        }
        if (this.f29970j != -1) {
            sb.append("min-fresh=");
            sb.append(this.f29970j);
            sb.append(", ");
        }
        if (this.f29971k) {
            sb.append("only-if-cached, ");
        }
        if (this.f29972l) {
            sb.append("no-transform, ");
        }
        if (this.f29973m) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        Intrinsics2.m13086b(string, "StringBuilder().apply(builderAction).toString()");
        this.f29974n = string;
        return string;
    }
}
