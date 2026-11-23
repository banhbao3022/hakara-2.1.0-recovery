package p509g1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p483s.Collections4;
import p477d1.p483s.CollectionsJVM;
import p477d1.p483s._Arrays;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.r, reason: use source file name */
/* JADX INFO: compiled from: Dns.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface Dns {

    /* JADX INFO: renamed from: a */
    public static final Dns f30622a;

    /* JADX INFO: renamed from: g1.r$a */
    /* JADX INFO: compiled from: Dns.kt */
    public static final class a {

        /* JADX INFO: renamed from: g1.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Dns.kt */
        public static final class C8546a implements Dns {
            @Override // p509g1.Dns
            /* JADX INFO: renamed from: a */
            public List<InetAddress> mo13642a(String str) throws UnknownHostException {
                Intrinsics2.m13090f(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    Intrinsics2.m13086b(allByName, "InetAddress.getAllByName(hostname)");
                    Intrinsics2.m13089e(allByName, "$this$toList");
                    int length = allByName.length;
                    if (length != 0) {
                        return length != 1 ? _Arrays.m13035i(allByName) : CollectionsJVM.m13036a(allByName[0]);
                    }
                    return Collections4.f29519f;
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException(outline.m1599u("Broken system behaviour for dns lookup of ", str));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        f30622a = new a.C8546a();
    }

    /* JADX INFO: renamed from: a */
    List<InetAddress> mo13642a(String str) throws UnknownHostException;
}
